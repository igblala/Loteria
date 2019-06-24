/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loterianavidad;

import java.util.HashMap;
import java.util.Scanner;
import objectLoteria.Loteria;
import objectLoteria.LoteriaLista;

/**
 *
 * @author nacho
 */
public class LoteriaNavidad {
    private static LoteriaLista m_loteriaLista = new LoteriaLista();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        inicializarLoteria();
                
        Boolean loop = true;
        int age;
        
        while(loop){
         age = pideAge();
         if(age != 0) {
            System.out.println(m_loteriaLista.readLoteriaAño(age));
         }
         else{
             loop = false;
         }
        }
    }

    public static int pideAge() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un año entre 2016 y 2020");
	int a = teclado.nextInt();
        System.out.println("Hola");
        if( a >= 2016 && a<= 2020){
           return a; 
        }
        else{
            System.out.println("Año introducido no correcto!");
            return 0;
        }
    }
    public static void inicializarLoteria(){
        m_loteriaLista.addLoteriaToList(new Loteria( new Integer(2016), new Integer(66513) ) );
        m_loteriaLista.addLoteriaToList(new Loteria( new Integer(2017), new Integer(66514) ) );
        m_loteriaLista.addLoteriaToList(new Loteria( new Integer(2018), new Integer(66515) ) );
        m_loteriaLista.addLoteriaToList(new Loteria( new Integer(2019), new Integer(66516) ) );
        m_loteriaLista.addLoteriaToList(new Loteria( new Integer(2020), new Integer(66517) ) );
        
    }
    
}
