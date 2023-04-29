
package baraja_poo_1182701;

import java.util.Random;
 import java.util.Scanner;

public class Baraja_POO_1182701 {

 
    public static void main(String[] args) {
       Random rmd=new Random(); 
       Scanner teclado=new Scanner(System.in);
       Baraja Mazo=new Baraja();
       Carta cartaElegida=new Carta();
       
      int n=rmd.nextInt(Mazo.getSize());
      cartaElegida=Mazo.getCarta(n);
      Mazo.removerCarta(n);
      
        System.out.println(""+cartaElegida.toString());
       
    }
    
}
