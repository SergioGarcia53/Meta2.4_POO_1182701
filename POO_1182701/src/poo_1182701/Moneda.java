
package poo_1182701;

public class Moneda 
{
    private boolean lado;
    
    public Moneda()
    {
        lado=false;
    }

    public boolean getLado() 
    {
        return lado;
    }

    public void setLado(boolean lado) 
    {
        this.lado = lado;
    }
    
    public String toString() 
    {
        if(this.lado==false)
        {
            return "Aguila";
        }
             else
            {
            return "Sol";
            }
        
    }
    
    public boolean lanzarMoneda(int n)
    {
      if(n==0)
        {
            this.lado=false;
            return false;
        }
             else
            {
            this.lado=true;    
            return true;
            }  
    }
    
}
