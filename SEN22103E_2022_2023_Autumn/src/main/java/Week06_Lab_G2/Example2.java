/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G2;

/**
 *
 * @author ali.nizam
 */
public class Example2 {

    public static void main(String[] args) {
        int number = 1891321067;
        int tempNumber;
        boolean isFound;    
        for (int searchDigit = 0; searchDigit < 10; searchDigit++) {
            int digitOfNumber;
            isFound=false;
            tempNumber=number;
            while (tempNumber > 0) {                
                digitOfNumber=tempNumber % 10;
                if (digitOfNumber==searchDigit){
                    isFound=true;
                    break;
                }
                tempNumber /= 10;
            }
            if (!isFound) 
                System.out.println(searchDigit + " is not found");
        }

    }
}
