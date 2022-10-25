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
public class Example1_1 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=0;
        int sum=0;
        do{
            System.out.println("Please give a number");
            sum+=number;
            number=s.nextInt();  
        }while(number!=-1);
        System.out.println("Sum of inputs is " +sum);
        
    }
}
