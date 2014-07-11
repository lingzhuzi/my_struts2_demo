<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>验证数据</title>
<link rel="stylesheet" type="text/css" href="<s:url value='/styles/styles.css'/>"/>
</head>
<body>
	<s:form action="new_validate" namespace="/">
		<s:textfield name="msg" label="姓名" />
		<s:textfield name="age" label="年龄" />
		<s:textfield name="user.name" label="姓名1" />
		<s:textfield name="user.age" label="年龄1" />
		<s:submit />
	</s:form>
</body>
</html>