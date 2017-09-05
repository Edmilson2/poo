
package Recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author Edmilson David
 */
public class DecimalParaBinario {
    
    public static int Decimal(String numero){
        if(numero.length()==0)
    return numero.length();
    return Decimal(numero.substring(1))+(int)Math.pow(2,numero.length()-1)*Character.getNumericValue(numero.charAt(0));
    }
    
    public static void main(String[] args) {
        String n=JOptionPane.showInputDialog(null,"Introduza o numero!");
        JOptionPane.showMessageDialog(null,Decimal(n));
    }
    
}
