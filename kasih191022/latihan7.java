/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih191022;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane; 
public class latihan7 {
    public static void main(String[]args){
        int angka=0;
        String msg= "";
        angka=JOptionPane.showInputDialog("Masukan Angka ");
        
        switch(angka){
            case 1 : msg="satu";
                    break;
            
            case 2 : msg="dua";
                    break;
                    
            case 3 : msg="tiga";
                    break;
             
            case 4 : msg="empat";
                    break;    
                    
            case 5 : msg="lima";
                    break;
            
            default : msg="Invalid number";
                    break;
                    
        JOptionPane.showMessageDialog(null, "Angka " +angka+ "\n"+msg);
        }
    }
}
