/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih021122;

/**
 *
 * @author user
 */
public class studentrecord1 {
    public static void main (String[] args){
        studentrecord student3 = new studentrecord("Iqbal","Padang",21);
        
        student3.setAge(21);
        student3.print("");
        
        studentrecord student4 = new studentrecord();
        student4.print("");
        System.out.println("Jumlah siswa" +studentrecord.getStudentCount());
        
    }
}
