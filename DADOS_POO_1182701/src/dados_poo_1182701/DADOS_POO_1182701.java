
package dados_poo_1182701;

import java.util.Scanner;


public class DADOS_POO_1182701 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int lados,op;
        
        System.out.println("Queire jugar con dados de 6 o 12 lados?");
        lados=teclado.nextInt();
        Dado dado=new Dado(lados);
        System.out.println("\n\t\tMENU\n[1]Lanzar dado\n[2]Lanzar 5 dados");
        op=teclado.nextInt();
        switch(op)
        {
            case 1:
                System.out.println("EL RESULTADO DEL LANZAMIENTO ES: "+dado.lanzarDado());
                
            break;
            
            case 2:
                dado.lanzar5Dados();
                System.out.println("QUE DADO QUIERE VER:\n[1]DADO 1\n[2]Dado 2\n[3]Dado 3\n[4]Dado 4\n[5]Dado 5\nDado: ");
                op=teclado.nextInt();
                System.out.println("El DADO "+op+" SALIO: "+dado.getDado(op-1));
                
            break;
            
            default:System.out.println("OPCION INVALIDA");
        }
               
    }
    
}
