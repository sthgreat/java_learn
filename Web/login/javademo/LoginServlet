package javademo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        if(!"itcast".equals(name)){
            //用户名保存到cookie中发送到客户端
            //再次打开login.jsp中，会读取request中的cookie，保存到用户名文本框中
            Cookie cookie = new Cookie("username", name);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);

            //如果成功重定向到succ1.jsp
            HttpSession session = request.getSession();
            session.setAttribute("username", name);
            response.sendRedirect("/Helloworld_war_exploded/session2/succ1.jsp");

        }else{
            //如果失败，保存错误信息到request中，转发到login.jsp
            request.setAttribute("msg","用户名或者密码错误");
            RequestDispatcher qr = request.getRequestDispatcher("/session2/login.jsp");
            qr.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
