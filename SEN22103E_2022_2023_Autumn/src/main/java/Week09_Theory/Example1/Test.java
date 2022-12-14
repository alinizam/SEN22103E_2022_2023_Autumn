/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        int increaseAmount=5;
        emp.changeSalary(increaseAmount);
        System.out.println(increaseAmount);
        
        // Change object's attribute
        Factory f=new Factory();
        emp.salary=10000;
        f.increaseSalaryofEmployee(emp);
        System.out.println(emp.salary);
        
        
        Employee newEmp=f.createNewEmployee();
        f.assignBoss(newEmp);
        
        Employee e1=new Employee();
        System.out.println(e1.getClass());
        System.out.println(e1.toString());
        
        Object o=new Object();
        e1=newEmp;
        System.out.println(e1.equals(newEmp));
        
        
        
        
        
    }
}
