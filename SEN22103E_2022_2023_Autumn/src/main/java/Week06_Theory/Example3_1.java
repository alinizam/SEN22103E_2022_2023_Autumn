/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example3_1 {
   public static void main(String[] args) {
        
        //In a given range, Display the numbers is 
        //divisiable by 2
        int start=5,end=10;
        
        for (int i = start; i <= end; i++) {
            if (i%2!=0){
              continue;  
            }
            System.out.println(i);
        }
    }
}
