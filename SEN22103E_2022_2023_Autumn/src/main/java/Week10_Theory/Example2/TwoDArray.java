/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers=new int[2][3];
        numbers[0][0]=2;
        numbers[0][1]=6;
        numbers[0][2]=2;
        numbers[1][0]=5;
        numbers[1][1]=2;
        numbers[1][2]=1;
        
    //   int[] secondArray=numbers[1];
        int[] secondArray={0,1};
         
         numbers[0]=secondArray;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Sub Dimension Size =" + numbers[i].length);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
        
        
        
    }
}
