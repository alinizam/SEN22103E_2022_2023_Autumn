/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Lab_G1.Example1;

/**
 *
 * @author ali.nizam
 */
class Factory {

    Employee[] employees = new Employee[5];

    public void addEmployee(Employee emp) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                return;
            }
        }
    }

    int getTotalSalary(String jobTitle) {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].title == jobTitle) {
                total += employees[i].salary;
            }
        }
        return total;
    }
    
    void incSalaryByIndex(int arrayIndex, int increase){
        employees[arrayIndex].salary=employees[arrayIndex].salary+increase;
    }
    
    void incSalaryByID(int employeeId, int increase){
          for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].id == employeeId) {
                 employees[i].salary += increase;
                 break;
            }
        }
    }
    
     void incSalaryByLimit(int limit, int increase){
          for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].salary< limit) {
                 employees[i].salary += increase;
            }
        }
    }
     
     void getNoBonusEmployees() {
         for (int i = 0; i < employees.length; i++) {
             if (employees[i] != null) {
                 int sum = 0;
                 for (int j = 0; j < employees[i].bonusPayment.length; j++) {
                     sum += employees[i].bonusPayment[j];
                 }
                 if (sum == 0) {
                     System.out.println(employees[i].name);
                 }
             }
         }
     }
     
     void getNoBonusEmployeesShortened() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getTotalBonus() == 0) {
                System.out.println(employees[i].name);
            }
        }
    }
}
