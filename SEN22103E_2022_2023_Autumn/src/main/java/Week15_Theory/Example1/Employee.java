/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName, lastName;
    //int salary;
    int netSalary;
    int commission;
    int getSalary(){
        return commission; 
    }
    
    class Salary{
        int commission;
        int year;
        int month;
        
        int getSalary(){
            return  netSalary*(1+commission);
        }
    
    }
}
