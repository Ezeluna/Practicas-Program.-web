package edu.pucmm.eict.controladores;

import edu.pucmm.eict.logica.Product;
import edu.pucmm.eict.logica.User;
import edu.pucmm.eict.logica.ventaProd;

import java.util.ArrayList;

public class lunaExpress {
    private static lunaExpress luna;
    private ArrayList<User> misUsers;
    private ArrayList<Product> misProducts;
    private ArrayList<ventaProd> misVentas;
    private static User loginUser;

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

    //Usuarios
    public void insertUser(User user){
        misUsers.add(user);
    }

    public boolean confirmLogin(String user) {
        boolean login = false;
        for (User auxUser : misUsers) {
            if(auxUser.getUsuario().equals(user)){
                loginUser = auxUser;
                login = true;
            }
        }
        return login;
    }

    public User retornarUser(String user) {
        User miUser = null;
        for (User aux : misUsers) {
            if (aux.getUsuario().equalsIgnoreCase(user)) {
                miUser = aux;
            }
        }
        return miUser;
    }

    //Productos
    public void insertProduct(Product product){
        misProducts.add(product);
    }

    /*public Product retornarProdId(int id) {
        Product miProduct = null;
        for (Product product : misProducts) {
            if (product.getId() == id) {
                miProduct = product;
            }
        }
        return miProduct;
    }*/

    public Product retornarProdId(String pro) {
        Product miProduct = null;
        for (Product product : misProducts) {
            if (product.getName().equalsIgnoreCase(pro)) {
                miProduct = product;
            }
        }
        return miProduct;
    }

    public void eliminarProdId(int id) {
        Product eliminarProduct = null;
        for (Product product : misProducts) {
            if (product.getId() == id) {
                eliminarProduct = product;
            }
        }
        misProducts.remove(eliminarProduct);
    }

    public void modificaProduct(Product product) {

        for (Product miproduct : misProducts) {
            if (product.getId() == miproduct.getId()) {
                miproduct.setName(product.getName());
                miproduct.setCant(product.getCant());
                miproduct.setPrice(product.getPrice());
            }
        }
    }

    //Ventas
    public void insertVenta(ventaProd venta){
        misVentas.add(venta);
    }




}
