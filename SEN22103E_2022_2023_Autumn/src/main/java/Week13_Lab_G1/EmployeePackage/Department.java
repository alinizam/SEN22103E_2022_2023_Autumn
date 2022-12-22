/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Lab_G1.EmployeePackage;

import Week13_Lab_G1.JobPackage.Job;
import Week13_Lab_G1.JobPackage.Officer;
import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Department {
    private ArrayList<Employee> employees=new ArrayList();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    
    void displayOfficerAddress(){
        for (Employee employee : employees) {
            boolean isOfficer=false;
            for (Job j:employee.getJobs()){
                if (j instanceof Officer){
                    isOfficer=true;
                    break;  
                }
            }
            if (isOfficer){
                //System.out.println(employee.addresses);
                for(String a:employee.addresses){
                    System.out.println(a);
                }
            }
        }
    
    } 
    
    Employee getMaxSalaryEmployee(){
        int maxSalary=-1;
        Employee employeeHasMaxSalary=null;
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary()>maxSalary){
                maxSalary=employee.getEmployeeSalary();
                employeeHasMaxSalary=employee;
            }
            
        }
        return employeeHasMaxSalary;
    }
}
