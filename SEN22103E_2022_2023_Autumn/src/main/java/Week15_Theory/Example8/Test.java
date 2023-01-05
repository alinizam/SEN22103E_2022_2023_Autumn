/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example8;

/**
 *
 * @author ali.nizam
 */
public class Test {
   public static void main(String[] args){
        Outer nestedClass = new Outer();
        Outer.InnerClass nestedInner = nestedClass.new InnerClass();//can also be new NestedClass().new InnerClass ();
        nestedClass.getOuterS();
        nestedClass.getInnerS();
        nestedInner.getInnerS();
        nestedInner.getOuterS();
        nestedInner.getInnerParamHasTheSameNameWithOuter();
    }
}
