/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14_Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Screen {

    ArrayList<IMotion> objects = new ArrayList();

    String getTotalComponentAreaMax() {
        int totalTextBoxArea = 0;
        int totalButtonArea = 0;
        for (IMotion o : objects) {
            if (o instanceof TextBox) {
                totalTextBoxArea += o.getArea();
            }
            if (o instanceof Button) {
                totalButtonArea += o.getArea();
            }
        }
        String result;
        if (totalButtonArea > totalTextBoxArea) {
            result = "Button is max=" + totalButtonArea;
        } else {
            result = "Text is max=" + totalTextBoxArea;
        }

        return result;

    }

    boolean findSameShapedComponent(IMotion object) {
        boolean isSame = false;
        for (IMotion screenObject : objects) {
            int xSizeScreen = screenObject.getX1() - screenObject.getX2();
            int ySizeScreen = screenObject.getY1() - screenObject.getY2();
            int xSize = object.getX1() - screenObject.getX2();
            int ySize = object.getX1() - screenObject.getX2();
            if ((object instanceof TextBox && screenObject instanceof TextBox)
                    || (object instanceof Button && screenObject instanceof Button)) {
                if (xSize == xSizeScreen && ySize == ySizeScreen) {
                    isSame = true;
                    break;
                }
            }
        }
        return isSame;
    }
   
}
