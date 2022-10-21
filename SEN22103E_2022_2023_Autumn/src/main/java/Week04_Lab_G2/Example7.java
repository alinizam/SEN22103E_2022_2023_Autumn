/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example7 {

    public static void main(String[] args) {
        int number1 = 24;
        int i = 1;
        int maxDivisor1=1;
        while (i <= number1 / 2) {
            if (number1 % i == 0) {
                maxDivisor1 = i;
            }
            i++;
        }
        
        int number2 = 30;
        int j = 1;
        int maxDivisor2=1;
        while (j<= number2 / 2) {
            if (number2 % j == 0) {
                maxDivisor2 = j;
            }
            j++;
        }
        System.out.println((maxDivisor2>maxDivisor1?maxDivisor2:maxDivisor1));
    }
}
