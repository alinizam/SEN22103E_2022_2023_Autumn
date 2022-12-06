/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example1_1 {
     public static void main(String[] args) {
        //find a number is in a range or not ?
        int start=5,end=1000000000;
        int searchedNumber=7; 
        
        for (int i = start; i <= end; i++) {
            if (searchedNumber==i){
                System.out.println("Is in range = true");
                break;
            }
        }
        
    }
}
