
package envoltorio_poo_1182701;

import java.util.ArrayList;

public class Lista {
   private ArrayList<Integer> Lista=new ArrayList<Integer>(); 
    public Lista() {
    }
   
   public void agregarNumero(int n)
   {
     Lista.add(n);
   }
   
   public int getNumero(int n)
   {
       return Lista.get(n);
   }
   
   public void mostrarRepetidos(int i)
   {
       int c=0,n;
        n=Lista.get(i);
        int repetido=0;
        for(int j=0;j<10;j++)
        {
          if(n==Lista.get(j))
          {
              c++;
          }
        }
        if(i>0)
        {
            for(int k=i;k>=0;k--)
            {
             if(Lista.get(i)==Lista.get(k))
             {
                 repetido++;
             }
            }
        }
        if(repetido>1)
        {
            System.out.print("");
        }
        else
        {
        System.out.println("\nEl numero "+n+" se encuentra: "+c+" veces");
        }
   }
    
}
