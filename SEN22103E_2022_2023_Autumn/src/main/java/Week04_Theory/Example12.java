/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04_Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {

    /*  *	*	*	*	*
*	*	*	*	*
*	*	*	*	*
*	*	*	*	*
*	*	*	*	* */
    public static void main(String[] args) {
        int i = 1;
        int dimension=3;
        while (i <= dimension*dimension) {
            System.out.print("* ");
            if (i%dimension == 0) {
                System.out.println("");
            }
            i++;
        

        }

    }

}
