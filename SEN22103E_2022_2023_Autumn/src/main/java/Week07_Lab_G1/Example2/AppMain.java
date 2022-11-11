/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G1.Example2;

/**
 *
 * @author ali.nizam
 */
public class AppMain {

    public static void main(String[] args) {
        Time clock = new Time();
        clock.hour = 12;
        clock.minute = 0;
        clock.second = 0;
        //clock.DisplayTime();
        //clock.increaseSecond();
        //clock.DisplayTime();
        for (int i = 0; i < 60*61; i++) {
            clock.DisplayTime();
            clock.increaseSecond();
        }
    }
}
