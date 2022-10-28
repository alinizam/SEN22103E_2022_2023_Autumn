/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) {
        int f=1;
        for (int i = 2; i <= 7; i++) {
            f=f*i;
            for (int j = 1; j <= 7-i; j++) {
                System.out.print((f+j-1)+" ");
            }
            System.out.println("");
        }
    }
}
