/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Quiz {

    public static void main(String[] args) {
        int a = 5, b = 4;
        int result = 1;
        a=a/2;
        b=b/2;
        
        if (a % 5 == 0 || b % 5 == 0) {
            result = 5;
        } else if (a % 4 == 0 || b % 4 == 0) {
            result = 4;
        } else if (a % 3 == 0 || b % 3 == 0) {
            result = 3;
        } else if (a % 2 == 0 || b % 2 == 0) {
            result = 2;
        }
        System.out.println("Result = " + result);

    }
}
