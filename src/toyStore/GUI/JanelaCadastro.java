package toyStore.GUI;

import toyStore.srcCode.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Objeto JanelaCadastro
 * 
 * Janela de cadastro de dados para a GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */
public class JanelaCadastro extends JDialog implements ActionListener{
	
	/**
	 * Parametros uteis para uma janela de cadastro.
	 * */
    private Sistema SYS;
    private JPanel conteudo;
    private JTextField campo1Texto;
    private JTextField campo2Texto;
    private JTextField campo3Texto;
    private JTextField campo4Texto;
    private JTextField campo5Texto;
    private JTextField campo6Texto;
    private JTextField campo7Texto;
    private JButton confirma;
    private JButton cancela;
    
    
    /**
     * Construtor padrao de JanelaCadastro
     *  
     * @param titulo Titulo da janela
     * @param sistema Conexao com o srcCode feita por meio da classe sistema.
     * */
    JanelaCadastro(String titulo, Sistema sistema){
        SYS = sistema;

        //----------------Bordas de formatacao----------------
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

        if(titulo.equals("Cliente - Novo Cadastro")){
            //----------------Instrucao------------------
            JOptionPane.showMessageDialog(null,
            "Para nao alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) - Dados obrigatorios");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(380, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do primeiro campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do segundo campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) CPF: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do terceiro campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("Endereco: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do quarto campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("Telefone: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            //----------Botoes-------------
            confirma = new JButton();
            confirma.setFocusable(false);
            confirma.setPreferredSize(new Dimension(170,35));
            confirma.setText("Cadastrar dados");
            confirma.addActionListener(this);

            cancela = new JButton();
            cancela.setFocusable(false);
            cancela.setPreferredSize(new Dimension(170,35));
            cancela.setText("Cancelar");
            cancela.addActionListener(this);

            //-----------------Adicao do conteudo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        if(titulo.equals("Brinquedo - Novo Cadastro")){
            //----------------Instrucao------------------
            JOptionPane.showMessageDialog(null,
            "Para nao alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) TODOS os dados sao obrigatorios!");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(370, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do primeiro campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do segundo campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) Marca: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do terceiro campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("(*) Categoria: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do quarto campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("(*) Preco unitario: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do quinto campo-------------
            JLabel campo5 = new JLabel();
            campo5.setText("(*) Idade Inidicada: ");
            campo5.setFont(new Font("Arial", Font.PLAIN, 12));
            campo5.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo5Texto = new JTextField();
            campo5Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do sexto campo-------------
            JLabel campo6 = new JLabel();
            campo6.setText("(*) Quantidade: ");
            campo6.setFont(new Font("Arial", Font.PLAIN, 12));
            campo6.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo6Texto = new JTextField();
            campo6Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do setimo campo-------------
            JLabel campo7 = new JLabel();
            campo7.setText("(*) ID: ");
            campo7.setFont(new Font("Arial", Font.PLAIN, 12));
            campo7.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo7Texto = new JTextField();
            campo7Texto.setPreferredSize(new Dimension(200,20));

            //----------Botoes-------------
            confirma = new JButton();
            confirma.setFocusable(false);
            confirma.setPreferredSize(new Dimension(170,35));
            confirma.setText("Cadastrar dados");
            confirma.addActionListener(this);

            cancela = new JButton();
            cancela.setFocusable(false);
            cancela.setPreferredSize(new Dimension(170,35));
            cancela.setText("Cancelar");
            cancela.addActionListener(this);

            //-----------------Adicao do conteudo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
            conteudo.add(campo6);
            conteudo.add(campo6Texto);
            conteudo.add(campo7);
            conteudo.add(campo7Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        if(titulo.equals("Funcionario - Novo Cadastro")){
            //----------------Instrucao------------------
            JOptionPane.showMessageDialog(null,
            "Para nao alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) - Dados obrigatorios");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(380, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do primeiro campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do segundo campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) ID: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do terceiro campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("(*) Cargo: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do quarto campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("Endereco: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do quinto campo-------------
            JLabel campo5 = new JLabel();
            campo5.setText("Telefone: ");
            campo5.setFont(new Font("Arial", Font.PLAIN, 12));
            campo5.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo5Texto = new JTextField();
            campo5Texto.setPreferredSize(new Dimension(200,20));

            //----------Botões-------------
            confirma = new JButton();
            confirma.setFocusable(false);
            confirma.setPreferredSize(new Dimension(170,35));
            confirma.setText("Cadastrar dados");
            confirma.addActionListener(this);

            cancela = new JButton();
            cancela.setFocusable(false);
            cancela.setPreferredSize(new Dimension(170,35));
            cancela.setText("Cancelar");
            cancela.addActionListener(this);

            //-----------------Adicao do conteudo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        //------------Configuracoes da tela------------
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
    
    /**
     * Realiza uma acao caso aconteca um ActionEvent
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        //-----------Caso seja selecionada a opcao de cancelar-----------
        if(e.getSource() == cancela){
            dispose();
        }
        //--------Caso seja selecionada a opcao de confirmar--------------
        if(e.getSource() == confirma){

            if(this.getTitle().equals("Cliente - Novo Cadastro")){
                String nome, cpf, endereco, telefone;

                nome = campo1Texto.getText();
                cpf = campo2Texto.getText();
                endereco = campo3Texto.getText();
                telefone = campo4Texto.getText();

                //--------------Verificacao dos dados recebidos-------------------
                if(campo1Texto.getText().equals("") || campo2Texto.getText().equals("")){
                    //--------Caso nome ou cpf nao tenham sido preenchidos------
                    JOptionPane.showMessageDialog(null,
                     "Atencao, um ou mais campos obrigatorios nao preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    if(campo3Texto.getText().equals("")){
                        endereco = null;
                    }
                    if(campo4Texto.getText().equals("")){
                        telefone = null;
                    }
                    Cliente cliente = new Cliente(nome, cpf);
                    SYS.addCliente(cliente, endereco, telefone);
                    JOptionPane.showMessageDialog(null,
                     "Cliente cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }

            if(this.getTitle().equals("Funcionario - Novo Cadastro")){
                String nome, cargo, endereco, telefone;
                int id;

                nome = campo1Texto.getText();
                if(campo2Texto.getText().equals("")){
                    id = -1;
                } else {
                    id = Integer.parseInt(campo2Texto.getText());
                }
                cargo = campo3Texto.getText();
                endereco = campo4Texto.getText();
                telefone = campo5Texto.getText();

                //--------------Verificacao dos dados recebidos-------------------
                if(campo1Texto.getText().equals("") || campo2Texto.getText().equals("") || campo3Texto.getText().equals("")){
                    
                    //--------Caso nome ou id ou cargo nao tenham sido preenchidos------
                    JOptionPane.showMessageDialog(null,
                     "Atencao, um ou mais campos obrigatorios nao preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);

                } else {

                    if(campo4Texto.getText().equals("")){
                        endereco = null;
                    }

                    if(campo5Texto.getText().equals("")){
                        telefone = null;
                    }

                    Funcionario funcionario = new Funcionario(nome, id, cargo);
                    SYS.getLoja().addFuncionario(funcionario, endereco, telefone);
                    JOptionPane.showMessageDialog(null,
                     "Funcionario cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);

                    dispose();
                }
            }

            if(this.getTitle().equals("Brinquedo - Novo Cadastro")){
                String nome, marca, categoria;
                double precoUnitario;
                int idadeIndicada, quantidade, id;

                //-------Controle de area de texto nao preenchida-------
                Boolean vazio1,vazio2,vazio3,vazio4,vazio5,vazio6,vazio7;
                vazio1 = true;
                vazio2 = true;
                vazio3 = true;
                vazio4 = true;
                vazio5 = true;
                vazio6 = true;
                vazio7 = true;

                //-------------Checagem de campos de texto-----------
                if(campo1Texto.getText().equals("")){
                    nome = null;
                } else {
                    nome = campo1Texto.getText();
                    vazio1 = false;
                }
                if(campo2Texto.getText().equals("")){
                    marca = null;
                } else {
                    marca = campo2Texto.getText();
                    vazio2 = false;
                }
                if(campo3Texto.getText().equals("")){
                    categoria = null;
                } else {
                    categoria = campo3Texto.getText();
                    vazio3 = false;
                }
                if(campo4Texto.getText().equals("")){
                    precoUnitario = -1.0;
                } else {
                    precoUnitario = Double.parseDouble(campo4Texto.getText());
                    vazio4 = false;
                }
                if(campo5Texto.getText().equals("")){
                    idadeIndicada = -1;
                } else {
                    idadeIndicada = Integer.parseInt(campo5Texto.getText());
                    vazio5 = false;
                }
                if(campo6Texto.getText().equals("")){
                    quantidade = -1;
                } else {
                    quantidade = Integer.parseInt(campo6Texto.getText());
                    vazio6 = false;
                }
                if(campo7Texto.getText().equals("")){
                    id = -1;
                } else {
                    id = Integer.parseInt(campo7Texto.getText());
                    vazio7 = false;
                }

                //----------------Caso ao menos um campo de texto esteja vazio------------
                if(vazio1 || vazio2 || vazio3 || vazio4 || vazio5 || vazio6 || vazio7){

                    //--------Caso ao menos 1 opcao nao tenha sido preenchida------
                    JOptionPane.showMessageDialog(null,
                     "Atencao, um ou mais campos obrigatorios nao preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);

                } else {

                    //-------------Definicao do brinquedo a ser adicionado-----------
                    Brinquedo brinquedo = new Brinquedo(nome,
                     marca,
                      categoria,
                       precoUnitario,
                        idadeIndicada,
                         quantidade, id);

                    //---------Adicionar o brinquedo ao estoque
                    SYS.getLoja().addBrinquedo(brinquedo);

                    //--------Mensagem de cadastro concluido----------
                    JOptionPane.showMessageDialog(null,
                     "Brinquedo cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    
                    dispose();
                }
            }
        }
    }

	public Sistema getSYS() {
		return SYS;
	}

	public void setSYS(Sistema sYS) {
		SYS = sYS;
	}

	public JPanel getConteudo() {
		return conteudo;
	}

	public void setConteudo(JPanel conteudo) {
		this.conteudo = conteudo;
	}

	public JTextField getCampo1Texto() {
		return campo1Texto;
	}

	public void setCampo1Texto(JTextField campo1Texto) {
		this.campo1Texto = campo1Texto;
	}

	public JTextField getCampo2Texto() {
		return campo2Texto;
	}

	public void setCampo2Texto(JTextField campo2Texto) {
		this.campo2Texto = campo2Texto;
	}

	public JTextField getCampo3Texto() {
		return campo3Texto;
	}

	public void setCampo3Texto(JTextField campo3Texto) {
		this.campo3Texto = campo3Texto;
	}

	public JTextField getCampo4Texto() {
		return campo4Texto;
	}

	public void setCampo4Texto(JTextField campo4Texto) {
		this.campo4Texto = campo4Texto;
	}

	public JTextField getCampo5Texto() {
		return campo5Texto;
	}

	public void setCampo5Texto(JTextField campo5Texto) {
		this.campo5Texto = campo5Texto;
	}

	public JTextField getCampo6Texto() {
		return campo6Texto;
	}

	public void setCampo6Texto(JTextField campo6Texto) {
		this.campo6Texto = campo6Texto;
	}

	public JTextField getCampo7Texto() {
		return campo7Texto;
	}

	public void setCampo7Texto(JTextField campo7Texto) {
		this.campo7Texto = campo7Texto;
	}

	public JButton getConfirma() {
		return confirma;
	}

	public void setConfirma(JButton confirma) {
		this.confirma = confirma;
	}

	public JButton getCancela() {
		return cancela;
	}

	public void setCancela(JButton cancela) {
		this.cancela = cancela;
	}
}
