/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example10;

/**
 *
 * @author ali.nizam
 */
public class Car {
    int currentSpeed;
    int getSpeed(){
        IMoveable move=new IMoveable() {
            @Override
            public int increaseSpeed() {
               //something are coded
                return 100;
            }
        };
        return currentSpeed+move.increaseSpeed();
                
    }
    void getSpeedCall(){
        IMoveable move=new IMoveable() {
            @Override
            public int increaseSpeed() {
               //something are coded
                return 100;
            }
        };
        getSpeed(move);
    }
    int getSpeed(IMoveable move){
       
        return currentSpeed+move.increaseSpeed();
                
    }
}
