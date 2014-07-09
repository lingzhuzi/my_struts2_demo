package com.yh.struts;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {
	private String msg;

	public String execute() {
		System.out.println(SUCCESS);
		return SUCCESS;
	}

	public void validate() {
		if (!msg.equalsIgnoreCase("hello")) {
			System.out.println(INPUT);
			this.addFieldError("msg.hello", "必须输入hello!");
			this.addActionError("处理动作失败!");
		} else {
			this.addActionMessage("提交成功");
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
