package Tienda_de_barrio_oop;


import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products implements ProductServiceI {
    Scanner impresion = new Scanner(System.in);
    private String name;
    private double price;
    private int stock;

    private int code;
    private List<Products> product = new ArrayList<>();

    public Products(int code, String name, double price, int stock) {
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

    public List<Products> getProduct() {
        return product;
    }

    public void setProduct(List<Products> product) {
        product = product;
    }


    @Override
    public String toString() {
        // System.out.println("code     name     price     stock");
        return code + "     " + name + "     " + price + "   " + stock;

    }

    public void Inventario() {


        System.out.println("code    name        price   stock");
        product.add(new Products(06, " Arroz   ", 1500, 30));
        product.add(new Products(07, " Garbanzo", 1800, 40));
        product.add(new Products(10, "Leche   ", 7500, 25));
        product.add(new Products(28, "Arandano", 1900, 90));
        product.add(new Products(05, " Lentejas", 1350, 9));
        product.add(new Products(11, "Pepino  ", 6500, 10));
        product.add(new Products(25, "Fresa   ", 1500, 12));
        product.add(new Products(30, "Jabon   ", 2500, 15));


    }

    @Override
    public void getAllProducts() {
        if (product.isEmpty()) {
            Inventario();
        }
        // Imprime los productos recién agregados
        product.stream().forEach(agregado -> System.out.println(agregado));
    }

    @Override
    public void addProduct() {

        try {
            System.out.print("Ingrese un nuevo producto\n nuevo producto: ");
            name = impresion.nextLine();
            System.out.print("Asigne un codigo:  ");

            code = impresion.nextInt();

        System.out.print("Ingrese la cantidad:  ");
        stock = impresion.nextInt();
        System.out.print("Ingrese el precio: ");
        price = impresion.nextDouble();
        impresion.nextLine();
        product.add(new Products(code, name, price, stock));

        System.out.println("Producto agregado exitosamente");

            System.out.println("code  name        price   stock");
        product.stream().forEach(agregado -> System.out.println(agregado));
        }
        catch (Exception e){
            System.out.println("Esta ingresando un caracter invalido\n"+
                    "valide el ejemplo e ingrese nuevamente el producto  ");
            System.out.println("----------------------------");
            System.out.println("|Producto : Arandano\n"+"|Codigo : 05\n"+"|Cantidad : 5\n"+"|Precio : 1550");
            System.out.println("----------------------------");

        }

    }



    @Override
    public void findById() {

        System.out.println(" Ingrese el codigo del producto a modificar");
        code = impresion.nextInt();
        int altersearch = code;
        Optional<Products> AlterProduct = product.stream()
                .filter(persona -> persona.getCode() == altersearch)
                .findFirst();
        product.stream().forEach(Alter -> System.out.println(Alter));

        System.out.println(" por favor indique que va modificar \n1.Codigo\n2.Precio\n3.Cantida");

        int seleccion = impresion.nextInt();

        if (seleccion == 1) {
            System.out.println(" Modificar Codigo ");
            int ingcode = impresion.nextInt();

            product.stream()
                    .filter(persona -> persona.getCode() == altersearch)
                    .forEach(user -> {
                        user.setCode(ingcode);

                        product.stream().forEach(supplier -> System.out.println(supplier));

                    });

        } else if (seleccion == 2) {
            System.out.println(" Modificar Precio ");
            int ingcode = impresion.nextInt();

            product.stream()
                    .filter(persona -> persona.getCode() == altersearch)
                    .forEach(user -> {
                        user.setPrice(ingcode);

                        product.stream().forEach(supplier -> System.out.println(supplier));
                    });
        } else {

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

    @Override
    public void deleteProduct() {
        System.out.print("Para eliminar el producto debe ingresar el codigo:  ");
        code = impresion.nextInt();
        int search = code;
        System.out.println("Se elimino el producto exitosamente");
        Optional<Products> RemoveProduct = product.stream()
                .filter(persona -> persona.getCode() == search)
                .findFirst();
        product.removeIf(user -> user.getCode() == (search));
        product.stream().forEach(product -> System.out.println(product));

    }


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






