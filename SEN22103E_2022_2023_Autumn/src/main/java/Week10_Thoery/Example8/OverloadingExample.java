/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Thoery.Example8;

/**
 *
 * @author ali.nizam
 */
public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(calculate(1.0,5));
        
    }
    
    static int calculate(int a,int b){
        return a+b;
    }
    static double calculate(double x,double y){
        return x+y;
    } 
    static double calculate(double a,double b, double c){
        return a+b+c;
    }
    
    
}
