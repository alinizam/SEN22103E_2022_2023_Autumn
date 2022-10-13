/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example9 {

    public static void main(String[] args) {
        int input = 13;
        if (input % 5 == 0 && input % 2 == 0) {
            System.out.println("divisible by both 5 and 2");
        } else if (input % 5 == 0) {
            System.out.println("divisible by 5 ");
        } else if (input % 2 == 0) {
            System.out.println("divisible by 2 ");
        } else {
            System.out.println("not divisible by 5 or 2 ");
        }

    }
}
