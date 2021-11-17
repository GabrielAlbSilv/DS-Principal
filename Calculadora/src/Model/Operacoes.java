
package Model;

import javax.swing.JOptionPane;


public class Operacoes {
    
    public static void soma(){
    
    View.principal_view.v1 = Integer.parseInt ( View.principal_view.val1.getText()); //pegando o valor 1 da caixa de texto e convertendo
    View.principal_view.v2  = Integer.parseInt ( View.principal_view.val2.getText()); //pegando o valor 2 da caixa de texto e convertendo

     View.principal_view.v3 = ( View.principal_view.v1+ View.principal_view.v2);
      JOptionPane.showMessageDialog(null, "O resultado da soma é: "+ View.principal_view.v3);
    
    }
    
    public static void sub(){
    
    View.principal_view.v1 = Integer.parseInt ( View.principal_view.val1.getText()); //pegando o valor 1 da caixa de texto e convertendo
    View.principal_view.v2  = Integer.parseInt ( View.principal_view.val2.getText()); //pegando o valor 2 da caixa de texto e convertendo

     View.principal_view.v3 = ( View.principal_view.v1 - View.principal_view.v2);
      JOptionPane.showMessageDialog(null, "O resultado da soma é: "+ View.principal_view.v3);
    
    }
    
    public static void multi(){
    
    View.principal_view.v1 = Integer.parseInt ( View.principal_view.val1.getText()); //pegando o valor 1 da caixa de texto e convertendo
    View.principal_view.v2  = Integer.parseInt ( View.principal_view.val2.getText()); //pegando o valor 2 da caixa de texto e convertendo

     View.principal_view.v3 = ( View.principal_view.v1 * View.principal_view.v2);
      JOptionPane.showMessageDialog(null, "O resultado da soma é: "+ View.principal_view.v3);
    
    }
    
     public static void div(){
    
    View.principal_view.v1 = Integer.parseInt ( View.principal_view.val1.getText()); //pegando o valor 1 da caixa de texto e convertendo
    View.principal_view.v2  = Integer.parseInt ( View.principal_view.val2.getText()); //pegando o valor 2 da caixa de texto e convertendo

     View.principal_view.v3 = ( View.principal_view.v1 / View.principal_view.v2);
      JOptionPane.showMessageDialog(null, "O resultado da soma é: "+ View.principal_view.v3);
    
    }
}
