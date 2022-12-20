/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Triange extends Shape{
    int a,b;

    public Triange(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int getHeigth(){
        return 0;
    }

    @Override
    int getArea() {
        return (a*b)/2; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
