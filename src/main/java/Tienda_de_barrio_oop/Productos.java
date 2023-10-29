package Tienda_de_barrio_oop;


import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Productos {
    Scanner impresion = new Scanner(System.in);
    private String name;
    private double price;
    private int stock;

    private int code;
    private List<Productos> product = new ArrayList<>();

    public Productos(int code,String name, double price, int stock ) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Productos> getProduct() {
        return product;
    }

    public void setProduct(List<Productos> product) {
        product = product;
    }


    @Override
    public String toString() {
       // System.out.println("code     name     price     stock");
        return code+"     "+ name +"     "+ price +"   "+ stock  ;

    }

    public void Inventario() {


         System.out.println("code    name        price   stock");
       product.add(new  Productos ( 06," Arroz   ",1500,30));
       product.add(new Productos ( 07," Garbanzo",1800,40));
       product.add(new Productos ( 10,"Leche   ",7500,25));
       product.add(new Productos ( 28,"Arandano",1900 ,90));
       product.add(new Productos ( 05," Lentejas",1350,9));
       product.add(new Productos ( 11,"Pepino  ",6500,10));
       product.add(new Productos ( 25,"Fresa   ",1500,12));
       product.add(new Productos ( 30,"Jabon   ",2500,15));



    }

    public void PrintProduct() {
        if (product.isEmpty()) {
            Inventario();
        }
        // Imprime los productos recién agregados
        product.stream().forEach(agregado -> System.out.println(agregado));
    }

    public void IngresarProducto() {

            System.out.print("Ingrese un nuevo producto\n nuevo producto: ");
            name = impresion.next();
            System.out.print("Asigne un codigo:  ");
            code = impresion.nextInt();
            System.out.print("Ingrese la cantidad:  ");
            stock = impresion.nextInt();
            System.out.print("Ingrese el precio: ");
            price = impresion.nextDouble();
            impresion.nextLine();
            product.add(new Productos(code, name, price, stock));
            System.out.println("Producto agregado exitosamente");

       product.stream().forEach(agregado -> System.out.println(agregado));



    }

    public void ModificarProducto() {

        System.out.println(" Ingrese el codigo del producto a modificar");
         code = impresion.nextInt();
        int altersearch= code;
        Optional<Productos> AlterProduct = product.stream()
                .filter(persona -> persona.getCode() == altersearch)
                .findFirst();
        product.stream().forEach(Alter -> System.out.println(Alter));

        System.out.println(" por favor indique que va modificar \n1.Codigo\n2.Precio\n3.Cantida");

        int seleccion = impresion.nextInt();

       if ( seleccion ==1){
           System.out.println(" Modificar Codigo ");
           int ingcode = impresion.nextInt();

           product.stream()
                   .filter(persona -> persona.getCode() == altersearch)
                   .forEach(user -> {
                       user.setCode(ingcode);

                      product.stream().forEach(supplier -> System.out.println(supplier));

                   });

       } else if (seleccion ==2)
       {
           System.out.println(" Modificar Precio ");
           int ingcode = impresion.nextInt();

           product.stream()
                   .filter(persona -> persona.getCode() == altersearch)
                   .forEach(user -> {
                       user.setPrice(ingcode);

                       product.stream().forEach(supplier -> System.out.println(supplier));
                   });
       }else{

           System.out.println(" Modificar Cantidad ");
           int ingcode = impresion.nextInt();

           product.stream()
                   .filter(persona -> persona.getCode() == altersearch)
                   .forEach(user -> {
                       user.setStock(ingcode);

                       product.stream().forEach(supplier -> System.out.println(supplier));
                   });
       }

    }

        public void EliminarProducto() {
        System.out.print("Para eliminar el producto debe ingresar el codigo:  ");
             code = impresion.nextInt();
            int search= code;
            System.out.println("Se elimino el producto exitosamente");
            Optional<Productos> RemoveProduct = product.stream()
                    .filter(persona -> persona.getCode() == search)
                    .findFirst();
            product.removeIf(user -> user.getCode()==(search));
            product.stream().forEach(product -> System.out.println(product));

        }


       /* public void validaciones(){
            System.out.println(" selecciones que va validar ");
            int seleccion = impresion.nextInt() ;
            Product product1 = new Product("a",5600,5);
            switch (seleccion){
                case 1:
                    System.out.println("validando existencia");
                    product1.validacionLetra();
                    break;

                case 2:
                    System.out.println("validadndo precio");
                    product1.validacionPrecio();
                    break;
            }
        }*/

    }




