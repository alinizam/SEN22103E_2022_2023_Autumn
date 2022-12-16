/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Lab;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Factory f=new Factory();
        f.addEmployee(new Employee(10000));
        f.addEmployee(new Manager());
        f.addEmployee(new Manager());
        f.displayEmployeesTypes();
       // System.out.println("Manager number ="+f.getTheNumberOfManager());
        System.out.println(f.getTotalSalary());
    }
    
}
