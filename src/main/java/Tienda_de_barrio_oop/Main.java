package Tienda_de_barrio_oop;

//import model.Product;
 import model.Proveedores;
 import model.Venta;
import org.w3c.dom.ls.LSOutput;

 import java.beans.Expression;
 import java.util.Optional;
import java.util.Scanner;

public class Main {


    Scanner impresion = new Scanner(System.in);

    public static void main(String[] args) {

        Productos productos = new Productos(06, "Arroz", 1500, 30);

        Venta venta = new Venta();
        Menu menu = new Menu();


        int seleccion = showOptionsMenuAndCaptureOptionPrincipal();
        while (seleccion != 7) {
            switch (seleccion) {


                case 1 -> menu.MenuProductos();
                case 2 -> menu.MenuVentas();
                case 3 -> menu.MenuProveedor();


            }
            seleccion = showOptionsMenuAndCaptureOptionPrincipal();


        }


    }


    static int showOptionsMenuAndCaptureOptionPrincipal() {
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
        System.out.println("|   Bienvenido a mi tienda de barrio     |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Inventario                            |");
        System.out.println("2. Venta                                 |");
        System.out.println("3. Proveedores                           |");
        System.out.println("4. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 4)  ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 6;
        try {
               seleccion = scanner.nextInt();
               if (seleccion < 1 || seleccion > 5) {
                   System.out.println("| The Option selected is not valid. Please try again |");
                   showOptionsMenuAndCaptureOptionPrincipal();
               }
           } catch (Exception e) {
               System.out.println("| The Option selected is not valid. Please try again |");
               System.out.println("Usted esta ingresado otro tipo de caracter");
               showOptionsMenuAndCaptureOptionPrincipal();
           }
           return seleccion;
       }

    }



