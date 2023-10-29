package Tienda_de_barrio_oop;


// import model.Product;
import model.Product;
import model.Proveedores;
import model.Venta;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;

import java.util.Scanner;

public class Menu {

    Productos productos = new Productos(06,"Arroz",1500,30);
    model.Venta venta = new Venta();
    Proveedores proveedores = new Proveedores("",5,5,"");

    Main m = new Main();
    Scanner impresion = new Scanner(System.in);
    Product product= new Product();
    public void MenuProductos (){
    int seleccion = showOptionsMenuAndCaptureOption();
           while(seleccion!=7)

   {
        switch (seleccion) {

            case 1 -> productos.IngresarProducto();
            case 2 -> productos.EliminarProducto();
            case 3 -> productos.ModificarProducto();
            case 4 -> productos.PrintProduct();
            case 5 -> product.validationPrice(productos);
            case 6 ->  { Main.showOptionsMenuAndCaptureOptionPrincipal();
                return;}


        }
        seleccion = showOptionsMenuAndCaptureOption();


    }

}



    private int showOptionsMenuAndCaptureOption() {
        System.out.println("      Bienvenido " +
                "\n" +
                " /////////////\\\\\\\\\\\\\n" +
                "(((((((((((((   \\\\\\\\\\\\\n" +
                "))) ~~      ~~   (((\n" +
                "((( (*)     (*)  )))\n" +
                ")))     <        (((\\s\n" +
                "((( '\\\\______/`   )))\\s\n" +
                ")))\\\\___________/(((\\s\n" +
                " (((   _)  (_    )))\\s\\s\n" +
                "      /\\\\__/\\\\\"\"\" +");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio     |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar o Modificar producto       |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Validaciones Product                  |");
        System.out.println("6. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 6;
        try {
            seleccion = scanner.nextInt();
            if (seleccion < 1 || seleccion > 6) {
                System.out.println("| The Option selected is not valid. Please try again |");
                showOptionsMenuAndCaptureOption();
            }
        } catch (Exception e) {
            System.out.println("| The Option selected is not valid. Please try again |");
            System.out.println("Usted esta ingresado otro tipo de caracter");
            showOptionsMenuAndCaptureOption();
        }
        return seleccion;


     }



    public void MenuProveedor (){
        int seleccion = showOptionsMenuAndCaptureOption1();
        while(seleccion!=7)

        {
            switch (seleccion) {

                case 1 ->proveedores.IngresandoProveedor();
                case 2 -> proveedores.DeletProvedore();
                case 3 -> proveedores.MostrarProveedores();
                case 4 -> proveedores.EnviarPedido(productos);
                case 5 -> { Main.showOptionsMenuAndCaptureOptionPrincipal();
                    return;
                }


            }
            seleccion = showOptionsMenuAndCaptureOption1();


        }

    }



    private int showOptionsMenuAndCaptureOption1() {
        System.out.println("      Bienvenido " +
                "\n" +
                " /////////////\\\\\\\\\\\\\n" +
                "(((((((((((((   \\\\\\\\\\\\\n" +
                "))) ~~      ~~   (((\n" +
                "((( (*)     (*)  )))\n" +
                ")))     <        (((\\s\n" +
                "((( '\\\\______/`   )))\\s\n" +
                ")))\\\\___________/(((\\s\n" +
                " (((   _)  (_    )))\\s\\s\n" +
                "      /\\\\__/\\\\\"\"\" +");
        System.out.println("±----------------------------------------±");
        System.out.println("|       Bienvenido a Proveedor           |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar Proveedor                     |");
        System.out.println("2. Eliminar Proveedor                    |");
        System.out.println("3. Ver todos los proveedores             |");
        System.out.println("4. Enviar Pedido                         |");
        System.out.println("5. salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 6;
        try {
            seleccion = scanner.nextInt();
            if (seleccion < 1 || seleccion > 6) {
                System.out.println("| The Option selected is not valid. Please try again |");
                System.out.println("Usted esta ingresado otro tipo de caracter");
                showOptionsMenuAndCaptureOption1();
            }
        } catch (Exception e) {
            System.out.println("| The Option selected is not valid. Please try again |");
            System.out.println("Usted esta ingresado otro tipo de caracter");
            showOptionsMenuAndCaptureOption1();
        }
        return seleccion;


    }

    public void MenuVentas (){



        int seleccion = showOptionsMenuAndCaptureOptionbuy();
        while(seleccion!=7)

        {
            switch (seleccion) {

                case 1 ->venta.Venta(productos);
                //case 2 -> ;implementacion para ver historial de factura
                case 3-> {Main.showOptionsMenuAndCaptureOptionPrincipal();
                             return;}


            }
            seleccion = showOptionsMenuAndCaptureOptionbuy();


        }

    }



    private int showOptionsMenuAndCaptureOptionbuy() {
        System.out.println("      Bienvenido " +
                "\n" +
                " /////////////\\\\\\\\\\\\\n" +
                "(((((((((((((   \\\\\\\\\\\\\n" +
                "))) ~~      ~~   (((\n" +
                "((( (*)     (*)  )))\n" +
                ")))     <        (((\\s\n" +
                "((( '\\\\______/`   )))\\s\n" +
                ")))\\\\___________/(((\\s\n" +
                " (((   _)  (_    )))\\s\\s\n" +
                "      /\\\\__/\\\\\"\"\" +");
        System.out.println("±----------------------------------------±");
        System.out.println("|       Bienvenido a Ventas              |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Realizar una venta                    |");
        System.out.println("2. Historial de venta                    |");
        System.out.println("3. salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 6;
        try {
            seleccion = scanner.nextInt();
            if (seleccion < 1 || seleccion > 6) {
                System.out.println("| The Option selected is not valid. Please try again |");
                showOptionsMenuAndCaptureOptionbuy();
            }
        } catch (Exception e) {
            System.out.println("| The Option selected is not valid. Please try again |");
            System.out.println("Usted esta ingresado otro tipo de caracter");
            showOptionsMenuAndCaptureOptionbuy();
        }
        return seleccion;


    }


    public static void Salir(){
        System.out.println(" Gracias por utilizar nuestro sotfware");

    }
}

