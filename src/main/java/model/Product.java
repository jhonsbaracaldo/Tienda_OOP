package model;

import Tienda_de_barrio_oop.Products;

import java.util.*;

public class Product {

    private String name;
    private double priceproduct;
    private int stock;
    Scanner impresion = new Scanner(System.in);


    public void Existingproduct(Products products) {
        System.out.print("Por favor ingrese el codigo del producto a consultar existencias: ");

        int codeproduct = impresion.nextInt();
        Optional<Products> Stock = products.getProduct().stream()
                .filter(market -> market.getCode() == codeproduct)
                .findFirst();
        // impresion
        products.getProduct().stream().forEach(sendp -> System.out.println(sendp));
        if (products.getStock() > 1) {
            System.out.println("Actualmente si hay existecias " + products.getStock());


        } else {
            System.out.println("No hay existencias del producto solicite al proveedor");
        }

    }


    public void validationPrice(Products products) {
         products.getProduct().clear();
        System.out.print("Por favor ingrese el codigo del producto a consultar su precio: ");
        int code = impresion.nextInt();
        Optional<Products> validationPrice = products.getProduct().stream()
                .filter(market -> market.getCode() == code)
                .findFirst();
        System.out.println("codigo    Producto  ");
        System.out.println(products.getCode() + "      " + products.getName());
        System.out.println(" Ingrese un precio a validar ");
        double valuesprice = impresion.nextDouble();
        if (products.getPrice() > valuesprice) {

            System.out.println("Precio ingresado " + valuesprice + " el precio actual es mayor " + products.getPrice());
        } else {
            System.out.println("Precio ingresado " + valuesprice + " el precio actual es menor " + products.getPrice());
        }
    }

    public void vowelsearch(Products products) {

        System.out.print("Por favor ingrese la letra por la que desea consultar : ");
        String vowel = impresion.next();

        Optional<Products> vowelsearch = products.getProduct().stream()
                .filter(market -> market.getName() == vowel)
                .findFirst();
        products.getProduct().stream().forEach(sendp -> System.out.println(sendp));
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


