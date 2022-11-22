/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    int salary;
    int getSalary(){
        int salary=this.salary;
        this.salary=salary;
        return salary;
    }
    
    void changeSalary(int increase){
        increase=10;        
    }
}
