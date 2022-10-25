/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example17 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i>j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
             for (int j = 0; j < 5; j++) {
                if (j>i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
