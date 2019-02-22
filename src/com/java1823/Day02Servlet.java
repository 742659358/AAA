package com.java1823;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Day02Servlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("count", 0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        Integer count = (Integer) servletContext.getAttribute("count");
        count++;
        servletContext.setAttribute("count", count);


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>这个页面被访问了" + count + "次</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
