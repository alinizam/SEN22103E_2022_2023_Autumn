/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example5;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    private int salary;
    public static void main(String[] args) {
        Campany c=new Campany(); //nested class can be accessed 
                                 //directly in outer class
        Employee e=new Employee();
        e.salary=1000;
    }
    static class Campany{
        private String campanyName; 

        public String getCampanyName() {
            return campanyName;
        }

        public void setCampanyName(String campanyName) {
            this.campanyName = campanyName;
        }
        
    }
}
