package torrehanoia3;

import javax.swing.*;
import java.awt.*;

public class NFrame extends JFrame {
    
    public NFrame(){
        Color cor = new Color(128,128,128);
        Color cor1 = new Color(225,188,131);
        Container c = getContentPane();
        setLocation(100,50);
        setTitle("FastHeal");
        setSize(800,600);
        setUndecorated(true);
        c.setBackground(cor);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
	new NFrame().show();

	}
}
