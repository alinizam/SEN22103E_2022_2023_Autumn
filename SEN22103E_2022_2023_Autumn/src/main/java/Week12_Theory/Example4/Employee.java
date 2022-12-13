/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
class Employee {
    public String firstName,LastName,middleName;
    private int salary;
    protected int commission;

    protected int getCommission() {
        return commission;
    }
    String getName(){
        return firstName+" "+middleName+" "+LastName;
    }
    int calculateSalary(){
        //do something
        return 15000;
    }
}
