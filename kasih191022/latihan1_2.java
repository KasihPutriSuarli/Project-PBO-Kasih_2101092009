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
import java.io.*;
public class latihan1_2 {
     public static void main(String[] args) {   
     BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
     
    int nilai1 = 0;
    int nilai2 = 0;
    int nilai3 = 0;
    int rata = 0;
     
     try{
         System.out.print("Masukkan Nilai 1: ");
         nilai1 = Integer.parseInt(nilaiIn.readline);
         
         System.out.print("Masukkan Nilai 2: ");
         nilai2 = Integer.parseInt(nilaiIn.readline);
         
         System.out.print("Masukkan Nilai 3: ");
         nilai3 = Integer.parseInt(nilaiIn.readline);
     }catch( IOException e ){ 
         System.out.println("Error!"); 
     }
     
        rata = (nilai1 + nilai2 + nilai3)/3;
        
        if(rata >=60){
            System.out.print(rata+"\n:)");
        }
        else{
             System.out.print(rata+"\n:(");
        }
    
     }
}

