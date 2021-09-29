package Sistema;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

public class JanelaPrincipal extends JFrame implements ActionListener{
    BarraSuperior barraSuperior;
    BotaoOpcao opcao1;
    BotaoOpcao opcao2;
    BotaoOpcao opcao3;
    BotaoOpcao opcao4;
    BotaoOpcao opcao5;
    BotaoOpcao opcao6;
    
    public JanelaPrincipal(){
        barraSuperior = new BarraSuperior(); //Instancia o componente da barra superior

        //---------------------------Botões de opção----------------------------------
        opcao1 = new BotaoOpcao("<html>Visualizar dados<br />da Loja</html>"); //Cria um botão com texto
        opcao2 = new BotaoOpcao("<html>Cadastrar<br />Venda</html>"); //Cria um botão com texto
        opcao3 = new BotaoOpcao("");
        opcao3.setVisible(false); //Desabilita e torna invisível um botão
        opcao4 = new BotaoOpcao("");
        opcao4.setVisible(false); //Desabilita e torna invisível um botão
        opcao5 = new BotaoOpcao("");
        opcao5.setVisible(false); //Desabilita e torna invisível um botão
        opcao6 = new BotaoOpcao("");
        opcao6.setVisible(false); //Desabilita e torna invisível um botão
        barraSuperior.barraMenu.botaoSistema.setEnabled(false); //Desabilita e torna invisível o botão Sistema
        barraSuperior.barraMenu.botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)); //Deixa o botão selecionado

                        //---------------Action Listeners------------------
        barraSuperior.barraMenu.botaoSistema.addActionListener(this);
        barraSuperior.barraMenu.botaoLoja.addActionListener(this);
        barraSuperior.barraMenu.botaoClientes.addActionListener(this);
        opcao1.addActionListener(this);
        opcao2.addActionListener(this);
        opcao3.addActionListener(this);
        opcao4.addActionListener(this);
        opcao5.addActionListener(this);
        opcao6.addActionListener(this);
        
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
        JPanel central = new JPanel(); //Cria o painel central
        central.setBackground(new Color(0x78c3fb)); //Colore o fundo
        central.setLayout(new GridLayout(2,3,25,25)); //Define o Layout como GridLayout

                //--------Adiciona os botões de opção ao painel central--------
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

    @Override
    public void actionPerformed(ActionEvent e) {

        //--------------------Caso se esteja na opção loja------------------
        if(e.getSource() ==  barraSuperior.barraMenu.botaoLoja){
            opcao1.setText("<html>Completar<br />cadastro</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Visualizar<br />funcionarios</html>");
            opcao2.setVisible(true);
            opcao3.setText("<html>Visualizar<br />estoque</html>");
            opcao3.setVisible(true);
            opcao4.setText("<html>Editar dados<br />da Loja</html>");
            opcao4.setVisible(true);
            opcao5.setVisible(false);
            opcao6.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(false);
            barraSuperior.barraMenu.botaoLoja.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            barraSuperior.barraMenu.botaoSistema.setEnabled(true);
            barraSuperior.barraMenu.botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            barraSuperior.barraMenu.botaoClientes.setEnabled(true);
            barraSuperior.barraMenu.botaoClientes.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        }

        //--------------------Caso se esteja na opção cliente------------------
        if(e.getSource() ==  barraSuperior.barraMenu.botaoClientes){
            opcao1.setText("<html>Visualizar<br />clientes</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Carrinhos de<br />Compras</html>");
            opcao2.setVisible(true);
            opcao3.setVisible(false);
            opcao4.setVisible(false);
            opcao5.setVisible(false);
            opcao6.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(true);
            barraSuperior.barraMenu.botaoLoja.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            barraSuperior.barraMenu.botaoSistema.setEnabled(true);
            barraSuperior.barraMenu.botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            barraSuperior.barraMenu.botaoClientes.setEnabled(false);
            barraSuperior.barraMenu.botaoClientes.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        }

        //--------------------Caso se esteja na opção Sistema------------------
        if(e.getSource() ==  barraSuperior.barraMenu.botaoSistema){
            opcao1.setText("<html>Visualizar dados<br />da Loja</html>");
            opcao2.setText("<html>Cadastrar<br />Venda</html>");
            opcao3.setVisible(false);
            opcao4.setVisible(false);
            opcao5.setVisible(false);
            opcao6.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(true);
            barraSuperior.barraMenu.botaoLoja.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            barraSuperior.barraMenu.botaoSistema.setEnabled(false);
            barraSuperior.barraMenu.botaoSistema.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            barraSuperior.barraMenu.botaoClientes.setEnabled(true);
            barraSuperior.barraMenu.botaoClientes.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        }
    }
}
