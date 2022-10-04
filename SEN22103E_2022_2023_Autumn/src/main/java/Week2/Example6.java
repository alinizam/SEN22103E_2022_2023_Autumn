/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
    public static void main(String[] args) {
        int i;
        byte b=1;
        i=b;
        i=200;
        b=(byte)i;
        System.out.println(b);
        
        char c='A';
        i=c;
        System.out.println((char)(i+1)); 
        System.out.println((char)(66));
        
        char c1=100;
        System.out.println(c1);
        
        System.out.println((char)('i'+1));
        
        String s="1000";
      //System.out.println((int)s); wrong
      //Integer.parseInt(s);  true way
      
        int j=0x1a;
        System.out.println(j);
        
        
         
        
        
        
        
        
    }
}
