/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        int total=0;
        Car[] cars=new Car[2]; 
        cars[0]=new Car();
        cars[1]=new Car();
        for (Car car : cars) {
            total+=car.getPrice();
        }
        
        SportCar[] sportCars=new SportCar[3]; 
        sportCars[0]=new SportCar();
        sportCars[1]=new SportCar();
        sportCars[2]=new SportCar();
        for (SportCar sportCar : sportCars) {
            total+=sportCar.getPrice();
        }
        System.out.println(total);
    }
}
