/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Theory.Example7;

/**
 *
 * @author ali.nizam
 */
public class Employee implements IComparable{

    @Override
    public boolean compare(Object o) { 
        if (!(o instanceof IComparable)){
            System.out.println("Compare Error");
            return false;
        }
            
        if (getClassName()==((IComparable)o).getClassName()){
            return true;
        }
        return false;
    }   

    @Override
    public String getClassName() {
        return "Employee";
    }
    
    
}
