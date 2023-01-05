/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    int netSalary;
    class SalaryInner extends Salary{
        @Override
        int getSalary() {
            return netSalary*super.getSalary(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    
    }
}
