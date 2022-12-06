/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11_Theory.Example2;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class FileWriteObject {

    static FileWriter f;

    public static void main(String[] args) throws IOException {
        f = new FileWriter("c:\\files\\a.txt");
        f.write("Hello");
        f.close();

    }

    @Override
    protected void finalize() throws Throwable {
        if (f != null) {
            f.close();
        }
    }

}
