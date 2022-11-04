/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        //loop through all digits
        //find the digits of number
        // chech a digits' existance in number's digit
        int num=12567890;
        boolean isFound;
        for (int digit = 0; digit < 10; digit++) {
            int num1= num;
            isFound=false;
            while(num1>0)
            {
                int ldigit= num1%10;
                if (digit==ldigit) {
                    isFound=true;
                    break;
                }
                num1/=10;
            }
            if (!isFound) {
                System.out.println("is not found digit -> "+digit); 
            }
        }
        
    }
}
