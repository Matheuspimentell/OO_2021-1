package toyStore.GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Objeto BarraMenu
 * 
 * Barra de menu para a barra superior (Header) da GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */

public class BarraMenu extends JPanel{
	
	/**
	 * Parametros uteis para uma janela de impressao de nota fiscal.
	 * */
    private JButton botaoSistema;
    private JButton botaoLoja;
    private JButton botaoClientes;
    
    /**
     * Construtor padrao de BarraMenu
     * */
    BarraMenu(){

        //---------------Barra fina superior (Apenas estatica)-------------------
        JPanel barraFina = new JPanel(); //Definicao de uma barra fina puramente estatica
        barraFina.setPreferredSize(new Dimension(750,5)); //Definicao do tamanho da barra fina
        barraFina.setBackground(new Color(0xEA2E27)); //Define a cor da barra fina
        barraFina.setVisible(true); //Deixa a barra fina visivel

        //---------------Label indicativa da barra de menu-------------------
        JLabel textoMenu = new JLabel();
        textoMenu.setPreferredSize(new Dimension(160, 35));
        textoMenu.setText("Menu");
        textoMenu.setFont(new Font("Arial", Font.BOLD, 16));
        textoMenu.setForeground(new Color(0xEA2E27));
        textoMenu.setHorizontalTextPosition(JLabel.CENTER);

        //----------Botao de selecao das opcoes do Sistema-------------------
        botaoSistema = new JButton();
        botaoSistema.setPreferredSize(new Dimension(150,35));
        botaoSistema.setBackground(new Color(0xEFE826));
        botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoSistema.setText("Sistema");
        botaoSistema.setFont(new Font("Arial", Font.BOLD, 14));
        botaoSistema.setFocusable(false);
        botaoSistema.setHorizontalTextPosition(JButton.CENTER);
        botaoSistema.setVerticalTextPosition(JButton.CENTER);

        //----------Botao de selecao das opcoes da Loja-------------------
        botaoLoja = new JButton();
        botaoLoja.setPreferredSize(new Dimension(150,35));
        botaoLoja.setBackground(new Color(0xEFE826));
        botaoLoja.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoLoja.setText("Loja");
        botaoLoja.setFont(new Font("Arial", Font.BOLD, 14));
        botaoLoja.setFocusable(false);
        botaoLoja.setHorizontalTextPosition(JButton.CENTER);
        botaoLoja.setVerticalTextPosition(JButton.CENTER);

        //----------Botao de selecao das opcoes dos Clientes-------------------
        botaoClientes = new JButton();
        botaoClientes.setPreferredSize(new Dimension(150,35));
        botaoClientes.setBackground(new Color(0xEFE826));
        botaoClientes.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        botaoClientes.setText("Cliente");
        botaoClientes.setFont(new Font("Arial", Font.BOLD, 14));
        botaoClientes.setFocusable(false);
        botaoClientes.setHorizontalTextPosition(JButton.CENTER);
        botaoClientes.setVerticalTextPosition(JButton.CENTER);

        //---------------------------Fim dos botoes---------------------------

        this.setPreferredSize(new Dimension(100,40)); //Define o tamanho da barra de menu
        this.setBackground(new Color(0xEFE826)); //Define a cor da barra de menu
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); //Define o layout como BorderLayout
        this.add(barraFina); //Adiciona a barra fina a barra de menu
        this.add(textoMenu); //Adiciona a Label indicativa da barra de menu
        this.add(botaoSistema); //Adiciona o botao de opcoes da classe Sistema
        this.add(botaoLoja); //Adiciona o botao de opcoes da classe Loja
        this.add(botaoClientes); //Adiciona o botao de opcoes da classe Cliente
    }

	public JButton getBotaoSistema() {
		return botaoSistema;
	}

	public void setBotaoSistema(JButton botaoSistema) {
		this.botaoSistema = botaoSistema;
	}

	public JButton getBotaoLoja() {
		return botaoLoja;
	}

	public void setBotaoLoja(JButton botaoLoja) {
		this.botaoLoja = botaoLoja;
	}

	public JButton getBotaoClientes() {
		return botaoClientes;
	}

	public void setBotaoClientes(JButton botaoClientes) {
		this.botaoClientes = botaoClientes;
	}
    
    
}
