/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example2;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Galeri {

    ArrayList<Car> cars = new ArrayList();

    int getTotalPrice() {
        int total = 0;
        for (Car car : cars) {
            total += car.getPrice();
        }
        return total;
    }

    int getTurboCarCount() {
        int count = 0;
        for (Car car : cars) {
            System.out.println(car);
            if (car instanceof Togg) {
                if (((Togg) car).isTurbo()) {
                    count++;
                }
            } else if (car instanceof Mercedes) {
                if (((Mercedes) car).isTurbo()) {
                    count++;
                }
            }
        }
        return count;
    }

    void canHaveTurbo(Car c) {
        if (c instanceof Mercedes || c instanceof Togg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    void displayCarType(Car c){
        c.writeType();
    }
    
}
