/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dong_ho;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class test extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    double angle;
    int x,y;
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.white);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.BLACK);
        for (int i = 1; i <= 12; i++) {
            angle = i*Math.PI/6;
            x = (int) (200 * Math.sin(angle));
            y = (int) (200 * Math.cos(angle));
            g.drawString(Integer.toString(i), 300+x, 300-y);
        }
        g.fillOval(295, 295, 10, 10);
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        
        hour = hour%12;
        angle = (hour*Math.PI/6)+(min*Math.PI/(6*60))+(sec*Math.PI/(6*360));
            x = (int) (160 * Math.sin(angle));
            y = (int) (160 * Math.cos(angle));
            g.drawLine(300, 300, 300+x, 300-y);
        
        angle = (min*Math.PI/(30))+(sec*Math.PI/(60*30));
            x = (int) (190 * Math.sin(angle));
            y = (int) (190 * Math.cos(angle));
            g.drawLine(300, 300, 300+x, 300-y);
            
        g.setColor(Color.red);
        angle = (sec*Math.PI/(30));
            x = (int) (170 * Math.sin(angle));
            y = (int) (170 * Math.cos(angle));
            g.drawLine(300, 300, 300+x, 300-y);
    }
//    public void Start(){
//        new Thread(){
//            public void run(){
//                while(true){
//                    try{
//                        Thread.sleep(100);
//                    }
//                    catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    repaint();
//                }
//            }
//        }.start();
//    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
//                e.printStackTrace();
            }
            repaint();
        }
    }
      
}
    

