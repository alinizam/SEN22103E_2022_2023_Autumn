/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class CarTestOneObject {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car c=new Car();
        c.price=50000;
        
        cars[0]=c;
        cars[1]=c;
        cars[2]=c; 
        int totalPrice=0;
        
        cars[1].price=10000;
        
        for (int i = 0; i < cars.length; i++) {
            totalPrice+=cars[i].price;
        }
        System.out.println(totalPrice);
    }
}
