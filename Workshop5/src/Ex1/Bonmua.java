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
 * @author Normie
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
        
        int x,y,w,h,dx;
        x=y=0;
        w=h=300;
        dx=10;
        //thiet lap font
        Font f = new Font("SansSerif",Font.BOLD,32);
        g.setFont(f);
        
        //Hinh CN
        g.setColor(Color.BLUE);
        g.fillRect(x, y, w, h);
        g.setColor(Color.PINK);
        g.fillOval(x, y, w, h);
        g.setColor(Color.DARK_GRAY);
        g.drawString("XUÂN", x+10, h/2);
        
        //Hinh CN2
        g.setColor(Color.CYAN);
        g.fillRect(x+w , y, w, h);
        g.setColor(Color.ORANGE);
        g.fillOval(x+w, y, w, h);
        g.setColor(Color.DARK_GRAY);
        g.drawString("HẠ", x+w+10, h/2);
        
        //HCN3
        g.setColor(Color.BLACK);
        g.fillRect(2*x , y+h, w, h);
        g.setColor(Color.GRAY);
        g.fillOval(2*x, y+h, w, h);
        g.setColor(Color.YELLOW);
        g.drawString("THU", 2*x+10,h+ h/2);
        
        //HCN3
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(2*x+w , y+h, w, h);
        g.setColor(Color.MAGENTA);
        g.fillOval(2*x+w, y+h, w, h);
        g.setColor(Color.RED);
        g.drawString("ĐÔNG", 2*x+w+10, h+ h/2);
    }
    
}
