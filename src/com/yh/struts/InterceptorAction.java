package com.yh.struts;

import com.opensymphony.xwork2.ActionSupport;

public class InterceptorAction extends ActionSupport {

	public String execute() throws Exception {
		System.out.println("execute");
		return "success";
	}

	public String abcd() throws Exception {
		System.out.println("abcd");
		return "success";
	}
}
