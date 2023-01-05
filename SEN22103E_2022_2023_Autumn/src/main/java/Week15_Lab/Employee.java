/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName, lastName;
    ArrayList<IPayment> payments=new ArrayList();
    ArrayList<IPayment> advances=new ArrayList();
    
    ArrayList<IPayment> transection=new ArrayList();
    Salary getSalary(){
        return new Salary();        
    }
    class Salary implements IPayment{
        int net,tax;
        @Override
        public void makePayment(int net, int tax) {
            this.net=net;
            this.tax=tax;
            payments.add(this);
        }
        
        public void makePayment1(int net, int tax) {
            Salary s=new Salary();
            s.net=net;
            s.tax=tax;
            payments.add(s);
        }
        
        public void makePayment2(int net, int tax) {
            Salary s=getSalary();
            s.net=net;
            s.tax=tax;
            payments.add(s);
        }

        @Override
        public int getTotalSalary() {
            return net+tax;
        }
    
    }
}
