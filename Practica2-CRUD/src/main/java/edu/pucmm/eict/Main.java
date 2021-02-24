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

        Product pro = new Product(1,"Helmet",10,2200);
        lunaExpress.getInstance().insertProduct(pro);
        Product pro2 = new Product(2,"Termo",10,2200);
        lunaExpress.getInstance().insertProduct(pro2);


        new Template(app).aplicarRutas();

    }
}
