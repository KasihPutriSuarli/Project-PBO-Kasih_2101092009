/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih191022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author user
 */
public class latihan5 {
     public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        double rata = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        
        try{
        System.out.print("Angka pertama : ");
        a1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Angka kedua   : ");
        a2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Angka ketiga   : ");
        a3 = Integer.parseInt(dataIn.readLine());
       
        }
        catch( IOException e ){
        System.out.println("Error!");
        }
        
        rata = (a1 + a2 + a3)/ 3 ;
        System.out.println( "Rata = " +rata); 
        
        if( rata >= 90 ){
            System.out.println( "Excellent!:)" );
        }
        else if( (rata < 90) && (rata >= 80)){
            System.out.println("Good job!:)" );
        }
        else if( (rata < 80) && (rata >= 60)){
            System.out.println("Study harder!:)" );
        }
        else{
            System.out.println("Sorry, you failed:(");
        }

    }
}
