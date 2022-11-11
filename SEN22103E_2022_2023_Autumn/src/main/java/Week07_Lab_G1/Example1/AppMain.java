/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G1.Example1;

/**
 *
 * @author ali.nizam
 */
public class AppMain {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.firstName="fatih";
        emp1.setLastName("sultan");
        emp1.DisplayName();
        String rvalue=emp1.FindName();
        System.out.println(rvalue);
        
        emp1.lengthOfEmployment=15;
        emp1.calculateEmployeeSalary();
        System.out.println("Net salary =" + emp1.netSalary);
        
        emp1.setLastName(rvalue);
    
    }
}
