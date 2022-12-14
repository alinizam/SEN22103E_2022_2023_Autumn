/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Theory.Midterm;

/**
 *
 * @author ali.nizam
 */
public class Answer1 {
    public static void main(String[] args) {
        int hour1=11,minute1=5;
        int hour2=11,minute2=10;
        int differenceBetweenHours;
        int differenceBetweenMinutes;
        if (minute1>minute2){
            differenceBetweenHours=hour1-hour2;
            differenceBetweenMinutes=(minute1-minute2);
        }else{
            if (hour1==hour2){
                differenceBetweenHours=0;
                differenceBetweenMinutes=(minute1-minute2);
            }else{
                differenceBetweenHours=hour1-hour2-1;
                differenceBetweenMinutes=60+(minute1-minute2);
            }
            
        }
        System.out.println("Hours: "+differenceBetweenHours);
        System.out.println("Minutes: "+differenceBetweenMinutes);
         
    }
}
