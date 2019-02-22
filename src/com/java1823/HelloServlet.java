package com.java1823;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet implements Servlet {

    // 初始化Servlet
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet init");
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        //
    }

    // 响应请求
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet service");
        // 得到输入流 ，向请求者发送信息
//        servletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("access Servlet finish");
    }

    // 销毁
    @Override
    public void destroy() {
        System.out.println("Servlet destroy");
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
