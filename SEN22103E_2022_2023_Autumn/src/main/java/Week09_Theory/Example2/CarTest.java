/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class CarTest {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car togg=new Car();
        togg.price=5000;
        cars[0]=togg;
        
        cars[1]=new Car();
        Car mercedes=new Car();
        mercedes.price=10000;
        cars[2]=mercedes;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].price);
        }
       
    }
}
