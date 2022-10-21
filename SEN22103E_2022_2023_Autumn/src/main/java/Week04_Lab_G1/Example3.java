/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        int n=6;
        int fact=1;
        while(n>=1)
        {
            System.out.println(n+"");
            fact= fact*n;
            n--;
            //n = n-1;
            //n -= 1;
            
        }
        System.out.println("result="+fact);
        
        n=6;
        int i=1;
        fact=1;
        while(i<=n)
        {
            System.out.println(i+"");
            fact= fact*i;
            i++;
        }
         System.out.println("result="+fact);
    }
}
