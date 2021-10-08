package toyStore.GUI;

import toyStore.srcCode.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JanelaPrincipal extends JFrame implements ActionListener{
    BarraSuperior barraSuperior;
    JanelaCadastro janelaCadastro;
    JanelaVisualizacao janelaVisualizacao;
    JanelaEdicao janelaEdicao;
    Sistema SYS;
    BotaoOpcao opcao1;
    BotaoOpcao opcao2;
    BotaoOpcao opcao3;
    BotaoOpcao opcao4;
    BotaoOpcao opcao5;
    BotaoOpcao opcao6;
    Border selecionada = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    Border disponivel = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    
    public JanelaPrincipal(Sistema sistema){
        SYS = sistema; //Referência do sistema para integração de dados
        barraSuperior = new BarraSuperior(); //Instância o componente da barra superior

        //---------------------------Botões de opção----------------------------------
        opcao1 = new BotaoOpcao("<html>Visualizar dados<br />da loja</html>"); //Cria um botão com texto
        opcao2 = new BotaoOpcao("<html>Cadastrar<br />venda</html>"); //Cria um botão com texto
        opcao3 = new BotaoOpcao("");
        opcao3.setVisible(false); //Desabilita e torna invisível um botão
        opcao4 = new BotaoOpcao("");
        opcao4.setVisible(false); //Desabilita e torna invisível um botão
        opcao5 = new BotaoOpcao("");
        opcao5.setVisible(false); //Desabilita e torna invisível um botão
        opcao6 = new BotaoOpcao("");
        opcao6.setVisible(false); //Desabilita e torna invisível um botão
        barraSuperior.barraMenu.botaoSistema.setEnabled(false); //Desabilita e torna invisível o botão Sistema
        barraSuperior.barraMenu.botaoSistema.setBorder(selecionada); //Deixa o botão selecionado

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
            //-----------Realizar alterações no conteúdo mostrado---------------
            opcao1.setText("<html>Visualizar<br />funcionarios</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Visualizar<br />estoque</html>");
            opcao2.setVisible(true);
            opcao3.setText("<html>Editar dados<br />da Loja</html>");
            opcao3.setVisible(true);
            opcao4.setVisible(false);
            opcao4.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(false);
            barraSuperior.barraMenu.botaoLoja.setBorder(selecionada);
            barraSuperior.barraMenu.botaoSistema.setEnabled(true);
            barraSuperior.barraMenu.botaoSistema.setBorder(disponivel);
            barraSuperior.barraMenu.botaoClientes.setEnabled(true);
            barraSuperior.barraMenu.botaoClientes.setBorder(disponivel);
        }

        //--------------------Caso se esteja na opção cliente------------------
        if(e.getSource() ==  barraSuperior.barraMenu.botaoClientes){
            //-----------Realizar alterações no conteúdo mostrado---------------
            opcao1.setText("<html>Visualizar<br />clientes</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Carrinhos de<br />compras</html>");
            opcao2.setVisible(true);
            opcao3.setVisible(false);
            opcao4.setVisible(false);
            opcao5.setVisible(false);
            opcao6.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(true);
            barraSuperior.barraMenu.botaoLoja.setBorder(disponivel);
            barraSuperior.barraMenu.botaoSistema.setEnabled(true);
            barraSuperior.barraMenu.botaoSistema.setBorder(disponivel);
            barraSuperior.barraMenu.botaoClientes.setEnabled(false);
            barraSuperior.barraMenu.botaoClientes.setBorder(selecionada);
        }

        //--------------------Caso se esteja na opção Sistema------------------
        if(e.getSource() ==  barraSuperior.barraMenu.botaoSistema){
            //-----------Realizar alterações no conteúdo mostrado---------------
            opcao1.setText("<html>Visualizar dados<br />da loja</html>");
            opcao2.setText("<html>Cadastrar<br />venda</html>");
            opcao3.setVisible(false);
            opcao4.setVisible(false);
            opcao5.setVisible(false);
            opcao6.setVisible(false);
            barraSuperior.barraMenu.botaoLoja.setEnabled(true);
            barraSuperior.barraMenu.botaoLoja.setBorder(disponivel);
            barraSuperior.barraMenu.botaoSistema.setEnabled(false);
            barraSuperior.barraMenu.botaoSistema.setBorder(selecionada);
            barraSuperior.barraMenu.botaoClientes.setEnabled(true);
            barraSuperior.barraMenu.botaoClientes.setBorder(disponivel);
        }
        
        //------------------Caso alguma opção do meio seja selecionada------------------
        if(e.getSource() == opcao1){
            //Checar qual opção foi selecionada
            if(barraSuperior.barraMenu.botaoSistema.getBorder() == selecionada){
                //Opção de visualizar dados da Loja
                janelaVisualizacao = new JanelaVisualizacao("Sistema - Dados da loja", SYS);
                //Informar como acessar mais funcionalidade da Loja
                JOptionPane.showMessageDialog(null,
                 "Para mais opções relacionadas à loja, selecione a aba Loja.",
                  "Informativo!", JOptionPane.INFORMATION_MESSAGE);
            }
            if(barraSuperior.barraMenu.botaoLoja.getBorder() == selecionada){
                //Opção de visualizar funcion�rios
                if(SYS.getLoja().getTelefone() == null){
                	janelaVisualizacao = new JanelaVisualizacao("Loja - Visualizar funcionários", SYS);
                } else {
                    //Mostrar que a loja já está com o cadastro completo
                    JOptionPane.showMessageDialog(null,
                     "Cadastro da loja já completo",
                      "Informativo!",
                       JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(barraSuperior.barraMenu.botaoClientes.getBorder() == selecionada){
                //Opção de visualizar clientes
                janelaVisualizacao = new JanelaVisualizacao("Clientes - Visualizar", SYS);
            }
        }
        if(e.getSource() == opcao2){
            //Checar qual opcao foi selecionada
            if(barraSuperior.barraMenu.botaoSistema.getBorder() == selecionada){
                int op = JOptionPane.showConfirmDialog(null,
                 "Opcao APENAS para clientes cadastrados.", "AVISO!", JOptionPane.OK_CANCEL_OPTION);
                //Caso a opção seja selecionada
                 if(op == 0){
                    //Buscar cliente
                    String cpf = JOptionPane.showInputDialog(
                        "Digite o CPF do comprador (Ex.: 0123.456.789-01): ");
                    Cliente comprador = SYS.BuscarCliente(cpf);
                    if(cpf == null){
                        //Apenas fechar o JOptionPane
                    } else if(comprador == null){
                        JOptionPane.showMessageDialog(null,
                         "Cliente não encontrado.", "Erro",
                          JOptionPane.ERROR_MESSAGE);
                    } else {
                        if(comprador.getCarrinho().size() != 0){
                            //Impressão da nota fiscal em tela
                            new JanelaNotaFiscal(SYS, comprador);
                        } else {
                            JOptionPane.showMessageDialog(null,
                             "Carrinho vazio.", "Atencao",
                              JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            if(barraSuperior.barraMenu.botaoLoja.getBorder() == selecionada){
                //Opção de Visualizar estoque
            	janelaVisualizacao = new JanelaVisualizacao("Loja - Visualizar estoque", SYS);
            }
            if(barraSuperior.barraMenu.botaoClientes.getBorder() == selecionada){
                //Opção de selecionar um carrinho de compras
                janelaVisualizacao = new JanelaVisualizacao("Clientes - Carrinhos de compras", SYS);
            }
        }
        if(e.getSource() == opcao3){
            //Checar qual opção foi selecionada
            // if(barraSuperior.barraMenu.botaoSistema.getBorder() == selecionada){
            //     janelaCadastro = new JanelaCadastro("Titulo", SYS);
            // }
            if(barraSuperior.barraMenu.botaoLoja.getBorder() == selecionada){
                //Opção de editar dados da loja
            	janelaEdicao = new JanelaEdicao("Loja - Editar dados", SYS, null);
            }
            // if(barraSuperior.barraMenu.botaoClientes.getBorder() == selecionada){
            //     janelaCadastro = new JanelaCadastro("Titulo", SYS);
            // }
        }
    }
}
