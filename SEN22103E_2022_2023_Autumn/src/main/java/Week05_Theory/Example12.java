/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    // 1 2 3  6  
    // 4 5 6  15
    // 7 8 9  24
    public static void main(String[] args) {
         //write numbers and write sum
         //next line
         int count=1; 
         for (int i = 0; i < 3; i++) {
             int sum=0;
             for (int j = 0; j < 3; j++) {
                 System.out.print(count+" ");
                 sum+=count;
                 count++;
             }
             System.out.println(sum);
        }
    }
}
