/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example3 {

    public static void main(String[] args) {
        int month = 2;
        int year = 1900;
        int numDays=14 ;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10:case 12:
                numDays = 31;
                break;
            case 4: case 6:case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);
    }

}

