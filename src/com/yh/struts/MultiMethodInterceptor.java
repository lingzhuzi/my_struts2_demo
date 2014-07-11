package com.yh.struts;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class MultiMethodInterceptor extends ActionInterceptor {
	public String test() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.getWriter().println("invoke test");
		return this.INVOKE;
	}

	public String print() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.getWriter().println("invoke print");
		return null;
	}
}
