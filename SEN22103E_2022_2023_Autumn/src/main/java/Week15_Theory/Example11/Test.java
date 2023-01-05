/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example11;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        for (String city : cities) {
            System.out.println(city);
        }
        cities.forEach(c->{System.out.println(c);
                           System.out.println(c);
                           });
        
    }
}
