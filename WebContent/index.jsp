<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>结果</title>
</head>
<body>
	<ul>
	<li><a href="more_submit.jsp">动态方法调用（需开启开关，官方不推荐这种用法）</a></li>
	<li><a href="login.jsp">逻辑定义1: login</a></li>
	<li><a href="regist.jsp">逻辑定义2: regist</a></li>
	<li><a href="create_user">通配符1: create_user（需关闭开关，推荐）</a></li>
	<li><a href="list_user">通配符2: list_user</a></li>
	<li><a href="update_user">通配符3: update_user</a></li>
	<li><a href="validate.jsp">验证</a></li>
	<li><a href="validate/validate_form.jsp">使用验证框架</a></li>
	<li><a href="upload/upload.jsp">上传文件</a></li>
	<li><a href="interceptor_test">拦截器</a></li>
	</ul>
</body>
</html>