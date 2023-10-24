package model;

import Tienda_de_barrio_oop.AbstracProducto;
import Tienda_de_barrio_oop.Productos;
import java.util.Date;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

    public class Venta {

        Scanner impresion = new Scanner(System.in);
        Productos productos = new Productos();
        public void Venta(){

            productos.Inventario();


            System.out.print("Por favor ingrese el codigo del producto a vender: ");
            int codigoproducto = impresion.nextInt();
            int pos =productos.getCodigo().indexOf(codigoproducto);
            System.out.println("codigo    Producto     Unidades existentes     Precio ");
            System.out.println(productos.getCodigo().get(pos) +"      "+ productos.getProduct().get(pos) +"       "+ productos.getCantidad().get(pos)+"              " + productos.getPrice().get(pos));
            System.out.println("cuantas unidades va a compar");
            int uniCompras = impresion.nextInt();
            double iva = 0.19;
            double suma = (uniCompras*productos.getPrice().get(pos));
            double totalIva =suma*iva;
            double total = suma+totalIva;
            Date date = new Date();
            System.out.println("+-----------------------------------+");
            System.out.println("|           Mi Tienda               |");
            System.out.println("+-----------------------------+");
            System.out.println("|Venta                        ");
            System.out.println ("|"+date                     );
            System.out.println ("|Producto:"+productos.getProduct().get(pos));
            System.out.println("|Uniddes:"+uniCompras);
            System.out.println("|Precio Unitario: "+productos.getPrice().get(pos)+"pesos");
            System.out.println("|Total sin IVA:"+suma+"  pesos");
            System.out.println("|IVA 19% :"+totalIva+" pesos");
            System.out.println("|Total:"+total);
            System.out.println("+-----------------------------------+");
            System.out.println("       Gracias por su compra ");
            System.out.println("+-----------------------------------+");


        }

}