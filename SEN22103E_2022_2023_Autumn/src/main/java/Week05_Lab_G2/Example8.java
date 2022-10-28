/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) {
        int num=12;
        String bout="";
        do
        {
            bout= (num%2)+bout;
            num/=2;
        }while(num>0);
        System.out.println(bout);
    }
}
