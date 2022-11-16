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
public class latihan9 {
    public static void main(String[]args){
        int i;
        int pangkat;
        int angka;
        int hasil = 1;
        
        try{
           System.out.print("Angka");
           angka=Integer.parseInt(dataIn.readLine());
           System.out.print("hasil");
           hasil=Integer.parseInt(dataIn.readLine());
        }
        
        for (i=1; i<pangkat; i++){
            hasil = hasil * angka;
        }
        
    }
}
