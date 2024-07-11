package com.iamrishavdas;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        // tomcat.setPort(8080); // for changing the default port number of Tomcat which is 8080

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "Servlet", new Servlet());
        context.addServletMappingDecoded("/hello", "Servlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}
