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
<h1>登陆</h1>

<%
    //读取cookie
    String uname = "";
    Cookie[] cs = request.getCookies();
    if(cs!=null){
        for(Cookie c : cs){
            if("username".equals(c.getName())){
                uname = c.getValue();
            }
        }
    }
%>

<%
    String message = "";
    String msg = (String)request.getAttribute("msg");
    if(msg!=null){
        message = msg;
    }
%>

<font color="red"><b><%=message%></b></font>
<form action="/Helloworld_war_exploded/login" method="post">
    用户名：<input type="text" name="username" value="<%=uname%>"/><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登陆">
</form>


</body>
</html>
