/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01_Lab_G1;

/**
 *
 * @author skaya
 */
public class Example9 {

    public static void main(String[] args) {
        int F0 = 0;
        int F1 = 1;
        int F2 = F0 + F1;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
    }

}
