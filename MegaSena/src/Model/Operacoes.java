
package Model;

import java.util.Random;  //chamando biblioteca da função Radom
import javax.swing.JOptionPane;

public class Operacoes {
    public static String x = " "; //tornando String x publica em toda classe Operações
    
    public static void SorteMega(){
    
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[6];
        
       
        for(i=0; i<6; i++){
        
        vet [i] = Gera.nextInt(60); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
      
 
    }
}
