/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Lab;

/**
 *
 * @author ali.nizam
 */
public class TextBox implements IMotion{
    int x1, x2, y1, y2,id;
    @Override
    public void move(int position) {
        x1=x1+position+10;
        x2=x2+position+10;
        y1=y1+position+10;
        y2=y2+position+10;
    }
    
    @Override
    public int getX1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getY1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getX2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getY2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setXY(int x1, int x2, int y1, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

    }

    @Override
    public void writePosition() {
        System.out.println("x="+x1+":"+x2+"    y= "+y1+":"+y2);
    }
    
}
