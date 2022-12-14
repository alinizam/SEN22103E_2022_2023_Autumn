/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Lab;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        int numbersArray[]={1,5,3,9,7};
        System.out.println(calculateMax(numbersArray));
        int numbersArray2D[][]={{1,5},{3,9,7}};
        System.out.println(calculateMax(numbersArray2D));
         
        System.out.println(calculateMaxWithFor(numbersArray2D));

    }
    static int calculateMax(int[] numbers){
        int max=numbers[0];
        for (int number : numbers) {
            System.out.println("current value = "+number +": max"+max );
            if (number>max){
                max=number;
            }
        }
        return max;
    }
    static int calculateMax(int[][] numbers){
        int max=numbers[0][0];
        for (int[] row : numbers) {
            for (int column : row) {
                if (column>max){
                    max=column;
                }
            }
        }
        return max;
    }
    
     static int calculateMaxWithFor(int[][] numbers){
        int max=numbers[0][0];
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]>max){
                    max=numbers[i][j];
                }
             }
         }
        return max;
    }
    
}
