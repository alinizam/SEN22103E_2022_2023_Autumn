/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Theory;

/**
 *
 * @author ali.nizam
 */
/**
 *
 * @author ali.nizam
 */
//character is 65
//1 a b c d
//2 e f g h
//3 ı j k l
//4 m n o p
//5 r x s t
public class Example16_2 {

    public static void main(String[] args) {
        char c=97;
        for (int i = 1; i <= 5; i++) {
           
            for (int j = 0; j < 4; j++) {
                System.out.print((i++) +" " + c); 
                c++; 
            }
            System.out.println("");
        }
    }
}


