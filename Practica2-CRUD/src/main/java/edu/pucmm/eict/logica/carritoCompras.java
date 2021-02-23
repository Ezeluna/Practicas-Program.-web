package edu.pucmm.eict.logica;

import java.util.List;

public class carritoCompras {
    int id;
    List<Product> products;

    public carritoCompras(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
