/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class bai6 {
    public static void main(String[] args) {
        int n;
        try{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap SO Nguyen:",""));
   
        }catch(java.lang.NumberFormatException e1){
            System.err.println(e1.toString());
        }
        finally{
            System.out.println("Have good fun");
        }
        
        
    }
    
}
