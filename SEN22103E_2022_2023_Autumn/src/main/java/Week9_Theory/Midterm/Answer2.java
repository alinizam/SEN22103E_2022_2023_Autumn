/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9_Theory.Midterm;

/**
 *
 * @author ali.nizam
 */
public class Answer2 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 5; i++) {
            
            for (int j = count; j <= count*2; j=j+2) {
                System.out.print(j+" ");
            }
            System.out.println("");
            count*=2;
        }
    }
}
