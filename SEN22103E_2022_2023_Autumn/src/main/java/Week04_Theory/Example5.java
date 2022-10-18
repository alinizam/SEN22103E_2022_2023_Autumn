/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        int durationOfWork=20;
        int currentSalary=7000; 
        // if a person is wrok for my company 
        //more than ten years 10%
        //if current salary less then 5000 inc =10%
        //otherwise %5;
        double inc=0;
        if (durationOfWork>=10 || currentSalary<5000){
            inc=10;
        }else{
            inc = 5;
        }
        System.out.println("Increased salary = " + (currentSalary+currentSalary*inc/100));
             
    }
}
