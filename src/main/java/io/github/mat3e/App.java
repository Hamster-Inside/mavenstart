package io.github.mat3e;


import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.server.Server;
   Server server = new Server(8080);
           server.setHandler(new HelloWorld());

           server.start();
           server.join();

public class App {


    public static void main(String[] args) {
        var webapp = new WebAppContext();
      //  webapp.addServlet(HelloServlet.class, pathSpec: "/api/*");
        var server = new Server(8080);
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}