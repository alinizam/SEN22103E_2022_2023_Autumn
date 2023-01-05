/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.InnerClass inner=o.new InnerClass();
        inner.setSomeAttribute(100);
        System.out.println(inner.getSomeAttribute());
        
        Outer o1=new Outer();
        Outer.InnerClass inner1=o1.getInner();
        
    }
}
