package edu.pucmm.eict.controladores;

import edu.pucmm.eict.logica.Product;
import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;

import java.util.HashMap;
import java.util.List;
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

    lunaExpress luna = new lunaExpress();

    public void aplicarRutas(){
        app.get("/", ctx -> ctx.redirect("/listProductos"));

        app.routes(() -> {
            app.get("/listProductos", ctx ->{
                List<Product> listProductos = luna.getMisProducts();
                Map<String, Object> aux = new HashMap<>();
                aux.put("list", listProductos);
                ctx.render("/templates/products.html", aux);
            });

        });

    }



}
