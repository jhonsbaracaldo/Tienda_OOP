package model;

import Tienda_de_barrio_oop.Productos;

import java.util.Scanner;

public class Product  {

        private String name;
        private double priceproduct;
        private int stock;

    public Product(String name, double priceproduct, int stock) {
        this.name = name;
        this.priceproduct = priceproduct;
        this.stock = stock;


    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getpriceproduct() {
        return priceproduct;
    }

    public void setPrice(double price) {
        this.priceproduct = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceproduct=" + priceproduct +
                ", stock=" + stock +
                '}';
    }
}

