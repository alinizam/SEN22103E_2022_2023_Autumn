/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Department {

    String deptName;
    static ArrayList<Employee> employees = new ArrayList();

    static class EmployeeOperation {

        void addEmployee(Employee e, IPayment p) {
            e.payments.add(p);
            employees.add(e);

            /*Second solution
            employees.add(e);
            for (Employee employee : employees) {
                if (employee==e){
                    employee.payments.add(p);
                }            
            }*/
        }

        ArrayList getEmployeeExeedingAdvance() {
            int totalSalary = 0, totalAdvance = 0;
            ArrayList<Employee> selectedEmployee = new ArrayList();
            for (Employee employee : employees) {
                totalSalary = 0;
                for (IPayment salary : employee.payments) {
                    totalSalary += ((Employee.Salary) salary).net + ((Employee.Salary) salary).tax;
                }
                totalAdvance = 0;
                for (IPayment salary : employee.advances) {
                    totalAdvance += ((Employee.Salary) salary).net + ((Employee.Salary) salary).tax;
                }
                if (totalAdvance > totalAdvance) {
                    selectedEmployee.add(employee);
                }
            }
            return selectedEmployee;

        }

    }

    ArrayList getEmployeeExeedingAdvanceNew() {
        int totalSalary = 0, totalAdvance = 0;
        ArrayList<Employee> selectedEmployee = new ArrayList();
        for (Employee employee : employees) {
            totalSalary = 0;
            for (IPayment salary : employee.payments) {
                if (salary instanceof IPayment) {
                    totalSalary += salary.getTotalSalary();
                } else {
                    totalAdvance += salary.getTotalSalary();
                }
            }

            if (totalAdvance > totalAdvance) {
                selectedEmployee.add(employee);
            }
        }
        return selectedEmployee;

    }

    void addPaymentToEmpoyeesNew(IPayment p, String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.firstName.equals(firstName) && employee.lastName.equals(lastName)) {
                if (p instanceof IPayment) {
                    employee.payments.add(p);
                } else {
                    employee.advances.add(p);
                }

            }
        }

    }

}
