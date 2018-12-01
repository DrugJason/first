<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入页面</title>
</head>
<body>
	${mgs}
	<form action="login" method="post">
		账号:<input type="text" name="username">
		<br>
		密码:<input type="password" name="password">
		<br>
		<input type="submit" value="提交">
	</form>
	<form action="register.jsp" method="post">
		<input type="submit" value="注册">
	</form>
</body>
</html>