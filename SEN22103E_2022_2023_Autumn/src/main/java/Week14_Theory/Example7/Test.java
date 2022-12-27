/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        System.out.println(e1.compare(e2));
        Car c=new Car();
        System.out.println(e1.compare(c));
        Object o=new Object();
        System.out.println(e1.compare(o));
    }
}
