/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example13 {
    // 1 2 3  6  
    // 4 5 6  21
    // 7 8 9  45
     public static void main(String[] args) {
         //write numbers and write sum
         //next line
         int count=1; 
         int sum=0;
         for (int i = 0; i < 3; i++) {
             
             for (int j = 0; j < 3; j++) {
                 System.out.print(count+" ");
                 sum+=count;
                 count++;
             }
             System.out.println(sum);
        }
    }
}
