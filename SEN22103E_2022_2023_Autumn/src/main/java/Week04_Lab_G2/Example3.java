/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        int f=1;
        int input=6;
        int i=1;
        while (i<=input){
            f=f*i;
            System.out.println(i+"!= "+f);
            i++;
            // f(n)!= n+f(n-1)!;
            
        }
        System.out.println(input+"!= "+f);
    }
}
