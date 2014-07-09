package com.yh.struts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String password;
	private String msg; // 结果信息属性

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the user Name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 处理用户请求的login()方法
	 * 
	 * @return 结果导航字符串
	 * @throws Exception
	 */
	public String login() throws Exception {
		if ("test".equals(this.userName) && "test".equals(this.password)) {
			msg = "登录成功，欢迎" + this.userName;

			// 获取ActionContext实例，通过它来访问Servlet API
			ActionContext context = ActionContext.getContext(); // 看session中是否已经存放了用户名，如果存放了：说明已经登录了；
																// //否则说明是第一次登录成功
			if (null != context.getSession().get("uName")) {
				msg = this.userName + "：你已经登录过了!!!";
			} else {
				context.getSession().put("uName", this.userName);
			}
			return this.SUCCESS;
		} else {
			msg = "登录失败，用户名或密码错";
			return this.ERROR;
		}
	}

	public String regist() throws Exception { // 将用户名，密码添加到数据库中 //...
		msg = "注册成功。";
		return this.SUCCESS;
	}
}
