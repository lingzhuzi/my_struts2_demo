<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>上传单个文件</title>
</head>
<body>
	<s:fielderror name="upload"/>
	<s:form action="upload" namespace="/" enctype="multipart/form-data" method="post">
		<s:file name="upload" label="输入要上传的文件名" />
		<s:submit value="上传" />
	</s:form>
</body>
</html>