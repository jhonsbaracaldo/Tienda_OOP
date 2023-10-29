package model;

import Tienda_de_barrio_oop.AbstracProducto;
import Tienda_de_barrio_oop.Productos;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

import java.security.PublicKey;


public class Venta  {

        Scanner impresion = new Scanner(System.in);


        public void Venta( Productos productos){
            if (productos.getProduct().isEmpty()) {
                productos.PrintProduct();

            }

            System.out.println(" Ingrese el codigo del producto a vender");
            int code = impresion.nextInt();
            int altersearch= code;

            Optional<Productos> MarketProduct = productos.getProduct().stream()
                    .filter(market -> market.getCode() == altersearch)
                    .findFirst();
            productos.getProduct().stream().forEach(buy -> System.out.println(buy));


            System.out.println("Por favor indique las unidades a comprar: ");
            int units = impresion.nextInt();
            double iva = 0.19;

            double suma = productos.getProduct().stream()
                    .filter(producto -> producto.getCode() == altersearch)
                    .mapToDouble(producto -> units * producto.getPrice()) // Calcular la suma
                    .sum();


            double totalIva =suma*iva;
            double total = suma+totalIva;
            Date date = new Date();
            System.out.println("+-----------------------------------+");
            System.out.println("|           Mi Tienda               |");
            System.out.println("+-----------------------------+");
            System.out.println("|Venta                        ");
            System.out.println ("|"+date                     );
            System.out.print ("|Producto:");productos.getProduct().stream().map(Productos::getName).forEach(market -> System.out.println(market));
            System.out.println("|Uniddes:"+units);
            System.out.print("|Precio Unitario: ");productos.getProduct().stream().map(Productos::getPrice).forEach(marketP -> System.out.println(marketP));
            System.out.println("|Total sin IVA:"+suma+"  pesos");
            System.out.println("|IVA 19% :"+totalIva+" pesos");
            System.out.println("|Total:"+total);
            System.out.println("+-----------------------------------+");
            System.out.println("       Gracias por su compra ");
            System.out.println("+-----------------------------------+");

        }

}