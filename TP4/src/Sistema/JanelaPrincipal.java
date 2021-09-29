package Sistema;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class JanelaPrincipal extends JFrame{
    BarraSuperior barraSuperior;
    BotaoOpcao opcao1;
    BotaoOpcao opcao2;
    BotaoOpcao opcao3;
    BotaoOpcao opcao4;
    BotaoOpcao opcao5;
    BotaoOpcao opcao6;
    
    public JanelaPrincipal(){
        barraSuperior = new BarraSuperior(); //Instancia o componente da barra superior
        opcao1 = new BotaoOpcao("<html>Visualizar<br />Loja</html>");
        opcao2 = new BotaoOpcao("<html>Visualizar<br />Clientes</html>");
        opcao3 = new BotaoOpcao("<html>Buscar<br />Cliente</html>");
        opcao4 = new BotaoOpcao("<html>Deletar<br />Cliente</html>");
        opcao5 = new BotaoOpcao("<html>Cadastrar<br />Venda</html>");
        opcao6 = new BotaoOpcao("");

        //---------------------------Parte inferior da janela-------------------------------------
        JPanel conteudo = new JPanel(); //Instancia o painel central que contém todas as opções
        conteudo.setLayout(new BorderLayout()); //Define o layout como BorderLayout

                            //------Margens--------
        JPanel margemEsquerda = new JPanel(); //Instancia a margem Esquerda do painel
        margemEsquerda.setPreferredSize(new Dimension(70,100)); //Define as dimensões das margens
        margemEsquerda.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemDireita = new JPanel(); //Instancia a margem Direita do painel
        margemDireita.setPreferredSize(new Dimension(70,100)); //Define as dimensões das margens
        margemDireita.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemSuperior = new JPanel(); //Instancia a margem Superior do painel
        margemSuperior.setPreferredSize(new Dimension(100,70)); //Define as dimensões das margens
        margemSuperior.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemInferior = new JPanel(); //Instancia a margem Inferior do painel
        margemInferior.setPreferredSize(new Dimension(100,70)); //Define as dimensões das margens
        margemInferior.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

                        //-------Conteudo Central---------
        JPanel central = new JPanel();
        central.setBackground(new Color(0x78c3fb));
        central.setLayout(new GridLayout(2,3,25,25));
        central.add(opcao1);
        central.add(opcao2);
        central.add(opcao3);
        central.add(opcao4);
        central.add(opcao5);
        central.add(opcao6);

                //----------Adição do conteúdo à parte inferior----------
        conteudo.add(margemSuperior, BorderLayout.NORTH);
        conteudo.add(margemInferior, BorderLayout.SOUTH);
        conteudo.add(central, BorderLayout.CENTER);
        conteudo.add(margemEsquerda, BorderLayout.WEST);
        conteudo.add(margemDireita, BorderLayout.EAST);

        //--------------------------------Definições da janela--------------------------------------
        this.setTitle("Toy Store Brinquedos LTDA."); //Título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar o programa ao fechar a janela
        this.setLayout(new BorderLayout()); //Faz a janela principal possuir um layout por bordas
        this.setSize(750,700); //Define o tamanho da janela
        this.getContentPane().setBackground(new Color(0xFFFFFF)); //Define a cor de fundo da janela
        this.add(barraSuperior, BorderLayout.NORTH); //Adiciona a barra superior ao norte da janela
        this.add(conteudo, BorderLayout.CENTER);
        this.setVisible(true); //Deixa a janela visível
        this.setResizable(false); //Limita o tamanho da tela
    }
}
