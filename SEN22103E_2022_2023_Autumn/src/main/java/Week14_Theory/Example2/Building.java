/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class Building implements IColorable{

    
     String color;

    public Building(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }
    
}
