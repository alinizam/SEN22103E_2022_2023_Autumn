/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Employee.getCompany());
        
        Employee e=new Employee();
        Person p=e;
        System.out.println(p.getCompany());
    }
}
