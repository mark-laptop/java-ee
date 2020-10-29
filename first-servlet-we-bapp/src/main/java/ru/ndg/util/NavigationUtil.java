package ru.ndg.util;

import ru.ndg.servlet.*;

import javax.servlet.ServletContext;

public class NavigationUtil {

    public static String getNavigationMenu(ServletContext servletContext) {
        StringBuilder sb = new StringBuilder();

        sb.append("<ul>");

        sb.append("<li>");
        sb.append("<a href=");
        sb.append(servletContext.getContextPath() + MainServlet.PATH);
        sb.append(">");
        sb.append(MainServlet.TITLE);
        sb.append("</a>");
        sb.append("</li>");

        sb.append("<li>");
        sb.append("<a href=");
        sb.append(servletContext.getContextPath() + CatalogServlet.PATH);
        sb.append(">");
        sb.append(CatalogServlet.TITLE);
        sb.append("</a>");
        sb.append("</li>");

        sb.append("<li>");
        sb.append("<a href=");
        sb.append(servletContext.getContextPath() + ProductServlet.PATH);
        sb.append(">");
        sb.append(ProductServlet.TITLE);
        sb.append("</a>");
        sb.append("</li>");

        sb.append("<li>");
        sb.append("<a href=");
        sb.append(servletContext.getContextPath() + CartServlet.PATH);
        sb.append(">");
        sb.append(CartServlet.TITLE);
        sb.append("</a>");
        sb.append("</li>");

        sb.append("<li>");
        sb.append("<a href=");
        sb.append(servletContext.getContextPath() + OrderServlet.PATH);
        sb.append(">");
        sb.append(OrderServlet.TITLE);
        sb.append("</a>");
        sb.append("</li>");

        sb.append("</ul>");

        return sb.toString();
    }
}
