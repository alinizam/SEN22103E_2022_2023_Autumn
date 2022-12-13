/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ITEmployee e=new ITEmployee();
        e.firstName="Ahmet";
        e.LastName="Oğlu";
        e.middleName="Ak";
       
        System.out.println(e.getName());
        System.out.println(e.calculateSalary());
    }
    
}
