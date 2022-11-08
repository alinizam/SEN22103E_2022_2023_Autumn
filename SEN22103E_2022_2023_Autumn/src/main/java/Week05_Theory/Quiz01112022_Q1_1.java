/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Quiz01112022_Q1_1 {
     public static void main(String[] args) {
        int count=55;
        int inc=5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                count=count-(6-i);
                System.out.print(count+" ");
                
            }
            count=count+(5-i) ;
            System.out.println("");
             
        }
    }
}
