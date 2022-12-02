/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Lab_G1.Example1;

/**
 *
 * @author ali.nizam
 */
class Employee {

    int id, salary;
    String name, lastname, title;
    int[] bonusPayment = new int[3];

    int getTotalBonus() {
        int sum = 0;
        for (int j = 0; j < bonusPayment.length; j++) {
            sum += bonusPayment[j];
        }
        return sum;
    }

}
