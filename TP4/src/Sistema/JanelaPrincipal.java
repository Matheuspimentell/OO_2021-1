package Sistema;

import javax.swing.JFrame;
import java.awt.Color;

public class JanelaPrincipal extends JFrame{
    public JanelaPrincipal(){
        this.setTitle("Toy Store Brinquedos LTDA."); //Título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar o programa quando clicar no x
        this.setLayout(null);
        this.setSize(700,700);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
