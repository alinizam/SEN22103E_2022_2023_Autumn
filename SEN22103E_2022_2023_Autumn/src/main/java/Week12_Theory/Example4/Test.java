/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
public class Test {
    
    public static void main(String[] args) {
        Employee e=new Employee();
        ITEmployee itEmployee=new ITEmployee();
        itEmployee.firstName="Ahmet";
        itEmployee.LastName="AK";
        System.out.println(itEmployee.getName());
        System.out.println(itEmployee.calculateSalary());
    }
    
}
