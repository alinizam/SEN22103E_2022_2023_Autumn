/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class SimplePolymorphismTest {
    public static void main(String[] args) {
        
        Car c=new Car();
        System.out.println(c.getPrice());
        
        c=new  SportCar();
        System.out.println(c.getPrice());
    }
    
}
