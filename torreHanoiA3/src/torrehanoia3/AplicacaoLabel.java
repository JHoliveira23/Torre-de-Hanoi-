
package torrehanoia3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class AplicacaoLabel extends NFrame {
    
    
    JLabel L1, L2, L3, L4, L5, L6; // Objeto Independente
    
    public AplicacaoLabel(){
        
        L1 = new JLabel("Cadastro", JLabel.CENTER);
        L1.setFont(new Font("Arial",Font.BOLD,10));
        L1.setBorder(BorderFactory.createLineBorder(Color.CYAN,04));
        L1.setBounds(100,30,300,30);
        
        L2 = new JLabel("codigo :", JLabel.RIGHT);
        L2.setFont(new Font("arial",Font.BOLD,12));
        L2.setBounds(70,120,100,20);
        
        L3 = new JLabel("Valor Total :", JLabel.RIGHT);
        L3.setFont(new Font("arial", Font.BOLD,12));
        L3.setBounds(70,220,100,20);
        
        getContentPane().setLayout(null);
        getContentPane().add(L1);
        getContentPane().add(L2);
        getContentPane().add(L3);             
    }
    public static void main(String[] args) {
		
		new AplicacaoLabel().show();

	}
    
}
