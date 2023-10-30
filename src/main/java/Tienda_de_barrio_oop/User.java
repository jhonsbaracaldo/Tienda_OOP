

package Tienda_de_barrio_oop;

import java.util.*;

public class User {
    private String nameProv;
    private int contactProv;

    private int codeProv;
    private String productProv;

    public String getNameProv() {
        return nameProv;
    }

    public void setNameProv(String nameProv) {
        this.nameProv = nameProv;
    }

    public int getContactProv() {
        return contactProv;
    }

    public void setContactProv(int contactProv) {
        this.contactProv = contactProv;
    }

    public int getCodeProv() {
        return codeProv;
    }

    public void setCodeProv(int codeProv) {
        this.codeProv = codeProv;
    }

    public String getProductProv() {
        return productProv;
    }

    public void setProductProv(String productProv) {
        this.productProv = productProv;
    }

    private List<User> proveedores = new ArrayList<>();
    Scanner impresion = new Scanner(System.in);

    Main m = new Main();

    public User(String nameProv, int contactProv, int codeProv, String productProv) {
        this.nameProv = nameProv;
        this.contactProv = contactProv;
        this.codeProv = codeProv;
        this.productProv = productProv;
    }

    public List<User> getProveedores() {
        return proveedores;
    }
    public void MenuProductos (){
        int seleccion = showOptionsMenuAndCaptureOption();
        while(seleccion!=7)

        {
            switch (seleccion) {

                case 1 -> IngresandoProveedor();
                case 2 -> MostrarProveedores();
              //  case 3 -> productos.ModificarProducto();
               // case 4 -> productos.PrintProduct();
             //   case 5 ->venta.Venta(productos);
                //  case 6 -> Main.showOptionsMenuAndCaptureOptionPrincipal();


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
            showOptionsMenuAndCaptureOption();
        }
        return seleccion;


    }









    public void IngresandoProveedor() {

        System.out.print("Asigne un codigo al Proveedor ");
        codeProv = impresion.nextInt();

        System.out.print("Ingrese el nombre del Proveedor: ");
        nameProv = impresion.next();
        System.out.print("Ingrese el numero de contacto del proveedor: ");
        contactProv = impresion.nextInt();
        System.out.print("Ingrese el producto que vende el proveedor: ");
        productProv = impresion.next();
        System.out.println("Porveedor ingresado exitosamente");
        proveedores.add(new User(nameProv,contactProv,codeProv,productProv));

        // proveedores.stream().forEach(supplier -> System.out.println(supplier));
        System.out.println(codeProv);
    }


    public void MostrarProveedores() {
        System.out.println(" ingresan a mostrar");
        proveedores.stream().forEach(supplier -> System.out.println(supplier));

    }
}



