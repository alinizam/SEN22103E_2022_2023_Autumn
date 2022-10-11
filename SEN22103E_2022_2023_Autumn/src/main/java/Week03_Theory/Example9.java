/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
    public static void main(String[] args) {
        int a = 0b00111100;
        int b = 0b00001101;
        System.out.println(a +" "+b);
        System.out.println("a&b ="+(a&b));
        //00111100;
        //00001101;&
       //00001100;
        System.out.println("a&b ="+(a|b));
       //00111100;
       //00001101;|
       //00111101;
       System.out.println(~a);
       //00111100 --> 11000011
       
       System.out.println(a^b);
       //00111100;
       //00001101;|
       //00110001;


    }
 
}
