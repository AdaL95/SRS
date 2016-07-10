<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
<style type="text/css">
	form { width: 300px; margin: 100px auto; }
</style>
</head>
<body>

<form method="get" action="../login1">
		<p>
		    <h1>学生登录</h1>
		</p>
		<p>
			<label for="ssn">ssn:</label>
			<input type="text" name="ssn" id="ssn" />
		</p>
		<p>
			<label for="password">密&emsp;码:</label>
			<input type="password" name="password" id="password" />
		</p>
		<p>
			<input type="submit" value="登录" />
		</p>
	</form>
	
</body>
</html>