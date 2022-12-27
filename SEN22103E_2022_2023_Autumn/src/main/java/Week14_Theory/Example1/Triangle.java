/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Triangle implements IShape{

    double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    
    public double getArea() {
        return (a*h)/2;
    }
    
}
