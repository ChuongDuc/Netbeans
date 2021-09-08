/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class Bonmua extends Applet {

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
        
        int x,y,w,h, dx=10;
        x=y=0;
        w=h=300;
        //thiet lap font
        Font f = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(f);
        
        // HCN 1
        g.setColor(Color.BLUE);
        g.fillRect(x, y, w, h);
        g.setColor(Color.PINK);
        g.fillOval(x, y, w, h);
        g.setColor(Color.YELLOW);
        g.drawString("XUAN", x+10, h/2);
        
        // HCN 2
        g.setColor(Color.RED);
        g.fillRect(x+w, y, w, h);
        g.setColor(Color.YELLOW);
        g.fillOval(x+w, y, w, h);
        g.setColor(Color.GREEN);
        g.drawString("HA", x+10+w, h/2);
        
        // HCN 3
        g.setColor(Color.BLUE);
        g.fillRect(x, y+h, w, h);
        g.setColor(Color.PINK);
        g.fillOval(x, y+h, w, h);
        g.setColor(Color.YELLOW);
        g.drawString("THU", x+10, h/2+h);
        
        // HCN 4
        g.setColor(Color.BLUE);
        g.fillRect(x+w, y+h, w, h);
        g.setColor(Color.PINK);
        g.fillOval(x+w, y+h, w, h);
        g.setColor(Color.YELLOW);
        g.drawString("Dong", x+10+w, h/2+h);
    }
    
}
