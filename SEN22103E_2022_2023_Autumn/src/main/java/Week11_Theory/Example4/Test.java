/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Bike b=new Bike();
        System.out.println(b.objectCount);
        Bike b1=new Bike();
        Bike b2=new Bike();
        System.out.println(b.objectCount);
        
        System.out.println("The number of bike= "+Bike.objectCount); 
         
    }
}
