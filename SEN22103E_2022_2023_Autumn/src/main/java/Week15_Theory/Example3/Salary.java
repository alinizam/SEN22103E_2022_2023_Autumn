/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class Salary {
    int commission;
    int year;
    int month;

 /*   int getSalary(int netSalary) {
        return netSalary * (1 + commission);
    }*/
    
    int getSalary() {
        return  (1 + commission);
    }
}
