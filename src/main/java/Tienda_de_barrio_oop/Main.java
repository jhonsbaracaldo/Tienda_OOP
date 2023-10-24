package Tienda_de_barrio_oop;

import model.Product;
import model.Venta;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           Productos productos = new Productos();
        Venta venta = new Venta();
           Scanner impresion = new Scanner(System.in);



        int seleccion = showOptionsMenuAndCaptureOption();
           while (seleccion!= 7)
           {
               switch (seleccion )
               {

                   case 1 -> productos.IngresarProducto();
                   case 2 -> productos.EliminarProducto();
                   case 3 -> productos.ModificarProducto();
                   case 4 ->productos.Inventario();
                   case 5 ->venta.Venta();
                   case 6-> Salir();



               }
               seleccion= showOptionsMenuAndCaptureOption();




           }
    }

    private static int showOptionsMenuAndCaptureOption() {
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
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Venta                                 |");
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
            showOptionsMenuAndCaptureOption();
        }
        return seleccion;


    }

    public static void Salir(){
        System.out.println(" Gracias por utilizar nuestro sotfware");

    }
}


