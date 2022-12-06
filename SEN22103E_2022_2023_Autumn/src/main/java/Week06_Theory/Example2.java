/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example2 {

    //  In a given range is there any number that contains 
    //  5 in a digit 
    public static void main(String[] args) {
        int start = 61, end = 66; 
        outer:
        for (int i = start; i <= end; i++) {
            int number=i;
            while (number>0){
                System.out.println(number%10);
                if (number%10==5){
                    System.out.println("5 in digits");
                    break outer;
                }
                number/=10;
            }
            
        }
    }
}
