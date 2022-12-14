import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;



public class userServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }
}