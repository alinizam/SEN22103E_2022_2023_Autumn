/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class ArrayForEach {
    public static void main(String[] args) {
        int ages[]={10,12,11};
        for(int age : ages){
            System.out.println(age); 
        }
        
        String names[]={"Ahmet","Ayşe","Ali"};
        for (String name : names) {
            System.out.println(name);
        }
    }
 
}
