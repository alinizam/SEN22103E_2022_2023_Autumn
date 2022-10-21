/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example5 {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        int limit = 3000;
        while (i <= 100 && sum < (limit - i)) {
            sum += i;
            System.out.println(i + ". Sum= " + sum);
            i++;
        }
    }
}
