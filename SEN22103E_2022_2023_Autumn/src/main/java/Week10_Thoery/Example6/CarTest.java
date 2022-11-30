/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Thoery.Example6;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class CarTest {
    public static void main(String[] args) {
        ArrayList cars=new ArrayList();
        Car c=new Car();
        c.price=10000;
        cars.add(c);
        int total=0;
        for (Object car : cars) {
            total+=((Car)car).price;
        }
        System.out.println(total);
        
    }
}
