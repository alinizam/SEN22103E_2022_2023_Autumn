/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.firstName="Ahmet";
        e.LastName="Oğlu";
        e.middleName="Ak";
        System.out.println(e.getName());
        ITEmployee eIT=new ITEmployee();
        eIT.firstName="Ahmet";
        eIT.LastName="Oğlu";
        eIT.middleName="Ak";
        System.out.println(eIT.getName());
        
    }
    
    
}
