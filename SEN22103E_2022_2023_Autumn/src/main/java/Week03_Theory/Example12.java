/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) {
        int i=10;  
        //00000000 00000000 00000000 00001010
        System.out.println(i>>>1);
        /*00000000 00000000 00000000 00001010;
        i=-10
        11111111 11111111 11111111 11110110
        i=-1
        00000000 00000000 00000000 00000001;        
        11111111 11111111 11111111 11111111  */      
        i=-10;
        System.out.println(i>>>1);
        //011111111 11111111 11111111 1111011
        
        int j=Integer.MAX_VALUE;
        System.out.println(i<<1);
         
    }
}
