/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Thoery.Example4;

/**
 *
 * @author ali.nizam
 */
public class VarArgExample {
    public static void main(String[] args) {
        System.out.println(calculate(1));
        System.out.println(calculate(1,2));
        int[] numbers={1,2};
        System.out.println(calculate(numbers));
        
        System.out.println(calculate());
    }
    static int calculate(int... numbers){
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];
        }
        return total; 
    }
    
    static int calculateWithString(int otherNumber,int... numbers){
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];
        }
        return total; 
    }
}
