
package envoltorio_poo_1182701;

import java.util.Random;

public class Envoltorio_POO_1182701 {

   
    public static void main(String[] args) {
        Lista listado=new Lista();
        Random rmd=new Random();
        
        for(int i=0;i<10;i++)
        {
            listado.agregarNumero(rmd.nextInt(12)); 
            System.out.println(""+listado.getNumero(i));
        }
        
        for(int i=0;i<10;i++)
        {
            listado.mostrarRepetidos(i);
        }
       
       
    }
    
}
