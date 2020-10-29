package ru.ndg.servlet;

import ru.ndg.util.NavigationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cartServlet", urlPatterns = "/cart")
public class CartServlet extends HttpServlet {

    public final static String TITLE = "Корзина";
    public final static String PATH = "/cart";

    @Override
    public void init() throws ServletException {}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<title>" + CartServlet.TITLE + "</title>");
        writer.println("<body>");
        writer.println(NavigationUtil.getNavigationMenu(getServletContext()));
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

    @Override
    public void destroy() {}
}