package Week05_Theory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ali.nizam
 */
public class Example14 {
    //1 2 3 4 5
    //2 3 4 5 6
    //3 4 5 6 7
    //4 5 6 7 8
    //5 6 7 8 9

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i+j)+" ");
            }
            System.out.println("");
 
        }
    
    }
}
