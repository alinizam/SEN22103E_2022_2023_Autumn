/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example2 {

    // intput
    // power
    // while input > 0
    //      power left shift
    //      input right shift
    // print power
    public static void main(String[] args) {
        int input = 0b1001;
        int power2 = 0b1;
        while (input > 1) {
            power2 = power2 << 1;
            input = input >> 1;
        }
        System.out.println(" power2 = "+power2);
    }
}
