/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Theory.Example3;

/**
 *
 * @author ali.nizam
 */
public class ArrayMethod {

    public static void main(String[] args) {
        int numbers[]={1,3,4};
        System.out.println(calculateTotalofArray(numbers));
   
        int numbers2D[][]={{1,3,4},{1,3,4}};
        System.out.println(calculateTotalof2DArray(numbers2D));
        
        int[] digits=digit2ArrayForFiveDigitNumber(19845);
        for (int digit : digits) {
            System.out.println(digit);
        }
       
    
    }
    static int calculateTotalofArray(int[] numbers) {
        int total=0;
        for (int number : numbers) {
            total+=number;
        }
        return total;
        
    }
    
     static int calculateTotalof2DArray(int[][] numbers) {
        int total=0;
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                 total+=numbers[i][j];
             }
         } 
        return total;
     }  
     
    static int[] digit2ArrayForFiveDigitNumber(int number){
         int digits[]=new int[5];
         int temp=number;
         for (int i = 0; i < digits.length; i++) {
             digits[i]=temp%10;
             temp=temp/10;
         }
         return digits;
     
     }
}
