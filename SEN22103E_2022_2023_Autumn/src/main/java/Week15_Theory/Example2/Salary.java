/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example2;

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
    
    int getSalary(Employee e) {
        return e.netSalary * (1 + commission);
    }
}
