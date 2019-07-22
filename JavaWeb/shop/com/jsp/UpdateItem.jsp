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
    <title>修改商品</title>
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
                    <small>修改商品</small>
                </h1>
            </div>
        </div>
    </div>
<%
    session.setAttribute("id", request.getParameter("id"));
%>
    <form action="<%=basePath %>Item/UpdateItem.action" name="userForm">
        <input type="hidden" name="itemId" value= "" /><br><br><br>
        商品名称：<input type="text" name="itemName" value="${Item.itemName}"/><br><br><br>
        商品库存：<input type="text" name="itemStock" value="${Item.itemStock}"/><br><br><br>
        商品价格：<input type="text" name="itemPrice" value="${Item.itemPrice}"/><br><br><br>
        商品详情：<input type="text" name="itemNote" value="${Item.itemNote }"/><br><br><br>

        <input type="submit" value="提交"/>
    </form>
<%--    <script type="text/javascript">--%>
<%--        function updatePaper() {--%>
<%--            var form = document.forms[0];--%>
<%--            form.action = "<%=basePath %>Item/UpdateItem.action";--%>
<%--            form.method = "post";--%>
<%--            form.submit();--%>
<%--        }--%>
<%--    </script>--%>
</div>
