package lk.ijse.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Task2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (req.getContentType() == null ||
            !req.getContentType().toLowerCase().startsWith("application/json")) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            // create writer
            var writer = resp.getWriter();
            resp.setContentType("text/html");
            // parameter use
            System.out.println("Hello "+name+"!");
            writer.println("Hello "+name+"!");
        }
    }
}