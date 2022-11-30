/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Thoery.Example1;

/**
 *
 * @author ali.nizam
 */
public class CarTestControlReference {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car c = new Car();
        c.price = 50000;

        cars[0] = c;

        cars[2] = c;
        int totalPrice = 0;
        
        /*for (int i = 0; i < cars.length; i++) {
            if (cars[i]!= null) {
                totalPrice += cars[i].price;
            }
        }*/
        
        for (Car car: cars) {
            if (car!= null) {
                totalPrice += car.price;
            }
        }
        
        
        System.out.println(totalPrice);

    }
}
