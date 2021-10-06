package toyStore.GUI;

import toyStore.srcCode.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JanelaNotaFiscal extends JDialog{
    JPanel conteudo;
    JButton ok;
    JanelaNotaFiscal(){
        ok = new JButton();
        ok.setFocusable(false);
        ok.setPreferredSize(new Dimension(170,35));

        conteudo = new JPanel();
        conteudo.setBackground(new Color(0xffff9e));
        conteudo.setPreferredSize(new Dimension(300, 400));
        conteudo.setLayout(new BorderLayout());
        
        this.setModal(true);
        this.setSize(new Dimension(300, 500));
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(conteudo);
        this.add(ok);
        this.setVisible(true);
    }
}
