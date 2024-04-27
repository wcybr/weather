  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1 align="center">修改</h1>
    <form action="moneyupda" method="post">
      姓名：<input type="text" name="name" value="${one.name}"><br>
        钱：<input type="text" name="money" value="${one.money}"><br>
         序号：<input type="text" name="xid" value="${one.xid}"><br>
     
         <button>提交</button>  </form>
    </body>
</html>