/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Rectange extends Shape{

    public Rectange(int a, int b) {
        this.a = a;
        this.b = b;
    }
   
    public Rectange() {
    }
 
    @Override
    int getArea() {
        return a*b; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
