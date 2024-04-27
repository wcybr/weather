<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
</head>
<body>
<div>
<label style="color: red;">${msg}</label>
<form action="moneyadd" method="post">
	<br/>
	<label>id：</label><input name="id"><br/><br/>
	<label>姓名：</label><input name="name"><br/><br/>
	<label>钱：</label><input name="money"><br/><br/>
		<label>序号：</label><input name="xid"><br/><br/>
	<input type="submit" value="注册">
</form>
</div>
</body>
</html>