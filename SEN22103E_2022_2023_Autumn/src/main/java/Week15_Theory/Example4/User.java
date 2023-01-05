/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15_Theory.Example4;

/**
 *
 * @author ali.nizam
 */
class User {
    String userName;
    private class Password{
        String getUserName(){
            return userName;
        }
    }
    static class PasswordStatic{
        String getUserName(){
           // return userName; not work Because static nested class con not read
           //the object attributes of outer class
           return "Not implemented";
        }
    }
}
