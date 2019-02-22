package com.java1823;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        if (user.equals("admin") && pass.equals("123456")) {
            writer.println("<h1>登录成功</h1>");
        } else {
            writer.println("<h1>登录失败</h1>");
        }


    }
}
