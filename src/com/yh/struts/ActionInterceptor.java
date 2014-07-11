package com.yh.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ActionInterceptor implements Interceptor {
	protected final String INVOKE = "##invoke";

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() {
		System.out.println("init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String action = request.getParameter("action");
		System.out.println(this.hashCode());
		if (action != null) {
			try {
				java.lang.reflect.Method method = this.getClass().getMethod(action);
				String result = (String) method.invoke(this);
				if (result != null) {
					if (!result.equals(INVOKE))
						return result;
				} else {
					return null;
				}
			} catch (Exception e) {
			}
		}
		return invocation.invoke();
	}

}
