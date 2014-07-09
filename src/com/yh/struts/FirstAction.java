package com.yh.struts;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8965829192788653927L;
	private int operand1;
	private int operand2;

	public String execute() throws Exception {
		if (getSum() >= 0) {// 如果代码数和是非负整数，跳到positive.jsp页面
			return "positive";
		} else {// 如果代码数和是负整数，跳到negative.jsp页面

			return "negative";
		}
	}

	public int getSum() {
		return operand1 + operand2;
	}

	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
}
