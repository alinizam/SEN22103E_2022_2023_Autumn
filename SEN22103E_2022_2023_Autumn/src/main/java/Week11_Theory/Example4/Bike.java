/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
class Bike {
    static int objectCount;

    Bike() {
        objectCount++;
    }

    static int getObjectCount() {
        return objectCount;
    }
    
}
