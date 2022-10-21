/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        int num = 1;
        int sum=0;
        int limitSum=3000;
        while(num<=100 && sum<=(limitSum-num))
        {
            sum = sum+num;
            num++;
        }
        System.out.println((num-1)+". Sum = "+sum);
    }
}
