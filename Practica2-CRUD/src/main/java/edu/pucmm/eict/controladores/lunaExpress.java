package edu.pucmm.eict.controladores;

import edu.pucmm.eict.logica.Product;
import edu.pucmm.eict.logica.User;
import edu.pucmm.eict.logica.ventaProd;
import javassist.CtField;

import java.util.ArrayList;

public class lunaExpress {
    private static lunaExpress luna;
    private ArrayList<User> misUsers;
    private ArrayList<Product> misProducts;
    private ArrayList<ventaProd> misVentas;

    public lunaExpress() {
        this.misUsers = new ArrayList<>();
        this.misProducts = new ArrayList<>();
        this.misVentas = new ArrayList<>();
    }

    public static lunaExpress getLuna() {
        return luna;
    }

    public static lunaExpress getInstance() {
        if (luna == null) {
            luna = new lunaExpress();
        }
        return luna;
    }

    public static void setLuna(lunaExpress luna) {
        lunaExpress.luna = luna;
    }

    public ArrayList<User> getMisUsers() {
        return misUsers;
    }

    public void setMisUsers(ArrayList<User> misUsers) {
        this.misUsers = misUsers;
    }

    public ArrayList<Product> getMisProducts() {
        return misProducts;
    }

    public void setMisProducts(ArrayList<Product> misProducts) {
        this.misProducts = misProducts;
    }

    public ArrayList<ventaProd> getMisVentas() {
        return misVentas;
    }

    public void setMisVentas(ArrayList<ventaProd> misVentas) {
        this.misVentas = misVentas;
    }
}
