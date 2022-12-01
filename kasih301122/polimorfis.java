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
public class polimorfis {
    public static void main (String[]args){
        person ref ;
        Student student = new Student();
        employee Employee = new employee();
        
        ref = student;
        String name = ref.getName();
        System.out.println(name);
        //
        
        ref = Employee;
        String name1 = ref.getName();
        System.out.println();
        
        printInformation(student);
        printInformation(student);
        
    }
    
    public static void printInformation(person Person){
        if(Person instanceof Student){
            System.out.println("Nama student" +Person.getName());
        }else 
        if(Person instanceof employee){
            System.out.println("Nama student" +Person.getName());
        }
    }
}
