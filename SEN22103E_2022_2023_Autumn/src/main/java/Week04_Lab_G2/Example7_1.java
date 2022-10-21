/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example7_1 {
    public static void main(String[] args) {
        int number1 = 12,number2=24;
        int i = 1;
        int maxDivisor=1;
        while (i <= number1/2 || i <= number2 / 2) {
            if ((number1 % i == 0 && number1 != i)
                || (number2 % i == 0 && number2 != i)) {
                maxDivisor = i;
            }
            i++;
        }
        System.out.println("Max divisor = "+ maxDivisor);
    }
}
