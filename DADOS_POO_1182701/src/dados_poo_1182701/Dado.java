
package dados_poo_1182701;

import java.util.ArrayList;
import java.util.Random;


public class Dado {
  private int lados;
  private ArrayList<Integer> dados=new ArrayList<Integer>();
    public Dado()
    {
        lados=0;
    }
    
    public Dado(int lados)
    {
    this.lados=lados;
    }
    
    public int lanzarDado()
    {
        Random rmd=new Random();
        return rmd.nextInt(lados)+1;
    }
    
    public void lanzar5Dados()
    {
        for(int i=0;i<5;i++)
        {
            dados.add(lanzarDado());
        }
    }
    
    public int getDado(int n)
    {
        return dados.get(n);
    }
}
