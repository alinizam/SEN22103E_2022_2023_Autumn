/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Lab;

/**
 *
 * @author ali.nizam
 */
public interface IMotion {
    
    void move(int position);
    int getX1();
    int getY1();
    int getX2();
    int getY2();
    void setXY(int x1,int x2,int y1,int y2);
    void writePosition();
    int getArea();
}
