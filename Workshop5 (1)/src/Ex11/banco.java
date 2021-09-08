/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class banco extends Applet {

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
        int x,y,w,h;
        x=y=0;
        w=h=50;
        // thiet lap Font
//        Font f = new Font("SansSerif", Font.PLAIN,32);
//        g.setFont(f);
        //hinh do
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.setColor(Color.red);
                g.fillRect(x+w*j*2, y+h*i*2, w, h);
                g.setColor(Color.black);
                g.fillRect(w+w*j*2, y+h*i*2, w, h);
                g.setColor(Color.black);
                g.fillRect(x+w*j*2, h+h*i*2, w, h);
                g.setColor(Color.red);
                g.fillRect(w+w*j*2, h+h*i*2, w, h);
            }
        }
        
//        for(int i=1;i<9;i++){
//            if(i%2==1){
//                g.setColor(Color.red);
//                g.fillRect(x, y+h*(i-1), w, h); 
//            }
//            else if (i%2==0){
//                g.setColor(Color.black);
//                g.fillRect(x, y+h*(i-1), w, h); 
//        }
//        }
        }
    }
