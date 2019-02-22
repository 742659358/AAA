package com.java1823;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class WorldServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("WorldServlet init");


        String user = servletConfig.getInitParameter("user");
        String pass = servletConfig.getInitParameter("pass");
        String url = servletConfig.getInitParameter("url");
        System.out.println("user:" + user + "|pass:" + pass + "|url:" + url);
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            System.out.println("param:" + initParameterNames.nextElement());
        }
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("WorldServlet service");

        servletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html><body><H1>我是一号标题</H1></body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("WorldServlet destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }


}
