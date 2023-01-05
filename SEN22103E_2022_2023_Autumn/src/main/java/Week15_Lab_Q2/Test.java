/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Lab_Q2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Hasta h=new Hasta();
        h.adi="Ahmet";
        IKisi i=h;
        Hastane hastane=Hastane.yeniHastaneOlustur("FSM");
        hastane.hastalar.add(new Doktor());  
        hastane.hastalar.add(i);
        int hastaSayi=hastane.getHastaSayi();
        hastane.taburcuEt(h);

    }
}
