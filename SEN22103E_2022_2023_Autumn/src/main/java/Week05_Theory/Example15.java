/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example15 {

    // 1   *  * *   * 
    // 3   5  * *   * 
    // 7   9 11 *   * 
    // 13 15 17 19  * 
    // 21 23 25 27 29
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print(count + " ");
                    count+=2; 
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println("");
        }
    }

}
