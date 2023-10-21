package Tienda_de_barrio_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Productos {
    Scanner impresion = new Scanner(System.in);
    private String name;

    private List<String> product = new ArrayList<>();
    private List<Integer> cantidad = new ArrayList<>();
    private List<Double> price = new ArrayList<>();

    private List<Integer> codigo = new ArrayList<>();


    public List<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(List<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    private List<Double> Price = new ArrayList<>();
    private Double priceproduct;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Productos{" +
                "name='" + name + '\'' +
                ", priceproduct=" + priceproduct +
                ", stock=" + stock +
                ", product='" + product + '\'' +
                '}';
    }


    public void Inventario() {
        String name;

        product.add("   Arroz    ");
        product.add("  Papa     ");
        product.add("   leche    ");
        product.add("  Zucaritas");
        product.add("   Arandanos");
        product.add("   Kumis    ");
        product.add("  Cocete   ");
        product.add("  Verduras ");


        //Unidades
        cantidad.add(5);
        cantidad.add(2);
        cantidad.add(4);
        cantidad.add(8);
        cantidad.add(10);
        cantidad.add(1);
        cantidad.add(3);
        cantidad.add(4);


        price.add(1500.);
        price.add(500.);
        price.add(2500.);
        price.add(2800.);
        price.add(3500.);
        price.add(4500.);
        price.add(650.);
        price.add(1850.);

        codigo.add(01);
        codigo.add(21);
        codigo.add(03);
        codigo.add(45);
        codigo.add(05);
        codigo.add(06);
        codigo.add(72);
        codigo.add(90);


        System.out.println(" Inventario actual " + product.size() + " productos");
        System.out.println("codigo    Producto     Unidades    Precio ");

        for (int i = 0; i < product.size(); i++) {

            System.out.println(codigo.get(i) + "      " + product.get(i) + "    |  " + cantidad.get(i) + " |   " + price.get(i));


        }


    }

    public void IngresarProducto() {

        System.out.println("Ingrese un nuevo producto nuevo producto");
        String pro = impresion.next();
        System.out.println("Asigne un codigo");
        int code = impresion.nextInt();
        System.out.println("Ingrese la cantidad");
        int can = impresion.nextInt();
        System.out.println("Ingrese el precio ");
        double pre = impresion.nextDouble();
        product.add(pro);
        cantidad.add(can);
        price.add(pre);
        codigo.add(code);
        for (int i = 0; i < product.size(); i++) {
            System.out.println("codigo    Producto     Unidades    Precio ");
            System.out.println(+codigo.get(i) + "    |  " + product.get(i) + "    |  " + cantidad.get(i) + " |   " + price.get(i));

        }


    }

    public void ModificarProducto() {
        System.out.println(" Por favor ingrese el codigo del producto a modificar");
        int codigoproducto = impresion.nextInt();
        int posicionn = codigo.indexOf(codigoproducto);
        System.out.println("codigo    Producto     Unidades    Precio ");
        System.out.println(codigo.get(posicionn) +"      "+ product.get(posicionn) +"       "+ cantidad.get(posicionn)+"      " + price.get(posicionn));
        System.out.println(" por favor indique que va modificar \n1.Codigo\n2.Precio\n3.Cantida");

        int seleccion = impresion.nextInt();

       if ( seleccion ==1){
           System.out.println(" Ingrese el nuevo codigo ");
           int nuevocodigo =impresion.nextInt();
           codigo.set(posicionn,nuevocodigo);
           System.out.println(" Modificacion con exito ");
           System.out.println("codigo    Producto     Unidades    Precio ");
           System.out.println(codigo.get(posicionn) +"      "+ product.get(posicionn) +"       "+ cantidad.get(posicionn)+"      " + price.get(posicionn));
       }
       else if (seleccion ==2){
           System.out.println(" Ingrese el nuevo precio ");
          double nuevoprecio =impresion.nextInt();
           price.set(posicionn,nuevoprecio);
           System.out.println(" Modificacion con exito ");
           System.out.println("codigo    Producto     Unidades    Precio ");
           System.out.println(codigo.get(posicionn) + product.get(posicionn) +"    "+ cantidad.get(posicionn)+"   " + price.get(posicionn));
       }
       else {
           System.out.println(" Ingrese la nueva cantidad ");
           int nuevocantidad =impresion.nextInt();
           cantidad.set(posicionn,nuevocantidad);
           System.out.println(" Modificacion con exito ");
           System.out.println("codigo    Producto     Unidades    Precio ");
           System.out.println(codigo.get(posicionn) + product.get(posicionn) +"    "+ cantidad.get(posicionn)+"   " + price.get(posicionn));


       }

    }

        public void EliminarProducto () {

            int posicion;
            System.out.println("Para eliminar el producto debe ingresar el codigo ");
            int code = impresion.nextInt();
            posicion = codigo.indexOf(code);
            System.out.println("Se elimino el siguiente producto ");
            System.out.println("codigo    Producto     Unidades    Precio ");
            System.out.println(codigo.get(posicion) + product.get(posicion) +"    "+ cantidad.get(posicion)+"   " + price.get(posicion));
            codigo.remove(posicion);
            product.remove(posicion);
            cantidad.remove(posicion);
            price.remove(posicion);


            for (int i = 0; i < product.size(); i++) {

                System.out.println(+codigo.get(i) + "    |  " + product.get(i) + "    |  " + cantidad.get(i) + " |   " + price.get(i));


            }

        }

    }




