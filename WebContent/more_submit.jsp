<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>MyJSP 'hello.jsp' starting page</title>
</head>
<body>
	<s:form action="submit" method="post" namespace="/">
		<s:textfield name="msg" label="输入内容" />
		<s:submit name="save" value="保存" align="left" method="save" />
		<s:submit name="print" value="打印" align="left" method="print" />
	</s:form>
</body>
</html>