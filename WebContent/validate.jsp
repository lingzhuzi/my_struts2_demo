<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@taglib
	prefix="s" uri="/struts-tags"%><html>
<head>
<title>验证数据</title>
</head>
<body>
	<s:actionerror />
	<s:actionmessage />
	<s:form action="validate.action" theme="simple">输入内容：
	    <s:textfield name="msg" />
		<s:fielderror key="msg.hello" />
		<br />
		<s:submit />
	</s:form>
</body>
</html>