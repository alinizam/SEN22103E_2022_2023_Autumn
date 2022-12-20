/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Galeri g=new Galeri();
        
        g.cars.add(new Togg());
        g.cars.add(new Togg());
        g.cars.add(new Mercedes());
        g.cars.add(new Togg());
        g.cars.add(new Car());
        System.out.println("Total car prices = "+ g.getTotalPrice());
        System.out.println("Total car number that have torbo = "+ g.getTurboCarCount());
    
        g.canHaveTurbo(new Mercedes());
        g.displayCarType(new Car());
        g.displayCarType((Car)(new Mercedes()));
        Car c=new Car();
        g.displayCarType((Togg)c);
               
    }
}
