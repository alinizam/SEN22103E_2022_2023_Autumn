/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06_Lab_G1;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        // while bnum > 0
        //      control least important digit
        //      shift right bnmum
        int bnum=0b1000001;//1001 -> 9
        int count=0;
        while(bnum>0)
        {
            //System.out.println(bnum);
            if((bnum&1)==0)
            {
                count++;
            }
            bnum = bnum >> 1;
        }
        System.out.println("count="+count);
    }
}
