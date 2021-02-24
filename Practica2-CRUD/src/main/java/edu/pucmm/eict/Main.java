package edu.pucmm.eict;

import edu.pucmm.eict.controladores.Template;
import edu.pucmm.eict.controladores.lunaExpress;
import edu.pucmm.eict.logica.Product;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/templates");
        }).start(7000);

        new Template(app).aplicarRutas();

        /*Product pro = new Product(1,"Helmet",10,2200);
        lunaExpress pro1 = new lunaExpress();
        pro1.insertProduct(pro);

        System.out.println(pro1.getMisProducts());*/

    }
}
