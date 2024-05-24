
package torrehanoia3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AplicacaoEvento extends AplicacaoButton implements ActionListener {
    AplicacaoEvento(){
        
    B1.addActionListener(this);// Adiciona ações ao botão
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);
    B6.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==B1){
        Pilha pino1 = new Pilha(Tx1.getText());
        
        Tx1.setText(" ");
        Tx2.setText(" ");
        Tx3.setText(" ");
        
     
}
    if(e.getSource()==B2){
        JOptionPane.showMessageDialog(null, "Botao 2");
        Tx1.setText(" ");
        Tx2.setText(" ");
}
    if (e.getSource() == B3){
        JOptionPane.showMessageDialog(null, "Escolha pilha : "+ Tx1.getText() + " ");
        Pilha pino2 = new Pilha(Tx1.getText());
        
        Tx1.setText(" ");
        Tx2.setText(" ");
        
}
    if(e.getSource()==B4){
        JOptionPane.showMessageDialog(null, "Botao 4");
}
    if (e.getSource() == B5){
        this.dispose();
}
    if (e.getSource() == B6){
        JOptionPane.showMessageDialog(null, "Botao 6");
}
}

public static void main ( String arg[]){
    NFrame Fx = new AplicacaoEvento();
    Fx. show();
    }
}
