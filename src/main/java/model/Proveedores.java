package model;

import Tienda_de_barrio_oop.Main;
import Tienda_de_barrio_oop.Productos;

import java.util.*;

public class Proveedores  {
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

    private List<Proveedores> proveedores = new ArrayList<>();
    Scanner impresion = new Scanner(System.in);

    Main m = new Main();

    public Proveedores(String nameProv, int contactProv, int codeProv, String productProv) {
        this.nameProv = nameProv;
        this.contactProv = contactProv;
        this.codeProv = codeProv;
        this.productProv = productProv;
    }

    public List<Proveedores> getProveedores() {
        return proveedores;
    }
    Productos productos = new Productos(06," Arroz   ",1500,30);



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
        proveedores.add(new Proveedores(nameProv,contactProv,codeProv,productProv));

       // proveedores.stream().forEach(supplier -> System.out.println(supplier));

    }

    public void MostrarProveedores() {
        System.out.println(" ingresan a mostrar");
        proveedores.stream().forEach(supplier -> System.out.println(supplier));

    }

    public void DeletProvedore() {
        System.out.println(" indique que proveedor desea eliminar ");
        codeProv = impresion.nextInt();
        proveedores.removeIf(supplier -> supplier.getCodeProv() == codeProv);
        proveedores.forEach(supplier -> System.out.println(supplier));

        System.out.println("Codigo      name     contact    product\n");
    }

    public void EnviarPedido(Productos productos) {

        productos.IngresarProducto();
        System.out.println("Por favor indique el codigo que va realizar el pedido");
        codeProv= impresion.nextInt();
        int altersearch= codeProv;
// busqueda
        Optional<Productos> Send = productos.getProduct().stream()
                .filter(market -> market.getCode() == altersearch)
                .findFirst();
        // impresion
        productos.getProduct().stream().forEach(sendp -> System.out.println(sendp));
        // stock
        productos.getProduct().stream().map(Productos::getStock).forEach(Stock -> System.out.println("Unidades\n"+Stock));

      if (productos.getStock()>= 1){
          System.out.println("A UN QUEDA ALGUITO ");
      }else{
          System.out.println("No queda nada");
      }
        System.out.println("Por favor realice la orden ingrese la  cantidad que necesita  ");
        int suplier= impresion.nextInt();
        System.out.println("Enviando Orden");
        Date date = new Date();


        System.out.println("+-----------------------------------+");
        System.out.println("|         Solicitud  Pedido         |");
        System.out.println("+-----------------------------+");
        System.out.println("|Pedido                        ");
        System.out.println("|"+date                     );
        System.out.print ("|Producto:");productos.getProduct().stream().map(Productos::getName).forEach(market -> System.out.println(market));
        System.out.println("|Uniddes solicitadas:"+suplier);
        System.out.println("|                                    |");
        System.out.println("+-----------------------------------+");
        System.out.println("|       Enviando a provedor          |");
        System.out.println("+-----------------------------------+");

        System.out.println("Envio con exito ");



    }


    @Override
    public String toString() {
        return "Proveedores  nameProv='   contactProv=   codeProv=  productProv= " +
                 nameProv + + contactProv + + codeProv +  productProv;
    }
}
