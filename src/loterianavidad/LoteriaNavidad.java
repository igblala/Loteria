/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loterianavidad;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class LoteriaNavidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La aplicación trata de insertar un año y recibir el número premiado "
                + "de loteria Nacional correspondiente \n Nota: Inserta un número erroneo para acabar la app.");
        
        HashMap<Integer, String> hLoteria = new HashMap<Integer, String>();;
        hLoteria.put(2016,"66.513");
        hLoteria.put(2015,"79.140");
        hLoteria.put(2014,"13.347");
        hLoteria.put(2013,"62.246");
        hLoteria.put(2012,"76.058");
        hLoteria.put(2011,"58.268");
        hLoteria.put(2010,"19.259");
        hLoteria.put(2009,"08.294");
        hLoteria.put(2007,"32.365");
        hLoteria.put(2006,"06.381");
        hLoteria.put(2005,"20.297");
        
        
        Boolean loop = true;
        int age;
        
        while(loop){
         age = pideAge();
         if(age != 0) {
            System.out.println(hLoteria.get(age));
         }
         else{
             loop = false;
         }
        }
    }

    public static int pideAge() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un año entre 2016 y 2005");
	int a = teclado.nextInt();
        System.out.println("Hola");
        if( a >= 2005 && a<= 2016){
           return a; 
        }
        else{
            System.out.println("Año introducido no correcto!");
            return 0;
        }
    }
    
}
