package toyStore.GUI;

import toyStore.srcCode.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Objeto JanelaPrincipal
 * 
 * Janela principal da GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */
public class JanelaPrincipal extends JFrame implements ActionListener{
	
	/**
	 * Parametros uteis para uma janela principal.
	 * */
    private BarraSuperior barraSuperior;
    private JanelaCadastro janelaCadastro;
    private JanelaVisualizacao janelaVisualizacao;
    private JanelaEdicao janelaEdicao;
    private Sistema SYS;
    private BotaoOpcao opcao1;
    private BotaoOpcao opcao2;
    private BotaoOpcao opcao3;
    private static Border selecionada = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    private static Border disponivel = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    
    /**
     * Construtor padrao de JanelaPrincipal
     * 
     * @param sistema Conexao com o srcCode feita por meio da classe sistema.
     * */
    public JanelaPrincipal(Sistema sistema){
        SYS = sistema;
        barraSuperior = new BarraSuperior();

        //---------------------------Botoes de opcao----------------------------------
        opcao1 = new BotaoOpcao("<html>Visualizar dados<br />da loja</html>");
        opcao2 = new BotaoOpcao("<html>Cadastrar<br />venda</html>");
        opcao3 = new BotaoOpcao("");
        opcao3.setVisible(false);
        barraSuperior.getBarraMenu().getBotaoSistema().setEnabled(false);
        barraSuperior.getBarraMenu().getBotaoSistema().setBorder(selecionada);

                        //---------------Action Listeners------------------
        barraSuperior.getBarraMenu().getBotaoSistema().addActionListener(this);
        barraSuperior.getBarraMenu().getBotaoLoja().addActionListener(this);
        barraSuperior.getBarraMenu().getBotaoClientes().addActionListener(this);
        opcao1.addActionListener(this);
        opcao2.addActionListener(this);
        opcao3.addActionListener(this);
        
        //---------------------------Parte inferior da janela-------------------------------------
        JPanel conteudo = new JPanel(); //Instancia o painel central que contem todas as opcoes
        conteudo.setLayout(new BorderLayout()); //Define o layout como BorderLayout

                            		//------Margens--------
        JPanel margemEsquerda = new JPanel(); //Instancia a margem Esquerda do painel
        margemEsquerda.setPreferredSize(new Dimension(70,100)); //Define as dimensoes das margens
        margemEsquerda.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemDireita = new JPanel(); //Instancia a margem Direita do painel
        margemDireita.setPreferredSize(new Dimension(70,100)); //Define as dimensoes das margens
        margemDireita.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemSuperior = new JPanel(); //Instancia a margem Superior do painel
        margemSuperior.setPreferredSize(new Dimension(100,70)); //Define as dimensoes das margens
        margemSuperior.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

        JPanel margemInferior = new JPanel(); //Instancia a margem Inferior do painel
        margemInferior.setPreferredSize(new Dimension(100,70)); //Define as dimensoes das margens
        margemInferior.setBackground(new Color(0x78c3fb)); //Define a cor de fundo

                        		//-------Conteudo Central---------
        JPanel central = new JPanel(); //Cria o painel central
        central.setBackground(new Color(0x78c3fb)); //Colore o fundo
        central.setLayout(new GridLayout(2,3,25,25)); //Define o Layout como GridLayout

        //--------Adiciona os botoes de opcao ao painel central--------
        central.add(opcao1); 
        central.add(opcao2);
        central.add(opcao3);

                //----------Adicao do conteudo a parte inferior----------
        conteudo.add(margemSuperior, BorderLayout.NORTH);
        conteudo.add(margemInferior, BorderLayout.SOUTH);
        conteudo.add(central, BorderLayout.CENTER);
        conteudo.add(margemEsquerda, BorderLayout.WEST);
        conteudo.add(margemDireita, BorderLayout.EAST);

        //--------------------------------Definicoes da janela--------------------------------------
        this.setTitle("Toy Store Brinquedos LTDA."); //Titulo da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar o programa ao fechar a janela
        this.setLayout(new BorderLayout()); //Faz a janela principal possuir um layout por bordas
        this.setSize(750,700); //Define o tamanho da janela
        this.getContentPane().setBackground(new Color(0xFFFFFF)); //Define a cor de fundo da janela
        this.add(barraSuperior, BorderLayout.NORTH); //Adiciona a barra superior ao norte da janela
        this.add(conteudo, BorderLayout.CENTER);
        this.setVisible(true); //Deixa a janela visivel
        this.setResizable(false); //Limita o tamanho da tela
    }
    
    
    /**
     * Realiza uma acao caso aconteca um ActionEvent
     * 
     * @see https://docs.oracle.com/en/java/javase/16/docs/api/java.desktop/java/awt/event/package-summary.html
     * */
    @Override
    public void actionPerformed(ActionEvent e) {

        //--------------------Caso se esteja na opcao loja------------------
        if(e.getSource() ==  barraSuperior.getBarraMenu().getBotaoLoja()){
            //-----------Realizar alteracoes no conteudo mostrado---------------
            opcao1.setText("<html>Visualizar<br />funcionarios</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Visualizar<br />estoque</html>");
            opcao2.setVisible(true);
            opcao3.setText("<html>Editar dados<br />da Loja</html>");
            opcao3.setVisible(true);
            barraSuperior.getBarraMenu().getBotaoLoja().setEnabled(false);
            barraSuperior.getBarraMenu().getBotaoLoja().setBorder(selecionada);
            barraSuperior.getBarraMenu().getBotaoSistema().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoSistema().setBorder(disponivel);
            barraSuperior.getBarraMenu().getBotaoClientes().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoClientes().setBorder(disponivel);
        }

        //--------------------Caso se esteja na opcao cliente------------------
        if(e.getSource() ==  barraSuperior.getBarraMenu().getBotaoClientes()){
            //-----------Realizar alteracoes no conteudo mostrado---------------
            opcao1.setText("<html>Visualizar<br />clientes</html>");
            opcao1.setVisible(true);
            opcao2.setText("<html>Carrinhos de<br />compras</html>");
            opcao2.setVisible(true);
            opcao3.setVisible(false);
            barraSuperior.getBarraMenu().getBotaoLoja().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoLoja().setBorder(disponivel);
            barraSuperior.getBarraMenu().getBotaoSistema().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoSistema().setBorder(disponivel);
            barraSuperior.getBarraMenu().getBotaoClientes().setEnabled(false);
            barraSuperior.getBarraMenu().getBotaoClientes().setBorder(selecionada);
        }

        //--------------------Caso se esteja na opcao Sistema------------------
        if(e.getSource() ==  barraSuperior.getBarraMenu().getBotaoSistema()){
            //-----------Realizar alteracoes no conteudo mostrado---------------
            opcao1.setText("<html>Visualizar dados<br />da loja</html>");
            opcao2.setText("<html>Cadastrar<br />venda</html>");
            opcao3.setVisible(false);
            barraSuperior.getBarraMenu().getBotaoLoja().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoLoja().setBorder(disponivel);
            barraSuperior.getBarraMenu().getBotaoSistema().setEnabled(false);
            barraSuperior.getBarraMenu().getBotaoSistema().setBorder(selecionada);
            barraSuperior.getBarraMenu().getBotaoClientes().setEnabled(true);
            barraSuperior.getBarraMenu().getBotaoClientes().setBorder(disponivel);
        }
        
        //------------------Caso alguma opcao do painel central seja selecionada------------------
        if(e.getSource() == opcao1){
            //Checar qual opcao foi selecionada
            if(barraSuperior.getBarraMenu().getBotaoSistema().getBorder() == selecionada){
                //Opcao de visualizar dados da Loja
                janelaVisualizacao = new JanelaVisualizacao("Sistema - Dados da loja", SYS);
                //Informar como acessar mais funcionalidade da Loja
                JOptionPane.showMessageDialog(null,
                 "Para mais opcoes relacionadas a  loja, selecione a aba: Loja.",
                  "Informativo!", JOptionPane.INFORMATION_MESSAGE);
            }
            if(barraSuperior.getBarraMenu().getBotaoLoja().getBorder() == selecionada){
                //Opcao de visualizar funcionários
                janelaVisualizacao = new JanelaVisualizacao("Loja - Visualizar funcionarios", SYS);

            }
            if(barraSuperior.getBarraMenu().getBotaoClientes().getBorder() == selecionada){
                //Opcao de visualizar clientes
                janelaVisualizacao = new JanelaVisualizacao("Clientes - Visualizar", SYS);
            }
        }
        if(e.getSource() == opcao2){
            //Checar qual opcao foi selecionada
            if(barraSuperior.getBarraMenu().getBotaoSistema().getBorder() == selecionada){
                int op = JOptionPane.showConfirmDialog(null,
                 "Opcao APENAS para clientes cadastrados.", "AVISO!", JOptionPane.OK_CANCEL_OPTION);
                //Caso a opcao seja selecionada
                 if(op == 0){
                    //Buscar cliente
                    String cpf = JOptionPane.showInputDialog(
                        "Digite o CPF do comprador (Ex.: 0123.456.789-01): ");
                    Cliente comprador = SYS.BuscarCliente(cpf);
                    if(cpf == null){
                        //Apenas fechar o JOptionPane
                    } else if(comprador == null){
                        JOptionPane.showMessageDialog(null,
                         "Cliente nao encontrado.", "Erro",
                          JOptionPane.ERROR_MESSAGE);
                    } else {
                        if(comprador.getCarrinho().size() != 0){
                            //Impressao da nota fiscal em tela
                            new JanelaNotaFiscal(SYS, comprador);
                        } else {
                            JOptionPane.showMessageDialog(null,
                             "Carrinho vazio.", "Atencao!",
                              JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            if(barraSuperior.getBarraMenu().getBotaoLoja().getBorder() == selecionada){
                //Opcao de Visualizar estoque
            	janelaVisualizacao = new JanelaVisualizacao("Loja - Visualizar estoque", SYS);
            }
            if(barraSuperior.getBarraMenu().getBotaoClientes().getBorder() == selecionada){
                //Opcao de selecionar um carrinho de compras
                janelaVisualizacao = new JanelaVisualizacao("Clientes - Carrinhos de compras", SYS);
            }
        }
        if(e.getSource() == opcao3){
            //Checar qual opcao foi selecionada
            // if(barraSuperior.barraMenu.botaoSistema.getBorder() == selecionada){
            //     janelaCadastro = new JanelaCadastro("Titulo", SYS);
            // }
            if(barraSuperior.getBarraMenu().getBotaoLoja().getBorder() == selecionada){
                //Opcao de editar dados da loja
            	janelaEdicao = new JanelaEdicao("Loja - Editar dados", SYS, null);
            }
            // if(barraSuperior.barraMenu.botaoClientes.getBorder() == selecionada){
            //     janelaCadastro = new JanelaCadastro("Titulo", SYS);
            // }
        }
    }

	public BarraSuperior getBarraSuperior() {
		return barraSuperior;
	}

	public void setBarraSuperior(BarraSuperior barraSuperior) {
		this.barraSuperior = barraSuperior;
	}

	public JanelaCadastro getJanelaCadastro() {
		return janelaCadastro;
	}

	public void setJanelaCadastro(JanelaCadastro janelaCadastro) {
		this.janelaCadastro = janelaCadastro;
	}

	public JanelaVisualizacao getJanelaVisualizacao() {
		return janelaVisualizacao;
	}

	public void setJanelaVisualizacao(JanelaVisualizacao janelaVisualizacao) {
		this.janelaVisualizacao = janelaVisualizacao;
	}

	public JanelaEdicao getJanelaEdicao() {
		return janelaEdicao;
	}

	public void setJanelaEdicao(JanelaEdicao janelaEdicao) {
		this.janelaEdicao = janelaEdicao;
	}

	public Sistema getSYS() {
		return SYS;
	}

	public void setSYS(Sistema sYS) {
		SYS = sYS;
	}

	public BotaoOpcao getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(BotaoOpcao opcao1) {
		this.opcao1 = opcao1;
	}

	public BotaoOpcao getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(BotaoOpcao opcao2) {
		this.opcao2 = opcao2;
	}

	public BotaoOpcao getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(BotaoOpcao opcao3) {
		this.opcao3 = opcao3;
	}

	public static Border getSelecionada() {
		return selecionada;
	}

	public static void setSelecionada(Border selecionada) {
		JanelaPrincipal.selecionada = selecionada;
	}

	public static Border getDisponivel() {
		return disponivel;
	}

	public static void setDisponivel(Border disponivel) {
		JanelaPrincipal.disponivel = disponivel;
	}
}
