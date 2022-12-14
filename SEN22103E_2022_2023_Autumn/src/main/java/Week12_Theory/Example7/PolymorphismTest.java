/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        int total=0;
        Car[] cars=new Car[5]; 
        cars[0]=new Car();
        cars[1]=new Car();
        cars[2]=new SportCar();
        cars[3]=new SportCar(); 
        cars[4]=new SportCar(); 
        
        for (Car car : cars) { 
            total+=car.getPrice();
        }
        
        System.out.println(total);
    }
    
}
