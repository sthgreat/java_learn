<%--
  Created by IntelliJ IDEA.
  User: jsb
  Date: 2019/7/9
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登陆成功！</h1>
<%
    String username = (String)session.getAttribute("username");
    if(username==null){
        //向request 中保存错误信息，转发到login.jsp
        request.setAttribute("msg","您尚未登陆");
        request.getRequestDispatcher("/session2/login.jsp").forward(request,response);
        return;
    }
%>

欢迎<%=session.getAttribute("username")%>

</body>
</html>
