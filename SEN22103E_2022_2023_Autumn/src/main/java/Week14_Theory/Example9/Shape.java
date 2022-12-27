/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example9;

/**
 *
 * @author ali.nizam
 */
public abstract class Shape implements IShape{
    private String name;
    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    abstract int getArea();
}
