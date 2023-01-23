/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori2101092009.Modul11teori;

/**
 *
 * @author user
 */
public class studentrecordexample {
    public static void main(String[] args){
        studentrecord student1 = new studentrecord();
        
        student1.setName("Kasih");
        student1.setAddress("Solok Selatan");
        student1.setAge(19);
        student1.setMathGrade(89);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(92);
        
        ///tampilkan
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getMathGrade());
        System.out.println("B.Inggris   :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan :"+student1.getScienceGrade());
        System.out.println("Rata-rata   :"+student1.getAverage());
        
        
        studentrecord student2= new studentrecord();
        
        student2.setName("Ridha");
        student2.setAddress("Pariaman");
        student2.setAge(20);
        student2.setMathGrade(90);
        student2.setEnglishGrade(85);
        student2.setScienceGrade(95);
        student2.print("");
        student2.print(student2.getMathGrade(),student2.getEnglishGrade(),
               student2.getScienceGrade());
        
    }
}
