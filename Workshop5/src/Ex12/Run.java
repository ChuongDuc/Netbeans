/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Normie
 */
public class Run extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x, y, dx,dy,sx;
    Thread t = new Thread(this);
    public void init() {
        // TODO start asynchronous download of heavy resources
        x=0;
        dx=this.getWidth();
        dy=this.getHeight();
        y=dy/2;
        sx=10;
        t.start();
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Font f = new Font("SansSerif",Font.BOLD,32);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Java Applet!", x, y);
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(true){
            //1.vẽ lại đối tượng ở vị trí khác
            repaint();
            //2.ngủ
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            //3.vị trí mới 
            x = x+sx;
            //4.điểm dừng
            if(x==dx)x=0;
        
        }
    }
}
