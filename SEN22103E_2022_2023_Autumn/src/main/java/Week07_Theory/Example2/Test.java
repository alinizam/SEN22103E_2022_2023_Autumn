/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        c.model="Togg 3000";
        c.displayModel();
        
        c.color='b';
        c.definePrice();
        System.out.println(c.price);
        
        System.out.println(c.getPrice());
        System.out.println(c.getModel());
        
        c.discountPrice(9000);
        System.out.println(c.getPrice());
    
        c.power=400;
        System.out.println(c.increasePower(1000));
    
        c.price=5000;
        c.color='b';
        c.discountBasePrice(9000);
        System.out.println(c.price);        
                
                
    }
    
    
}
