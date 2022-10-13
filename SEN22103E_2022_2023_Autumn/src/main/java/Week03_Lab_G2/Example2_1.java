/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example2_1 {

    public static void main(String[] args) {
        int num = 5;
        String result = "";
        if (num < 10) {
            result = "small";
        } else if (num <= 20) {
            result = "normal";
        } else {
            result = "large";
        }
        System.out.println(num+" is " + result);
    }
}
