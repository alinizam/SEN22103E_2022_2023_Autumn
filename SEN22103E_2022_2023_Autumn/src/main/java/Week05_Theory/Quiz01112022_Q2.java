/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Quiz01112022_Q2 {

    public static void main(String[] args) {
        int y = 5;
        int x = 1;
        int z = 0;
        while (x < y && z < 6) {
            if (x < 5) {
                System.out.println("x: " + x + "  y: " + y);
                x = x << 1;
            }
            z = y++;
        }
        System.out.println("x: " + x + "  y: " + y);

    }
}
