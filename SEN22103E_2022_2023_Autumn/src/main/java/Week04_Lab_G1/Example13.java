/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example13 {
    public static void main(String[] args) {
        int num =52454364;
        int lastDigit=0;
        while(num>0)
        {
            lastDigit =num%10;
            num= num /10;
            System.out.print(lastDigit);
        }
    }
}
