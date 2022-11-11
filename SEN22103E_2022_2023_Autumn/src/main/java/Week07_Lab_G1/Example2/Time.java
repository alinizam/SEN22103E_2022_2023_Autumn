/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G1.Example2;

/**
 *
 * @author ali.nizam
 */
public class Time {

    int second;
    int minute;
    int hour;

    void increaseSecond() {
        second++;
        if (second == 60) {
            second = 0;
            //minute++;
            increaseMinute();
        }
    }

    void increaseMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            //hour++;
            increaseHour();
        }
    }

    void increaseHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }
    
    void DisplayTime()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
}
