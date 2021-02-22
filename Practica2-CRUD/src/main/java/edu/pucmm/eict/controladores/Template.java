package edu.pucmm.eict.controladores;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;

public class Template {
    private Javalin app;

    public void templateControlador(Javalin app){
        this.app = app;
        registrandoTemplate();
    }

    public void registrandoTemplate(){
        JavalinRenderer.register(JavalinThymeleaf.INSTANCE, ".html");
    }



}
