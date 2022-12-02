/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Lab_G1.Example1;

/**
 *
 * @author ali.nizam
 */
class TestClass {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John";
        employee.title="CIO";
        employee.salary=10000;
        employee.bonusPayment[0] = 100;
        
        Employee employee2 = new Employee();
        employee2.name = "Ahmed";
        employee2.title="Prog";
        employee2.salary=100000;
        
        Employee employee3 = new Employee();
        employee3.name = "Ahmwed";
        employee3.title="Prog";
        employee3.salary=100000;
        employee3.bonusPayment[2] = 100;

        Factory fact = new Factory();
        
        fact.addEmployee(employee);
        fact.addEmployee(employee2);
        fact.addEmployee(employee3);
        
        fact.getNoBonusEmployees();
        
    }
}
