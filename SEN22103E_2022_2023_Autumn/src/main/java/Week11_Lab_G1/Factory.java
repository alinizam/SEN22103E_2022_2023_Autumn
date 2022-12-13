/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Lab_G1;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Factory {

    ArrayList<Employee> employees = new ArrayList();

    void displayEmployeeMaterialCount() {
        for (Employee employee : employees) {
            System.out.println(employee.firstName + " " + employee.lastName + employee.materials.size());
        }
    }

    int gettotalSalaryOfEmployeesHavingMaterial() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            // if (employee.materials.isEmpty()=false)
            if (employee.materials.size() > 0) {
                totalSalary += employee.salary;
            }
        }
        return totalSalary;
    }
}
