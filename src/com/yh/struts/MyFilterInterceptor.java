package com.yh.struts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyFilterInterceptor extends MethodFilterInterceptor {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("doIntercept");
		System.out.println(name);
		return invocation.invoke();
	}

}
