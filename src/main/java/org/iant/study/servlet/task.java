package org.iant.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class task extends HttpServlet {
    private String defaultName;
    private String defaultAddress;
    private int defaultAge;

    @Override
    public void init() throws ServletException {
        // Initializing default value
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("task/html");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>User Information</title></head><body>");
        out.println("<h1>Enter User Information</h1>");
        out.println("<form method='POST' action='task'>");
        out.println("Name: <input type='text' name='name' value='" + defaultName + "'><br><br>");
        out.println("Address: <input type='text' name='address' value='" + defaultAddress + "'><br><br>");
        out.println("Age: <input type='number' name='age' value='" + defaultAge + "'><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);

        response.setContentType("task/html");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>User Information</title></head><body>");
        out.println("<h1>User Information Submitted</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Address: " + address + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("</body></html>");
    }
}
