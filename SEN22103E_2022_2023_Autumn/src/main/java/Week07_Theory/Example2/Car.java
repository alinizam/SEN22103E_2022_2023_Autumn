/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07_Theory.Example2;

/**
 *
 * @author ali.nizam
 */
class Car {
   int price;
   char color;
   String model;
   int power;
   void displayModel(){
       System.out.println("The model is "+model);
   }
   //
  //have return type and not taking any variable
   void definePrice(){
       if (color=='b'){
           price=10000;
       }else{
           price=20000;
       }
   }
    //have return type and not taking any variable
    int getPrice(){
        return price;
    }
    String getModel(){ 
        return model;
    }
    void discountPrice(int discount){
        price=price-discount;
    }
    int increasePower(int increaseAmount){
        power+=increaseAmount;
        return power;
    }
    
    void discountBasePrice(int discount){
        definePrice();
        price=price-discount;
    }
    
    
}
