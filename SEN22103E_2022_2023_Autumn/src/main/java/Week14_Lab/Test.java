/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Lab;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        IMotion object=new TextBox();
        object.setXY(10, 10, 10, 10);
        object.move(5);
        object.writePosition();
        
        
        object=new Button();
        object.setXY(10, 10, 10, 10);
        object.move(5);
        object.writePosition();
        
    }
}
