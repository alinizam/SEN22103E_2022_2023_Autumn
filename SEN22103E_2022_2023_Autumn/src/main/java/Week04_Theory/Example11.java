/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example11 {

    public static void main(String[] args) {
        //calculate sum of numbers between a given range
        //divided by given number
        int start = 5, end = 15;
        int devision = 4;
        int i = start;
        int sum = 0;
        while (i >= start && i<=end) {
            if (i % devision == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of value between start "+start+" "
                + "and end= "+end+" divided by "+ devision+"=" + sum);

    }
}
