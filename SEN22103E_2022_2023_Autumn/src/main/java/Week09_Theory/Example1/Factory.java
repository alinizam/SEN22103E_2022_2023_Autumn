/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class Factory {
     Employee boss;
     void increaseSalaryofEmployee(Employee e){
         e.salary=e.salary+1000;
     }
     //REturn a newly created employee
     Employee createNewEmployee(){
         Employee e=new Employee();
         return e;
     }
      //REturn a newly created employee has salary 1000
     Employee createNewEmployeeWithSalary(){
        Employee e=new Employee();
        e.salary=1000;
        return e;
     }
     //Assign a boss to the factory
     void assignBoss(Employee e){
         this.boss=e; 
     }
}
