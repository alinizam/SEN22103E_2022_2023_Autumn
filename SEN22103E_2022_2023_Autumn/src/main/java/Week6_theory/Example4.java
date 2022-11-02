/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_theory;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) {
        //check the numberA is divisiable by number B
        int a=5,b=0;
        if (b==0){
            System.out.println("b is zero. it is an exceptional value");
            return;            
        }
        if (a%b ==0){
            System.out.println("It is divisiable");
        }else{
            System.out.println("It is not divisiable");
        }
    }
}
