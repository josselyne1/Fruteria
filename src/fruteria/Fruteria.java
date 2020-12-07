/*
 * 4.	Una frutería ofrece las manzanas con descuento según la siguiente tabla:
		NUM. DE KILOS COMPRADOS		% DESCUENTO
			  0      -   2					  0%
			  2.01 -   5 					10%
			  5.01 - 10					15%
			10.01 en adelante				20%

Determinar cuánto pagara una persona que compre manzanas es esa frutería.

 */
package fruteria;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez cod: 20201187434
 */
public class Fruteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        final int valorkilo=2000;
        int nkilos,dto=0,valorcompra,valordtto,valorpagar;
        System.out.println("ingrese cuantos kilos de manzana quiere comprar");
        nkilos=entrada.nextInt();
        
        if (nkilos<=2){
            dto=0;
            System.out.println("no tiene descuento");
            System.out.println("su total a pagar es "+valorkilo*nkilos);
        }
        else{
            if (nkilos<=5){
                dto=10;
            }
            else{
                if (nkilos<=10){
                    dto=15;
                }
                else {
                    dto=20;
                    
                }
            }
            valorcompra=nkilos*valorkilo;
            valordtto=valorcompra*dto/100;
            valorpagar=valorcompra-valordtto;
            System.out.println("-------------------------------");
            System.out.println("valor de la compra  :"+valorcompra);
            System.out.println("-----------------------------");
            System.out.println("valor del descuento :"+valordtto);
            System.out.println("------------------------");
            System.out.println("valor a pagar  :"+valorpagar);
        }
    }
    
}
