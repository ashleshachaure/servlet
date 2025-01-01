package org.iant.study.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Printcolor extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       
        String color = req.getParameter("color");

        
        res.setContentType("text/html");
        
        PrintWriter pw = res.getWriter();

        
        pw.println("<b>The selected color is: </b>" + color);
        pw.close();
    }
}