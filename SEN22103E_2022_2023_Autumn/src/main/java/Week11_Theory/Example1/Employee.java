/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    
    String firstName,lastName;
    int salary;
 

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }  

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
