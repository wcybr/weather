<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>查询服务</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #333;
            color: #fff;
        }
        td a {
            display: block;
            padding: 10px;
            text-decoration: none;
            color: #333;
            background-color: #e7e7e7;
            transition: background-color 0.3s ease;
        }
        td a:hover {
            background-color: #ddd;
        }
        @media (max-width: 600px) {
            table {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <td><a href="findtrain.jsp">火车票查询</a></td>
            <td><a href="findweather.jsp">天气查询</a></td>
            <td><a href="number.jsp">电话号码归属地查询</a></td>
            <td><a href="post.jsp">邮政编码查询</a></td>
        </tr>
    </table>
</body>
</html>