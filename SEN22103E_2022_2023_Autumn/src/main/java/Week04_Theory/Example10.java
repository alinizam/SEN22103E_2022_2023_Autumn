/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) {
        //calculate sum of numbers between 1 and 10
        //divided by 3
        int i=1;
        int sum=0;
        while(i<=10){
            if (i%3==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of value"+sum);
       
    }
}
