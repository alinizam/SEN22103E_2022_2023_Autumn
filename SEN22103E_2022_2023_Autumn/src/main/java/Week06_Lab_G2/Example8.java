/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example8 {

    public static void main(String[] args) {
        int num = 1;
        char ch = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                if (i % 2 == 0) {
                    System.out.print(num + " ");
                    num *= 2;
                } else {
                    System.out.print(ch + " ");
                    ch ++;
                }
            }
            System.out.println("");
        }
    }
}
