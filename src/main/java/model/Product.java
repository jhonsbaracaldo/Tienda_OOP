package model;

import Tienda_de_barrio_oop.Productos;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Product {

    private String name;
    private double priceproduct;
    private int stock;
    Scanner impresion = new Scanner(System.in);


    public void Existingproduct(Productos productos) {
        System.out.print("Por favor ingrese el codigo del producto a consultar existencias: ");

        int codeproduct = impresion.nextInt();
        Optional<Productos> Stock = productos.getProduct().stream()
                .filter(market -> market.getCode() == codeproduct)
                .findFirst();
        // impresion
        productos.getProduct().stream().forEach(sendp -> System.out.println(sendp));
        if (productos.getStock() > 1) {
            System.out.println("Actualmente si hay existecias " + productos.getStock());


        } else {
            System.out.println("No hay existencias del producto solicite al proveedor");
        }

    }


    public void validationPrice(Productos productos) {
         productos.getProduct().clear();
        System.out.print("Por favor ingrese el codigo del producto a consultar su precio: ");
        int code = impresion.nextInt();
        Optional<Productos> validationPrice = productos.getProduct().stream()
                .filter(market -> market.getCode() == code)
                .findFirst();
        System.out.println("codigo    Producto  ");
        System.out.println(productos.getCode() + "      " + productos.getName());
        System.out.println(" Ingrese un precio a validar ");
        double valuesprice = impresion.nextDouble();
        if (productos.getPrice() > valuesprice) {

            System.out.println("Precio ingresado " + valuesprice + " el precio actual es mayor " + productos.getPrice());
        } else {
            System.out.println("Precio ingresado " + valuesprice + " el precio actual es menor " + productos.getPrice());
        }
    }

    public void vowelsearch(Productos productos) {

        System.out.print("Por favor ingrese la letra por la que desea consultar : ");
        String vowel = impresion.next();

        Optional<Productos> vowelsearch = productos.getProduct().stream()
                .filter(market -> market.getName() == vowel)
                .findFirst();
        productos.getProduct().stream().forEach(sendp -> System.out.println(sendp));
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


