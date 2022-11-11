/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G1.Example1;

/**
 *
 * @author ali.nizam
 */
class Employee {

    String firstName;
    String lastName;
    int lengthOfEmployment, netSalary;
    
    void setSalary(int salary)
    {
        netSalary=salary;
    }
    
    int getSalary()
    {
        return netSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    

    void DisplayName() {
        System.out.println(firstName + " " + lastName);
    }

    String FindName() {
        return firstName + " " + lastName;
    }

    void calculateEmployeeSalary() {
        if (lengthOfEmployment < 10) {
            netSalary = 3000;
        } else if (lengthOfEmployment >= 10) {
            netSalary = 4000;
        }
    }

    public String getLastName() {
        
        return lastName;
    }

    public void setLastName(String lastName) { 
        this.lastName = lastName;
    }

}
