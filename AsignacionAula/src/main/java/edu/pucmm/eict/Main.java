package edu.pucmm.eict;
import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

import javax.naming.ldap.Control;

public class Main {
    public static void main(String[] args){
        Javalin app = Javalin.create(config->{
            config.addStaticFiles("/resources");
            config.registerPlugin(new RouteOverviewPlugin("/"));
        });

        app.start(getHerokuAssignedPort());




    }



    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 7000;
    }



}
