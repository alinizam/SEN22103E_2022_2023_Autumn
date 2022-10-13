/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        int a=15,b=11,c=10;
        int max;
        if (a>b && a>c){
            max=a;
        }else if (b>c){
            max=b;
        }else{
            max=c;
        }
        System.out.println("Max value is:"+max);
    }
}
