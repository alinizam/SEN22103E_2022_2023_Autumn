/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G2.Example1;

/**
 *
 * @author ali.nizam
 */
public class AppMain {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.firstName="fatih";
        emp1.lastName="sultan";
        emp1.DisplayName();
        String rvalue= emp1.FindName();
        System.out.println(rvalue);
        
        emp1.lengthOfEmployment=8;
        emp1.CalculateSalary();
        System.out.println(emp1.netSalary);
        
        emp1.lengthOfEmployment=11;
        emp1.CalculateSalary();
        System.out.println(emp1.netSalary);
        
        
        /*Employee emp2= new Employee();
        emp2.firstName="yavuz";
        emp2.lastName="sultan";
        emp2.DisplayName();*/
    
        
    }
}
