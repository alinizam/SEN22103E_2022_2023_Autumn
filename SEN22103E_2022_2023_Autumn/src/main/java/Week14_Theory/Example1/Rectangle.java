/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Rectangle implements IShape{
    double a,b;
    @Override
    
    public double getArea() {
        return a*b;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
}
