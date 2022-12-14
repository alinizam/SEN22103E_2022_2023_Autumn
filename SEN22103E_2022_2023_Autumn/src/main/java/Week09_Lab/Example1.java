/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        int[] testArray={1,5,6};
        System.out.println(sumOfArray(testArray));
        int[][] testArray2D={{1,1,2},{1,2,3}};
        System.out.println(sumOfArray(testArray2D));
        ArrayList numberlist=new ArrayList();
        numberlist.add(10);
        numberlist.add(15);
        System.out.println(sumOfArray(numberlist));
    }
     static int sumOfArray(ArrayList numbers){
        int total=0;
        for (int i = 0; i < numbers.size(); i++) {
                total+=(Integer)(numbers.get(i));
        }
        return total; 
    }
    static int sumOfArray(int[] numbers){
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];
        }
        return total;
    
    }
    static int sumOfArray(int[][] numbers){
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                total+=numbers[i][j];
            }
        }
        return total; 
    }
    
    
    
    
}
