package com.yh.struts;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File upload;
	private String fileName;
	private String uploadContentType;
	private String msg;

	public String execute() throws Exception {
		String root = ServletActionContext.getServletContext().getRealPath("/");
		String filePath = root + "/upload_files/" + fileName;
		System.out.println("web root is :" + root);
		java.io.InputStream is = new java.io.FileInputStream(upload);
		java.io.OutputStream os = new java.io.FileOutputStream(filePath);
		byte buffer[] = new byte[8192];
		int count = 0;
		while ((count = is.read(buffer)) > 0) {
			os.write(buffer, 0, count);
		}
		os.close();
		is.close();
		msg = "上传成功！文件名：" + fileName + ", 文件类型：" + uploadContentType + ", 文件路径：" + filePath;
		return SUCCESS;
	}

	public String getUploadFileName() {
		return fileName;
	}

	public void setUploadFileName(String fileName) {
		this.fileName = fileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
