/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Lab;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) {
        int[][] number2D={{1,5,1},{3,9,7}};
        calculateTheSumOfRows(number2D);
        calculateTheSumOfColumns(number2D);
    }
    static void calculateTheSumOfRows(int[][] numbers){
        for (int i = 0; i < numbers.length; i++) {
            int sum=0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }
            System.out.println("Sum of row = "+sum);
        }
    }
    
    static void calculateTheSumOfColumns(int[][] numbers){
        for (int i = 0; i < numbers[0].length; i++) {
            int sum=0;
            for (int j = 0; j < numbers.length; j++) {
                sum+=numbers[j][i];
            }
            System.out.println("Sum of row = "+sum);
        }
    }
    
}
