/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example8_1 {

    public static void main(String[] args) {
        int num = 0;
        int bout = 0;
        int digit = 1;
        do {
            bout = bout + (digit * (num % 2));
            digit *= 10;
            num /= 2;//0

        } while (num > 0);
        System.out.println(bout);
    }
}
