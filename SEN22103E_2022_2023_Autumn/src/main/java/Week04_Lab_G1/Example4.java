/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example4 {

    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            int i = 1;
            int fact = 1;
            while (i <= number) {
                fact = fact * i;
                i++;
            }
            System.out.println(number+"!= " + fact);
            number++;
        }
    }
}
