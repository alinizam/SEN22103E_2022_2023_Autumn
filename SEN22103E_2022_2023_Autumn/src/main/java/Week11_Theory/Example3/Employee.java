/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName,lastName;
    int salary;
    static String factoryName;

    String getFactoryName() {
        return factoryName;
    }
    
    static String getFactoryNameStatic() {
        return factoryName;
    }
    
    /*Error
    static String getFactoryNameWithEmployee() {
        //return factoryName +this.firstName;
        return getFactoryName();
    }*/
    
    
}
