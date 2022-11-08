/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        c.driver=new Driver();
        c.driver.name="Ahmet AK";
        
        Car c1=new Car();
        c1.driver=c.driver;
        System.out.println(c.driver.name);
    }
}
