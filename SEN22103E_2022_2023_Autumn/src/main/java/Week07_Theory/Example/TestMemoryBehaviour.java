/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Theory.Example;

/**
 *
 * @author ali.nizam
 */
public class TestMemoryBehaviour {
    public static void main(String[] args) {
        Car togg1=new Car();
        Car togg2;
        togg1.price=100000;
        togg2=togg1;
        System.out.println(togg2.price);
        togg2.price=50000;
        System.out.println(togg1.price);
        togg1=new Car();
        System.out.println(togg1.price);
       
    }
}
