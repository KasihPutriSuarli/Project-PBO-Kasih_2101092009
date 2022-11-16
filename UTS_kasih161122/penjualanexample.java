/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_kasih161122;

/**
 *
 * @author user
 */
public class penjualanexample {
     public static void main( String[] args ){
         
         penjualan penjualan1 = new penjualan();
        
         penjualan1.setFaktur("1283435");
         penjualan1.setPelanggan("Kasih");
         penjualan1.setKode("2101092009");
         penjualan1.setHarga(145000);
         penjualan1.setJumlah(3);
         
         System.out.println("No Faktur = "+penjualan1.getFaktur());
         System.out.println("Nama Pelanggan = "+penjualan1.getPelanggan());
         System.out.println("Kode Penjualan = "+penjualan1.getKode());
         System.out.println("Harga = "+penjualan1.getHarga());
         System.out.println("Jumlah Barang = "+penjualan1.getJumlah());
         System.out.println("Total Harga = "+penjualan1.getTotal());
         System.out.println("Diskon = "+penjualan1.getDiskon());
         System.out.println("Total Bayar = "+penjualan1.getBayar());
            
     }
    
}

