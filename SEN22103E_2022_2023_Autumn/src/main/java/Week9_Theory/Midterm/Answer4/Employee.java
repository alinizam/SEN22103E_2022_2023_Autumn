/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Theory.Midterm.Answer4;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    int salary, advancePayment1,  advancePayment2;
    boolean checkAdvanceAmount(int pAdvancePayment1, int pAdvancePayment2){
        advancePayment1=pAdvancePayment1;
        advancePayment2=pAdvancePayment2;
        return  salary>(advancePayment1+advancePayment2);  
    
    } 
}
