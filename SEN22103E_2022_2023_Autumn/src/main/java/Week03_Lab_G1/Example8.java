/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example8 {

    public static void main(String[] args) {
        double account = 200;
        double disaccount = 0;
        if (account < 200) {
            disaccount = account * 0.9;
        } else if (200 <= account && account <= 400) {
            disaccount = account * 0.85;
        } else {
            disaccount = account * 0.8;
        }
        System.out.println("account= "+account+" discount= "+disaccount);
    }
}
