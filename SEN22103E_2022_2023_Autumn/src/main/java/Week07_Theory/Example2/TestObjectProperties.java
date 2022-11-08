/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class TestObjectProperties {
    public static void main(String[] args) {
        Car c=new Car();
       // System.out.println(c.toString());
        Car c1=new Car();
       // System.out.println(c1.toString());
        c=c1;
        System.out.println(c1);
        System.out.println(c);
    }
}
