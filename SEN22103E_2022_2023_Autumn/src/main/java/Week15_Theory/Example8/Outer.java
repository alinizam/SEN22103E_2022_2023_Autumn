/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example8;

/**
 *
 * @author ali.nizam
 */
public class Outer { 
    private String outer = "Outer Class"; //NestedClass instance variable
    static String outerStatic="Outer static";
    InnerClass innerClass = new InnerClass();
    void getOuterS(){
        System.out.println(outer); 
    }
    void getInnerS(){
        System.out.println(innerClass.inner);
    }
    class InnerClass{
        private String inner = "Inner Class"; //InnerClass instance variable, uninitialized
        private String outer = "Inner outer";
        void getInnerS(){
            System.out.println(inner);
        }
        void getOuterS(){
            System.out.println(Outer.this.outer);
            System.out.println(Outer.outerStatic);
        }
        void getInnerParamHasTheSameNameWithOuter(){
            System.out.println(outer);
        }
    }
    
}

