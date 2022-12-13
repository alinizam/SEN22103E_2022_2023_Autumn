/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example5;

/**
 *
 * @author ali.nizam
 */
public class Car {
    int price=5000;
    // First Solution
    public Car() {
        System.out.println("Car object is initialized");
    }

    public Car(int price) {
        System.out.println("Car object is initialized");
        this.price = price;
    }

    final int getPrice() {
        return price;
    }
    
    
}
