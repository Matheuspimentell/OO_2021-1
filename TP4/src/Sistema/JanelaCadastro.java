package Sistema;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastro extends JDialog implements ActionListener{
    JPanel conteudo;

    JanelaCadastro(String titulo){
        //----------------Bordas de formatação----------------
        JPanel bordaSuperior = new JPanel();
        bordaSuperior.setPreferredSize(new Dimension(50, 50));
        bordaSuperior.setBackground(Color.GRAY);
        bordaSuperior.setOpaque(false);
        JPanel bordaInferior = new JPanel();
        bordaInferior.setPreferredSize(new Dimension(50, 50));
        bordaInferior.setBackground(Color.DARK_GRAY);
        bordaInferior.setOpaque(false);
        JPanel bordaEsquerda = new JPanel();
        bordaEsquerda.setPreferredSize(new Dimension(50, 50));
        bordaEsquerda.setBackground(Color.LIGHT_GRAY);
        bordaEsquerda.setOpaque(false);
        JPanel bordaDireita = new JPanel();
        bordaDireita.setPreferredSize(new Dimension(50, 50));
        bordaDireita.setBackground(Color.BLACK);
        bordaDireita.setOpaque(false);

        //-------------Painel de conteudo------------
        conteudo = new JPanel();
        conteudo.setLayout(new GridLayout(3, 2, 10, 10));
        conteudo.setVisible(true);

        //------------Configurações da tela------------
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.add(bordaSuperior, BorderLayout.NORTH);
        this.add(bordaInferior, BorderLayout.SOUTH);
        this.add(conteudo, BorderLayout.CENTER);
        this.add(bordaEsquerda, BorderLayout.WEST);
        this.add(bordaDireita, BorderLayout.EAST);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
