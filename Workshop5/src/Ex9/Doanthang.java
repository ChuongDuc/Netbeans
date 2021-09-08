/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Normie
 */
public class Doanthang extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
//       int x1,y1,x2,y2;
//    for (int i = 0; i < ; i++) {
//            
//        }
        g.setColor(Color.blue);
        g.drawLine(20, 20, 100, 100);
        g.drawLine(50, 20, 100, 100);
        g.drawLine(100, 20, 100, 100);
    }
    
}
