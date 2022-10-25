/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example11 {
    // 1 2 3 4 5  
    // 6 7 8 9 10
    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 23 24 25
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i+" ");
            if (i%5==0){
                System.out.println("");
            }
        }
    }
}
