/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih161222teori;

/**
 *
 * @author user
 */
public class ContohException {
    public static void main(String[] args) {
        try {
            int a = 1/10;
            system.out.println("Hasil a = "+a);      
        }catch(java.lang.ArithmeticException ex){
        system.out.println("Error "+ex.getMessage());
        }
    }
}

