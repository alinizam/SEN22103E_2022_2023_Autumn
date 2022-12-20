/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Shape s=new Triange(10,2);
        
        System.out.println(s.getClass().toString()+" "+s.getArea());
        
        s=new Rectange(10,2);
        System.out.println(s.getClass().toString()+" "+s.getArea());
 
        
        
    }
    
}
