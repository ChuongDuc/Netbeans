/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class E12 extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
//    Button bne;
//    String oi = "kien";
    
    int x, y, dx, dy, sx;
    Thread t = new Thread(this);
    public void init() {
        // TODO start asynchronous download of heavy resources
        dx = this.getWidth();
        dy = this.getHeight();
        x=0;
        y = dy/2;
        sx=10;
        t.start();
//        bne = new Button(oi);
//        add(bne);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Font f = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(f);
        g.setColor(Color.blue);
        g.drawString("java applet", x, y);
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(true){
            
            // ve lai dt o vtri khac
            repaint();
            // ngur
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            // vi tri moi
            x =x +sx;
            
            //4 diem dung
            if(x>=dx - 170 || x == 0) sx = -sx;
            dx = this.getWidth();
        }
    }
    
}
