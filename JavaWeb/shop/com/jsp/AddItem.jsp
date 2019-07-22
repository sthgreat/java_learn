<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/7
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增商品</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增商品</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="<%=basePath %>Item/AddItem.action" name="userForm">
        商品名称：<input type="text" name="ItemName"><br><br><br>
        商品编号：<input type="text" name="ItemId"><br><br><br>
        商品价格：<input type="text" name="ItemPrice"><br><br><br>
        商品库存：<input type="text" name="ItemStock"><br><br><br>
        商品详情：<input type="text" name="ItemNote"><br><br><br>

<%--        <input type="button" value="添加" onclick="addPaper()">--%>
        <input type="submit" value="添加">
    </form>

<%--    <script type="text/javascript">--%>
<%--        function addPaper() {--%>
<%--            var form = document.forms[0];--%>
<%--            form.action = "<%=basePath %>paper/addPaper";--%>
<%--            form.method = "post";--%>
<%--            form.submit();--%>
<%--        }--%>
<%--    </script>--%>
</div>
