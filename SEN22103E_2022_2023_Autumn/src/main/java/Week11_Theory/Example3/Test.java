/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        Employee.factoryName="FSMVÜ";
        e.factoryName="Other";
    
        Employee e1=new Employee();
        e1.factoryName="The other";
        System.out.println(Employee.factoryName);
        createEmp();
        System.out.println(e.factoryName);
        
    }
    
    static void createEmp(){
        Employee.factoryName="Togg";
    }
}
