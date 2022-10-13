/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example8 {

    public static void main(String[] args) {
        double price =300;
        double discount=0;
        if (price < 200) {
            discount = price * 0.1;
        } else if (price >= 200 && price <= 400) {
            discount = price * 0.15;
        } else if (price > 400) {
            discount = price * 0.2;
        }
        System.out.println(price-discount);

    }
}
