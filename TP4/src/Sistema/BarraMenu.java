package Sistema;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class BarraMenu extends JPanel{
    JButton botaoSistema;
    JButton botaoLoja;
    JButton botaoClientes;
    
    BarraMenu(){

        //---------------Barra fina superior (Apenas estética)-------------------
        JPanel barraFina = new JPanel(); //Definição de uma barra fina puramente estética
        barraFina.setPreferredSize(new Dimension(750,5)); //Definição do tamanho da barra fina
        barraFina.setBackground(new Color(0xEA2E27)); //Define a cor da barra fina
        barraFina.setVisible(true); //Deixa a barra fina visível

        //---------------Label indicativa da barra de menu-------------------
        JLabel textoMenu = new JLabel();
        textoMenu.setPreferredSize(new Dimension(160, 35));
        textoMenu.setText("Menu");
        textoMenu.setFont(new Font("Arial", Font.BOLD, 16));
        textoMenu.setHorizontalTextPosition(JLabel.CENTER);

        //----------Botão de seleção das opções do Sistema-------------------
        botaoSistema = new JButton();
        botaoSistema.setPreferredSize(new Dimension(150,35));
        botaoSistema.setBackground(new Color(0xEFE826));
        botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoSistema.setText("Sistema");
        botaoSistema.setFont(new Font("Arial", Font.BOLD, 14));
        botaoSistema.setFocusable(false);
        botaoSistema.setHorizontalTextPosition(JButton.CENTER);
        botaoSistema.setVerticalTextPosition(JButton.CENTER);

        //----------Botão de seleção das opções da Loja-------------------
        botaoLoja = new JButton();
        botaoLoja.setPreferredSize(new Dimension(150,35));
        botaoLoja.setBackground(new Color(0xEFE826));
        botaoLoja.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoLoja.setText("Loja");
        botaoLoja.setFont(new Font("Arial", Font.BOLD, 14));
        botaoLoja.setFocusable(false);
        botaoLoja.setHorizontalTextPosition(JButton.CENTER);
        botaoLoja.setVerticalTextPosition(JButton.CENTER);

        //----------Botão de seleção das opções dos Clientes-------------------
        botaoClientes = new JButton();
        botaoClientes.setPreferredSize(new Dimension(150,35));
        botaoClientes.setBackground(new Color(0xEFE826));
        botaoClientes.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoClientes.setText("Cliente");
        botaoClientes.setFont(new Font("Arial", Font.BOLD, 14));
        botaoClientes.setFocusable(false);
        botaoClientes.setHorizontalTextPosition(JButton.CENTER);
        botaoClientes.setVerticalTextPosition(JButton.CENTER);

        //---------------------------Fim dos botões---------------------------

        this.setPreferredSize(new Dimension(100,40)); //Define o tamanho da barra de menu
        this.setBackground(new Color(0xEFE826)); //Define a cor da barra de menu
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); //Define o layout como BorderLayout
        this.add(barraFina); //Adiciona a barra fina à barra de menu
        this.add(textoMenu); //Adiciona a Label indicativa da barra de menu
        this.add(botaoSistema); //Adiciona o botão de opções da classe Sistema
        this.add(botaoLoja); //Adiciona o botão de opções da classe Loja
        this.add(botaoClientes); //Adiciona o botão de opções da classe Cliente
    }
    
}
