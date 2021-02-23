package edu.pucmm.eict.logica;

public class Product {
    int id;
    String name;
    int cant;
    float price;

    public Product(int id, String name, int cant, float price) {
        this.id = id;
        this.name = name;
        this.cant = cant;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
