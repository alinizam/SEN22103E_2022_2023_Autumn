/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G2.Example1;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName;
    String lastName;
    int lengthOfEmployment;
    int netSalary;
    
    void DisplayName()
    {
        System.out.println(firstName+" "+lastName);
    }
    
    String FindName()
    {
        return firstName+" "+lastName;
    
    }
    
    void CalculateSalary()
    {
        if (lengthOfEmployment<10) {
            netSalary=3000;
        }
        else
        {
              netSalary=4000;
        }
    }
    
}
