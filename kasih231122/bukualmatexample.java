/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih231122;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bukualmatexample {
    public static void main(String[]args){
    bukualamat bukualamat []= new bukualamat[100];
    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
    
    int a[]= new int[100];
    int jumlah =2;
    
    try{
    for (int i=0; i<jumlah; i++){
        
        System.out.println("Data Alamat ke ->" + (i+1));
        bukualamat bukualamat1 = new bukualamat();
        System.out.print("Nama  :");
        bukualamat1.setNama(dataIn.readLine());
        System.out.print("Alamat    :");
        bukualamat1.setAlamat(dataIn.readLine());
        System.out.print("Email  :");
        bukualamat1.setEmail(dataIn.readLine());
        System.out.print("No Telepon :");
        bukualamat1.setNotelp(dataIn.readLine());
        bukualamat[i] = bukualamat1;
    }
   }catch (Exception ex){
   } //tampil
    System.out.println("===========Tampilkan Data=========");
    for(int i=0; i<jumlah; i++){
        System.out.println("Data ke ->" +(i+1));
        System.out.print("Nama          :" +bukualamat[i].getNama());
        System.out.print("Alamat        :" +bukualamat[i].getAlamat());
        System.out.print("Email         :" +bukualamat[i].getEmail());
        System.out.print("No Telepon    :" +bukualamat[i].getNotelp());
    }
  }
}
