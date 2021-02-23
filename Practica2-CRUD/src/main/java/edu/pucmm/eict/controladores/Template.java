package edu.pucmm.eict.controladores;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;

public class Template {
    Javalin app;

    public Template(Javalin app){
        this.app = app;
        registrandoTemplate();
    }

    public void registrandoTemplate(){
        JavalinRenderer.register(JavalinThymeleaf.INSTANCE, ".html");
    }

    public void aplicarRutas(){
        //app.get("/", ctx -> ctx.result("Hola Mundo en Javalin :-D"));
        app.get("/", ctx -> ctx.redirect("/login.html"));
      /*  app.routes(()->{

        });*/

    }



}
