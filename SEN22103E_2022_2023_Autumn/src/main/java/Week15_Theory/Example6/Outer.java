/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example6;

/**
 *
 * @author ali.nizam
 */
class Outer {
    int instanceVar = 5;
    
    static class NestedStatic {
    public static void main(String[] args){    
        // instanceVar = 10; //error: Nested static class can 
                            //not access to the instance variable of outer class
    }
    }
}

