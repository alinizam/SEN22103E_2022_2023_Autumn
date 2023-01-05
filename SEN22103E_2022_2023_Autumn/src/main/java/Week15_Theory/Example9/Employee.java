/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example9;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    int getSalary(){
        class LocalSalaryClass{
            int netSalary;
            int commission;
            int getTotalSalary(){
                return netSalary+commission;
            }
        }
        LocalSalaryClass ls=new LocalSalaryClass();
        ls.netSalary=1000;
        ls.commission=100;
        return ls.getTotalSalary();
    }
    
     int getSalaryWithInheritence(){
        class LocalSalaryClass extends Salary{
        }
        LocalSalaryClass ls=new LocalSalaryClass();
        ls.netSalary=1000;
        ls.commission=100;
        return ls.getTotalSalary();
    }
     
     
     int getSalaryWithParameter(){
        //final int baseSalary=0;
        int baseSalary=100;
        
        class LocalSalaryClass extends Salary{
            // static int year; static variables can not be defined inside local classes
            @Override
            int getTotalSalary() {
                return super.getTotalSalary()+baseSalary; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
        }
        LocalSalaryClass ls=new LocalSalaryClass();
        ls.netSalary=1000;
        ls.commission=100;
        return ls.getTotalSalary();
    }
}
