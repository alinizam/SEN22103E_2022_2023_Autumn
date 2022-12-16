/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    ArrayList<Employee> employees=new ArrayList();
    void addEmployee(Employee e){
        employees.add(e);
    }
    void displayEmployeesTypes(){
        for (Employee employee : employees) {
            System.out.println(employee.getClass());
        }
    
    }
    int getTheNumberOfManager(){
        int total=0;
        for (Employee employee : employees) {
            if(employee.getClass().toString().equals("class Week12_Lab_G1.Manager")){
                total++;
            } 
        }
        
        return total;
    }
    int getTotalSalary(){
        int totalSalary=0;
        for (Employee employee : employees) {
            totalSalary+=employee.salary;
        }
        return totalSalary;
    }
}
