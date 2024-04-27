    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>Train Query</title>
</head>
<body>
    <h1>Train Query</h1>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
    
    <c:if test="${not empty tra}">
        <h2>Train Schedule</h2>
        <table border="1">
            <tr>
                <th>车次</th>
                <th>始发站</th>
                <th>终点站</th>
                <th>发车站</th>
                <th>发车时间</th>        
               <th>到达站</th> 
                 <th>到达时间</th> 
               <th>里程（km）</th> 
                <th>历时</th>     
            </tr>
            <c:forEach var="train" items="${tra}">
                <tr>
                    <td>${train.trainCode}</td>
                    <td>${train.firstStation}</td>
                    <td>${train.lastStation}</td>
                    <td>${train.startStation}</td>
                    <td>${train.startTime}</td>        
                    <td>${train.arriveStation}</td>       
                    <td>${train.arriveTime}</td>       
                    <td>${train.km}</td>       
                    <td>${train.useDate}</td>                 
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>