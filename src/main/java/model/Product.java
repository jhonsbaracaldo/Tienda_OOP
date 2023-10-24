package model;

import Tienda_de_barrio_oop.Productos;

import java.util.Scanner;

public class Product  {

        private String name;
        private double priceproduct;
        private int stock;
        Scanner impresion= new Scanner(System.in);

    Productos productos = new Productos();

    public Product(String name, double priceproduct, int stock) {
        this.name = name;
        this.priceproduct = priceproduct;
        this.stock = stock;

    }




       public void  existenciaProducto (){
        System.out.print("Por favor ingrese el codigo del producto a consultar existencias: ");
        int codigoproducto = impresion.nextInt();
        int pos =productos.getCodigo().indexOf(codigoproducto);
        System.out.println("codigo    Producto  ");
        System.out.println(productos.getCodigo().get(pos) +"      "+ productos.getProduct().get(pos));
        if(productos.getCantidad().get(pos) >1)
        {
            System.out.println("Actualmente si hay existecias "+ productos.getCantidad().get(pos));


        }
        else {
            System.out.println("No hay existencias del producto solcite al proveedor");
        }

        }


    public void  validacionPrecio(){

        System.out.print("Por favor ingrese el codigo del producto a consultar su precio: ");
        int codigoproducto = impresion.nextInt();
        int pos =productos.getCodigo().indexOf(codigoproducto);
        System.out.println("codigo    Producto  ");
        System.out.println(productos.getCodigo().get(pos) +"      "+ productos.getProduct().get(pos));
        System.out.println(" Ingrese un precio a validar ");
        double validarPrecio = impresion.nextDouble();
        if (productos.getPrice().get(pos) >validarPrecio){

            System.out.println("Precio ingresado "+validarPrecio +" el precio actual es mayor "+ productos.getPrice().get(pos) );
        }
        else {
            System.out.println("Precio ingresado "+validarPrecio +" el precio actual es menor "+ productos.getPrice().get(pos));
        }
    }

    public  void validacionLetra (){
        System.out.print("Por favor ingrese la letra por la que desea consultar : ");
        String  letraproducto = impresion.next();
        int pos =productos.getProduct().indexOf(letraproducto);
        for ( int i =0 ; i < productos.getProduct().size();i++){
            System.out.println(productos.getProduct().get(i));

        }

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

