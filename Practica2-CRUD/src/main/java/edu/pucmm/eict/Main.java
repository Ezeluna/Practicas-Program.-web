package edu.pucmm.eict;

import edu.pucmm.eict.controladores.Template;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/templates");
        }).start(7000);

        new Template(app).aplicarRutas();

    }
}
