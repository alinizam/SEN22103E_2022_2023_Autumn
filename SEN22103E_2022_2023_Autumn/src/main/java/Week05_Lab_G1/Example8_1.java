/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example8_1 {

    public static void main(String[] args) {
        int num = 12;
        int bn = 0;
        int digit;
        while (num > 0) {
            if( num % 2==0)
                digit=1;
            else
                digit=0;
            bn = (bn * 10) + digit;
            num /= 2;
        }

        System.out.println(bn);

    }
}
