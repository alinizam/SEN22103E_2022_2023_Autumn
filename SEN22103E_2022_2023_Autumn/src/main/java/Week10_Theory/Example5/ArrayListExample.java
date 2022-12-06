/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10_Theory.Example5;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList mylist=new ArrayList();
        mylist.add("Ahmet Ak");
        mylist.add("Mehmet Yeşil");
        mylist.add("Ayşe Brown");
        System.out.println(mylist);
        System.out.println("Enhanced For");
        for (Object object : mylist) {
            System.out.println(object);
        }
        System.out.println("Classical For");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
