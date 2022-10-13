/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class QuizExample {

    public static void main(String[] args) {
        int num = 7;
        int lastDigit = num % 10;
        if (lastDigit < 5) {
            num = num - lastDigit;
        } else {
            num = num + (10 - lastDigit);
        }
        System.out.println(num);
    }
}
