package com.yh.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

public class MoreSubmitAction extends ActionSupport implements ServletRequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4130254917940647903L;
	private String msg;
	private HttpServletRequest request;// 获得HttpServletRequest对象

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	// 处理save submit按钮的动作
	public String save() throws Exception {
		System.out.println(msg);
		request.setAttribute("result", "成功保存[" + msg + "]");
		return "save";
	}

	// 处理print submit按钮的动作
	public String print() throws Exception {
		request.setAttribute("result", "成功打印[" + msg + "]");
		return "print";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
