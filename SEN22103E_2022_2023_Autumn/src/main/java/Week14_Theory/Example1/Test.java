/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
       //Error: IShape shape=new IShape();
       IShape shape=new Rectangle(5,10);
       System.out.println(shape.getArea());
       
       shape=new Triangle(5,10);
       System.out.println(shape.getArea());
    }
}
