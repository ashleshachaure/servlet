package org.iant.study.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Valid extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        
        String fname = req.getParameter("fname");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        
        if ((fname == null || fname.isEmpty()) && (age == null || age.isEmpty()) && (address == null || address.isEmpty())) {
            out.println("<h3>Please enter values for all fields.</h3>");
        } else if (fname != null && !fname.isEmpty() && age != null && !age.isEmpty() && address != null && !address.isEmpty()) {
            out.println("<b>Your details are:</b><br>");
            out.println("First Name: " + fname + "<br>");
            out.println("age " + age + "<br>");
            out.println("Address: " + address + "<br>");
        } else {
        	String invalidIp = "";
        	if (fname == null || fname.isEmpty()) {
        		invalidIp += " First Name";
        	}
        	if (age == null || age.isEmpty()) {
        		invalidIp += " age";
        	}
        	if (address== null || address.isEmpty()) {
        		invalidIp += " address";
        	}
        	out.println("<h3>Please enter values for" + invalidIp + ".</h3>");
        }
        out.close();
    }
}