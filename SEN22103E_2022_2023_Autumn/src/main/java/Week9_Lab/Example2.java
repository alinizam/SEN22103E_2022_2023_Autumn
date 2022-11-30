/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example2 {
    public static void main(String[] args) {
        int[] array= new int[]{1,2,3,4,5};
        System.out.println(calculateAvg(array));
        
        int[][] array2D={{1,2,3},{4,8}};
        System.out.println(calculateAvg(array2D));
        
        ArrayList numberList=new ArrayList();
        numberList.add(10);
        numberList.add(1);
        System.out.println(calculateAvg(numberList));
    }
    static double calculateAvg(int[] numbers) {
        double sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum/numbers.length;
    }
    static double calculateAvg(int[][] numbers) {
        double sum=0;
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
                count++;
            }
        }
        return sum/count;
    }
    
     static double calculateAvg(ArrayList<Integer> numbers) {
        double sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
        return sum/numbers.size();
    }
    
    
}
