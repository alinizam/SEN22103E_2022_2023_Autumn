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
public class CatTestGEneric {
    public static void main(String[] args) {
       // ArrayList<Car> cars=new ArrayList<Car>();
       ArrayList<Car> cars=new ArrayList();
       cars.add(new Car()); 
        
       for (Car car : cars) {
            System.out.println(car.price);
       }
       
       
    }
}
