/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example3_1 {

    public static void main(String[] args) {
        int num = 24;
        int bgdiv = 5;
        if (num % 1 == 0) {
            bgdiv = 1;
        }
        if (num % 2 == 0) {
            bgdiv = 2;
        }
        if (num % 3 == 0) {
            bgdiv = 3;
        }
        if (num % 4 == 0) {
            bgdiv = 4;
        }
        if (num % 5 == 0) {
            bgdiv = 5;
        }
        System.out.println("biggest divider "+bgdiv);
    }
}
