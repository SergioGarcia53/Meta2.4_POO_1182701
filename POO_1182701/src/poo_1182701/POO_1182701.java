
package poo_1182701;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class POO_1182701 {
 
    public static void main(String[] args) 
    {
     ArrayList<Boolean> lanzamientos = new ArrayList<Boolean>();
     Scanner teclado=new Scanner(System.in);
     Random rand = new Random();
     int op,L;
     Moneda moneda=new Moneda();
        
     do{
         System.out.println("\n[1]Lanzar moneda\n[2]Mostrar lanzamientos\n[3]Salir");
         System.out.println("\nOpcion: ");
         op=teclado.nextInt();
         
         switch(op)
         {
             case 1:
                 L=rand.nextInt(2);
                 lanzamientos.add(moneda.lanzarMoneda(L));
                 System.out.println(""+moneda.toString());                 
             break;
             
             case 2:
                 for(int i=0;i<lanzamientos.size();i++)
                 { 
                 Boolean lanzamiento=lanzamientos.get(i);
                    if(lanzamiento==false)
                    {
                     System.out.print("Aguila\n");
                    }
                    else
                    {
                        System.out.print("Sol\n");
                    }
                 }
             break;
             
             case 3:
                 System.out.println("QUE TENGA UN BUEN DIA :)");
             break;
             
             default: System.out.println("OPCION NO VALIDA");
         }
     }while(op!=3);
        
    }
    
}
