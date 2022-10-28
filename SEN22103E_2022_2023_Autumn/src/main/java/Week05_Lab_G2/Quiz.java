/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Quiz {

    public static void main(String[] args) {
        int num=3;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 5 - j-1) {
                    System.out.print(num+" ");
                    num+=3;
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println("");
        }
    }
}
