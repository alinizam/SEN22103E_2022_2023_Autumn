/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
    public static void main(String[] args) {
        int num=5543472;
        int max=0;
        int lastDigit;
        while(num>0)
        {
            lastDigit=num%10;
            if (max<lastDigit)
            {
                max=lastDigit;
            }
            num/=10;
        }
        System.out.println(max);
    }
}
