/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example1;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
       /* Employee e=new Employee();
        e.firstName="Ahmet";
        e.lastName="Ak";
        e.salary=100000;*/
       
       Employee e=new Employee("Ahmet","AK",100000);
       Employee e1=new Employee();
       
       ArrayList<Employee> employees=new ArrayList();
       employees.add(new Employee("Ahmet","Ak",100000));
       
        System.out.println(e);
        
       
        
        
    }
}
