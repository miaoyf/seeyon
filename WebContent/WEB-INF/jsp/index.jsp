<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
h1>欢迎使用测试系统</h1>
<form name="loginForm" method="get" action="login.do">
<table>
<tr><td>用户名：</td><td><input type="text" id="userName" name="userName"></td></tr>
<tr><td>密码：</td><td><input type="password" id="pwd" name="pwd"></td></tr>
<tr><td><input type="submit" value="登录"></td><td><input type="reset" value="重置" ></td></tr>
</table>
<a href="../WEB-INF/jsp/regist.jsp">注册</a>
</form>
</body>
</html>