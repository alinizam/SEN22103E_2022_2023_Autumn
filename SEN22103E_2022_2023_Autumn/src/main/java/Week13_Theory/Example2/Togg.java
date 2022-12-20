/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class Togg extends Car{
    boolean turbo;

    public boolean isTurbo() {
        return true;
    }
    
    public int getPrice() {
        return 100000;
    }
    void writeType(){
        System.out.println("Type is a Togg");
    }
    
}
