
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Multiplique {
    
    public static int multplicacao(int num1, int num2){
        if(num1==0){
           return num1;
              } 
            return multplicacao(num1-1, num2)+num2;
         }
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
        JOptionPane.showMessageDialog(null, multplicacao(num1, num));
    }
}
