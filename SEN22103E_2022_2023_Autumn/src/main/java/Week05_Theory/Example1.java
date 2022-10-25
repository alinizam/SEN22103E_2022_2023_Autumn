/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please give a number");
        int number=s.nextInt();
        int sum=0;
        while(number!=-1){
            sum+=number;
            System.out.println("Please give a number");
            number=s.nextInt();
        }
        System.out.println("Sum of inputs is " +sum);
        
    }
}
