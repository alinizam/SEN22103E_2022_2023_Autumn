/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13_Theory.Example1;

/**
 *
 * @author ali.nizam
 */
public class TestDownCast {
    public static void main(String[] args) {
        Shape s=new Triange(2,10);
        Triange t=(Triange)s;
        System.out.println(t.getHeigth());
        
        Shape s1=new Triange(10,5);
        if (s1 instanceof Triange){ 
            Triange t1=(Triange)s1;
            System.out.println(t1.getHeigth());
        }else{
            System.out.println("Is is not a triange");
        }
        
        
    }
}
