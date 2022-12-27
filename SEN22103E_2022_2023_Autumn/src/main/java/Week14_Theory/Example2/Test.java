/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example2;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<IColorable> objects=new ArrayList();
        objects.add(new Car("Blue"));
        objects.add(new Building("Blue"));
        objects.add(new Car("Green"));
        for (IColorable object : objects) {
            System.out.println(object.toString()+"-"+object.getColor());
        } 
    }
}
