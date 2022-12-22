/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Lab_G1.EmployeePackage;

import Week13_Lab_G1.JobPackage.*;
import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    private String firstName;
    Job[] jobs;

    public Job[] getJobs() {
        return jobs;
    }

    public void setJobs(Job[] jobs) {
        this.jobs = jobs;
    }
    ArrayList<String> addresses = new ArrayList();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    int getEmployeeSalary() {
        int total = 0;
        for (Job job : jobs) {
            if (job != null) {
                total += job.getSalary();
            }
        }
        return total;

    }

    void setJobSalary(Job j, int increase) {
        for (Job job : jobs) {
            if (job == j) {
                j.salary = j.getSalary() + increase;
            }
        }

    }
    
    void setJobSalary1(Job j,int increase) {
        
                j.salary = j.getSalary() + increase;
       
    }

    void writeJobCount() {
        int managerCount = 0, officerCount = 0, jobCount = 0;
        for (Job j : jobs) {
            if (j instanceof Manager) {
                managerCount++;
            } else if (j instanceof Officer) {
                officerCount++;
            }
            else if (j instanceof Job) {
                jobCount++;
            }
        }
        System.out.println("Manager Count = "+managerCount);
        System.out.println("Officer Sount =" +officerCount);
        System.out.println("Job count =" + jobCount);
    }
}
