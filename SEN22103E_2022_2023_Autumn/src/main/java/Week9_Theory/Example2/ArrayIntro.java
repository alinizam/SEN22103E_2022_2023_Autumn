/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class ArrayIntro {
    public static void main(String[] args) {
        int salary1,salary2,salary3;
        int[] salaries;
        salaries=new int[3];
        salaries[0]=2000;
        salaries[1]=5000;
        salaries[2]=3000;
        //display second element
        System.out.println(salaries[1]);
       // salaries[3]=3000; //Error
        
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(i+" element =" + salaries[i]);
        }
        
        // total of salaries
        
        int total=0;
        for (int i = 0; i < salaries.length; i++) {
            total+=salaries[i];
        }
        System.out.println("total salary= "+total);
        //does salaries conrtain 3000 ?
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]==4000){
                System.out.println("Contains 3000");
                break;
            }
        }
        
         //does salaries conrtain 3000 ?
        boolean isContain=false;
         for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]==3000){
                isContain=true;
                break;
            }
        }
        System.out.println(isContain);
        
        int[] salaries1={1000,2000,5000};
        for (int i = 0; i < salaries1.length; i++) {
            System.out.println(salaries1[i]);   
        }
    }
}
