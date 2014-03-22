<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
</head>
<body>
	<h1>注册</h1>
	<hr>
	<form name="registForm" method="get" action="addUser.do">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="userName" name="userName"></td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><input type="password" id="pwd" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定"></td>
				<td><input type="button" value="取消"></td>
			</tr>
		</table>
	</form>
</body>
</html>