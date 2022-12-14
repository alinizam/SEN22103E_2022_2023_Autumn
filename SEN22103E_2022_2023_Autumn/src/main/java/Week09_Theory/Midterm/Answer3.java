/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09_Theory.Midterm;

/**
 *
 * @author ali.nizam
 */
public class Answer3 {
    public static void main(String[] args) {
        int y = 5;
      	int x = 1;
     	int z = 0;
      	while (z<12) {
           if (x >= (y >> 1)) {
                System.out.println("x: " + x + "  y: " + y + " z: "+ z);
           }
            z = (3 * x++) + y--;
      	}
      	System.out.println("x: " + x + "  y: " + y + " z: "+ z);

    }
}
