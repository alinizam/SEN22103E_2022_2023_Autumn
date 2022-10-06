/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    
    public static void main(String[] args) {
        int num = 16;
        int d1 = num % 10;
        int d2 = num / 10;
        int num2= (d1 * 10 ) + d2;
        System.out.println(num +" -> "+num2);
        System.out.println(num +" -> "+d1+""+d2);  
    }
}
