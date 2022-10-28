/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example_12 {
    public static void main(String[] args) {
        int fact=1;
        for (int i = 2; i < 7; i++) {
            fact *= i;
            for (int j = 0; j < 7-i; j++) {
                System.out.print((fact+j)+" ");
            }
            System.out.println("");
        }
    }
}
