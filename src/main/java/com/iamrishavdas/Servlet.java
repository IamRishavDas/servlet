package com.iamrishavdas;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import jakarta.servlet.annotation.WebServlet;


// @WebServlet("/hello")
public class Servlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletResponse.getWriter().println("Hello welcome to the servlet program");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
