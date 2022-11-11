/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Lab_G_Clock;

/**
 *
 * @author ali.nizam
 */
public class Time {

    int second = 0;
    int minute = 0;
    int hour = 0;

    void increaseSecond() {
        second++;
        if (second == 60) {
            second = 0;
            increaseMinute();
            /* minute++;
            if (minute == 60) {
                minute = 0;
                if (hour == 24) {
                    hour = 0;
                }
            }*/
        }
    }

    void increaseMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            increaseHour();
            /*hour++;
            if (hour == 24) {
                hour = 0;
            }*/
        }
    }

    void increaseHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
