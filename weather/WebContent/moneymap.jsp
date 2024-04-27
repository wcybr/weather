<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>旅行开支列表</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }
        .container {
            width: 90%;
            max-width: 1000px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            text-align: center;
            padding: 10px;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        td a {
            text-decoration: none;
            color: #4CAF50;
            padding: 5px 10px;
            border: 1px solid #4CAF50;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        td a:hover {
            background-color: #4CAF50;
            color: white;
        }
        form {
            margin: 0;
        }
        input[type="text"] {
            padding: 8px;
            margin-right: 5px;
        }
        input[type="submit"] {
            padding: 8px 15px;
            background-color: #4CAF50;
            border: none;
            color: white;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #3e8e41;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>旅行支出表</h1>
        <table>
            <tr>
                <td><a href="moneyadd.jsp">添加</a></td>
                <td><a href="moneyall">刷新</a></td>
                <td><a href="moneyupdate.jsp">修改</a></td>
                <td><a href="findweather.jsp">查询天气</a></td>
                <td>
                    <form action="moneyfindOne" method="post">
                        <input type="text" name="xid" placeholder="输入序号">
                        <input type="submit" value="查找">
                    </form>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <th>id</th>
                <th>事件</th>
                <th>金额</th>
                <th>序号</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${money}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.money}</td>
                    <td>${s.xid}</td>
                    <td><a href="moneydelete?xid=${s.xid}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>