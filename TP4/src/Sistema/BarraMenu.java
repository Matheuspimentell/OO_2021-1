package Sistema;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class BarraMenu extends JPanel{
    BarraMenu(){
        JPanel barraFina = new JPanel(); //Definição de uma barra fina puramente estética
        barraFina.setPreferredSize(new Dimension(100,5)); //Definição do tamanho da barra fina
        barraFina.setBackground(new Color(0xEA2E27)); //Define a cor da barra fina
        barraFina.setVisible(true); //Deixa a barra fina visível
        Border borda = BorderFactory.createLineBorder(new Color(0xEFE826), 5);
        JLabel textoMenu = new JLabel();
        textoMenu.setText("Menu");
        textoMenu.setBorder(borda);
        textoMenu.setFont(new Font("", Font.BOLD, 16));
        textoMenu.setOpaque(false);
        this.setPreferredSize(new Dimension(100,40)); //Define o tamanho da barra de menu
        this.setBackground(new Color(0xEFE826)); //Define a cor da barra de menu
        this.setLayout(new BorderLayout()); //Define o layout como BorderLayout
        this.add(barraFina, BorderLayout.NORTH); //Adiciona a barrafina à barra de menu
        this.add(textoMenu, BorderLayout.WEST);
    }
    
}
