package edu.pucmm.eict.Controladora;

import io.javalin.Javalin;
import org.eclipse.jetty.server.Authentication;

import static io.javalin.apibuilder.ApiBuilder.*;
import static io.javalin.apibuilder.ApiBuilder.get;

public class control {
    private final Javalin app;

    public control(Javalin app) {
        this.app = app; 
    }

    public void ruta(){

        app.routes(() -> {
            path("/", () -> {

                before(ctx -> {
                    Authentication.User usuario = ctx.sessionAttribute("usuario");
                    if(usuario == null){
                        ctx.redirect("/redirect.html");
                    }
                });

            });
        });
    }
}
