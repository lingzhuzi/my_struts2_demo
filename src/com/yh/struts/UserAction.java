package com.yh.struts;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String list(){
		return "list";
	}
	
	public String create(){
		return "create";
	}
	
	public String update(){
		return "update";
	}
}
