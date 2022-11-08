/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Quiz01112022_Q1 {
    public static void main(String[] args) {
        int count=50;
        int inc=5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(count+" "); 
                count-=inc;
            }
             System.out.println(count);
             inc-=1;
        }
    }
}
