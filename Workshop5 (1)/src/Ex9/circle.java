/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class circle extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x1, x2, y1, y2;
    double k1, k2;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

//    @Override
//    public void print(Graphics g) {
//        super.print(g); //To change body of generated methods, choose Tools | Templates.
//        
//    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.blue);
        
        x2=y2=300;
        for (int i = 1; i <=12; i++) {
            k1 = i*Math.PI/6;
            x1 = (int) (200 * Math.sin(k1));
            y1 = (int) (200 * Math.cos(k1));
//            k2 = (i+6)*Math.PI/6;
//            x2 = (int) (200 * Math.sin(k2));
//            y2 = (int) (200 * Math.cos(k2));
            g.drawLine(300+x1, 300-y1, x2, y2);
            
        }
        
        
//        g.drawLine(x1, y1, x2, y2);
//        g.drawLine(y1+x1/2-20, (y1+y2)/2, y2+x1/2, (y1+y2)/2);
        //g.drawLine(x1+x1/4,(y1+y2)/2- ,x2-x2/4, (y1+y2)/2+(y1+y2)/4);
        
    }
    
    
}
//public class circle extends Applet {
//
//    /**
//     * Initialization method that will be called after the applet is loaded into
//     * the browser.
//     */
//    int x, y, dx, dy;
//    Random rand = new Random();
//
//    public void init() {
//        // TODO start asynchronous download of heavy resources
//        this.setSize(600, 600);
//        //this.setBackground(Color.black);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g); //To change body of generated methods, choose Tools | Templates.
//        Font f = new Font("SansSerif", Font.BOLD, 32);
//        g.setFont(f);
//        //angle : góc
//        double angle;
//        x = this.getWidth() / 2;
//        y = this.getHeight() / 2;
//        //vòng tròn bao nhiêu điểm thì chạy bấy nhiêu
//        for (int i = 0; i <= 20; i++) {
//            //lấy giá trị góc tại mỗi i : Math.PI == PI
//
//            angle = i * Math.PI / 10;
//
//            //math.sin == sin; math.cos == cos
//            dx = (int) (300 * Math.sin(angle));
//            dy = (int) (300 * Math.cos(angle));
//            
//            //lấy màu ramdom
//            Color color = new Color(rand.nextInt());
//
//            g.setColor(color);
//            g.drawString("Java", x + dx, y + dy);
//
//        }
//    }
//
//    // TODO overwrite start(), stop() and destroy() methods
//}