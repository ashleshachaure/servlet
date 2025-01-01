package org.iant.study.servlet;

import java.io.*;
import javax.servlet.*;

public class Param extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        
        String name = req.getParameter("uname");
        String pass = req.getParameter("password");

        
        pw.println("<html><body>");
        pw.println("Username is: " + name + "<br>");
        pw.println("Password is: " + pass);
        pw.println("</body></html>");
    }
}