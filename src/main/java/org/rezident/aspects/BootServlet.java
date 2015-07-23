package org.rezident.aspects;

import java.io.IOException;
import javax.servlet.http.*;

/**
 * Created by yuri on 24.07.15.
 */
public class BootServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println("Hello world!");
        response.getWriter().println("Welcome to Aspects framework!");
    }
}
