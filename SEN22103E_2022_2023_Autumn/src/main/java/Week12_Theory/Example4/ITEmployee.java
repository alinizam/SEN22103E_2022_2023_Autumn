/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
public class ITEmployee extends Employee{
    String computer;

    public String getComputer() {
        return computer;
    }

    @Override
    String getName() {
        return firstName+" "+LastName;
    }

    @Override
    int calculateSalary() {
        return 2*super.calculateSalary(); 
    }
    
    
    
}
