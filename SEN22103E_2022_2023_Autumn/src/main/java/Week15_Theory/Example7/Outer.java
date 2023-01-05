/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class Outer {
    InnerClass getInner(){
        return new InnerClass();
    }
    class InnerClass{
        private int someAttribute;

        public void setSomeAttribute(int someAttribute) {
            this.someAttribute = someAttribute;
        }

        public int getSomeAttribute() {
            return someAttribute;
        }
        
        
    }
}
