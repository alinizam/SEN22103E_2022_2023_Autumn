/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Thoery.Example1;

/**
 *
 * @author ali.nizam
 */
public class CatTest {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        cars[0]=new Car();
        cars[1]=new Car();
        cars[2]=new Car(); 
        int totalPrice=0;
        for (int i = 0; i < cars.length; i++) {
            totalPrice+=cars[i].price;
        }
        System.out.println(totalPrice);
    }
}
