/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Exampe12 {
    public static void main(String[] args) {
        int input=7;
        int output;
        int lastDigit=input%10;
        if (lastDigit>=5){
            output=input - lastDigit + 10;
        }else{
            output= input -lastDigit;
        }
        System.out.println("Output ="+ output);
        
    }
}
