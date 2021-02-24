package edu.pucmm.eict.controladores;

import edu.pucmm.eict.logica.Product;
import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;
import static io.javalin.apibuilder.ApiBuilder.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Template {
    Javalin app;

    public Template(Javalin app){
        this.app = app;
        registrandoTemplate();
    }

    public void registrandoTemplate(){
        JavalinRenderer.register(JavalinThymeleaf.INSTANCE, ".html");
    }

    lunaExpress luna = lunaExpress.getInstance();

    public void aplicarRutas(){
       app.get("/", ctx -> ctx.redirect("/listaProducts"));

        app.routes(() -> {

            get("/listaProducts", ctx ->{
                ArrayList<Product> listaProducts = luna.getMisProducts();
                Map<String, Object> modelo = new HashMap<>();
                modelo.put("listaProducts", listaProducts);
                ctx.render("/templates/products.html", modelo);
            });

        });

    }



}
