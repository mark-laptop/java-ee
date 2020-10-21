package ru.ndg;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("<h1>Hello from First servlet!!!</h1>");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {

    }
}