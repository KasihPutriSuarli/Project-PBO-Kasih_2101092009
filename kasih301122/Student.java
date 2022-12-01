/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih301122;

/**
 *
 * @author user
 */
public class Student extends person {
    
    public Student(){
        super ("Ali","Padang");
        super.name="somename";
        super.address="some address";
        System.out.println("Inside Student:Constructor");
     } 
    
    public static void main( String[] args ){
        Student anna = new Student();
        System.out.println(anna.name);
    }

}

