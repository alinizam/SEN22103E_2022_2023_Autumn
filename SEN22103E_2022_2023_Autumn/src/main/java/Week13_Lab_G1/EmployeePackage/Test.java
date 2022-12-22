/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Lab_G1.EmployeePackage;

import Week13_Lab_G1.JobPackage.*; 

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        Job j=new Job();
        e.setJobs(new Job[3]);
        e.jobs[0]=j;
        e.jobs[1]=new Manager();
        System.out.println(e.getEmployeeSalary());
        e.setJobSalary(j, 5000);
        e.jobs[2]=new Officer();
        System.out.println(e.getEmployeeSalary());
        e.addresses.add("İStanbul");
        e.addresses.add("Ankara");
        e.setFirstName("Ahmet");
        Department d=new Department();
        d.getEmployees().add(e);
        d.displayOfficerAddress();
        e.writeJobCount();
        Employee e1=new Employee();
        e1.setJobs(new Job[1]);
        e1.jobs[0]=new Manager();
        d.getEmployees().add(e1);
        e1.setFirstName("Mehmet");
        System.out.println(d.getMaxSalaryEmployee().getFirstName());
    }
}
