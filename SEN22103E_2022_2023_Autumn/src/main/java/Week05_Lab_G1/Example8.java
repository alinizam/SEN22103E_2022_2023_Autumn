/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) {
        int num=0;
        String bn="";
        do
        {
            bn=(num%2)+bn;
            num/=2;
        } while(num>0);
        
        System.out.println(bn);
        
    }
}
