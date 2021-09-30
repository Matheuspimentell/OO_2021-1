package Sistema;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JanelaCadastro extends JDialog{
    JanelaCadastro(String titulo){
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.setVisible(true);
    }
}
