/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Quiz {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("x ");
                } else {
                    System.out.print(count + " ");
                    count += 2;
                }
                
            }
            System.out.println("");
        }
    }
}
