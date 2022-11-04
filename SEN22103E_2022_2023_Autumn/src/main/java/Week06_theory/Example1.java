/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_theory;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        //find a number is in a range or not ?
        int start=5,end=1000000000;
        int searchedNumber=7;
        boolean isInRange=false;
        for (int i = start; i <= end; i++) {
            if (searchedNumber==i){
                isInRange=true;
                break;
            }
        }
        System.out.println("Is in range = "+isInRange);
    }
}
