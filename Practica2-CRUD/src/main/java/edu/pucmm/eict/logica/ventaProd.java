package edu.pucmm.eict.logica;

import java.util.Date;
import java.util.List;

public class ventaProd {
    int id;
    Date fecha;
    String nameClient;
    List<Product> products;

    public ventaProd(int id, Date fecha, String nameClient, List<Product> products) {
        this.id = id;
        this.fecha = fecha;
        this.nameClient = nameClient;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
