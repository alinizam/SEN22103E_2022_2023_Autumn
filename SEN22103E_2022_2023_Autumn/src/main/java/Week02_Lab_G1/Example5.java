/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        double d1=5.65, d2=1.70;
        String result=(d1%1>d2%1)?"first is bigger":"second is bigger";
        System.out.println(result);
        
                
        double d11,d21;
        d11=d1-(int)d1;
        d21=d2-(int)d2;
        result=(d11>d21)?"first is bigger":"second is bigger";
        System.out.println(result);
    }
}
