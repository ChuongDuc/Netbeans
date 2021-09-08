/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author DELL
 */
public class bia_ban extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private static final long serialVersionUID = 1L;
    private JButton btEclipse = new JButton("Tạo bia bắn");
    
    private int mode = 0;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        initComponent(); // khởi tạo các components
        btEclipse.addActionListener(this); // nạp sự kiện cho nút btEclipse
        
    }
    public void initComponent(){
        this.setLayout(new FlowLayout()); // đặt layout cho applet
        this.setSize(300, 200); // đặt kích thước cho applet
        this.add(btEclipse); // thêm nút btEclipse lên Applet
        
        this.setVisible(true); // hiển thị các component trên applet
    }
    // TODO overwrite start(), stop() and destroy() methods

    public void actionPerformed(ActionEvent ae ){
        if(ae.getSource() == btEclipse){ // nếu ấn nút btEclipse
            mode = 1;
        }
        
        repaint(); // vẽ lại toàn bộ các hiển thị trên applet (hàm này sẽ tự động gọi cả hàm paint(Graphics ) )
         
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        if(mode == 1)
        {
        int x,y,w,h, dx=100;
        x=y=0;
        w=h=300;
        showStatus("bia bắn");
        for (int i = 0; i < 7; i++) {
            if(i%2==0)
                g.setColor(Color.PINK);
            else
                g.setColor(Color.white);
            g.fillOval(x+(dx/2)*i, y+(dx/2)*i, w+500-dx*i, h+500-dx*i);
        }
        
        //g.fillRoundRect(x, y, w+500, h+500, w, h);
        
        }
    }
}
