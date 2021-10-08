package toyStore.GUI;

import toyStore.srcCode.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Objeto JanelaVisualizacao
 * 
 * Janela de visualizacao de dados da GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */

public class JanelaVisualizacao extends JDialog implements ActionListener{
	
	/**
	 * Parametros uteis para uma janela de visualizacao.
	 * */
    private Sistema SYS;
    private JList<String> listaClientes;
    private DefaultTableModel modeloTabelaCLientes;
    private DefaultTableModel modeloTabelaFuncionarios;
    private DefaultTableModel modeloTabelaEstoque;
    private DefaultTableModel modeloTabelaCarrinho;
    private JTable tabelaClientes;
    private JTable tabelaFuncionarios;
    private JTable tabelaBrinquedos;
    private JTable tabelaCarrinho;
    private JScrollPane painelDados = new JScrollPane();
    private JButton opcao1;
    private JButton opcao2;
    private JButton opcao3;
    private JButton opcao4;
    private static Border disponivel = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    private static Border indisponivel = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    
    /**
     * Construtor padrao de JanelaVisualizacao
     * 
     * @param titulo Titulo da janela de visualizacao
     * @param sistema Conexao com o srcCode feita por meio da classe sistema.
     * */
    JanelaVisualizacao(String titulo, Sistema sistema){
        SYS = sistema;
        
        //-------- Mostrar dados da loja--------------
        if(titulo.equals("Sistema - Dados da loja")){
            JLabel dados = new JLabel();
            dados.setPreferredSize(new Dimension(300,300));
            dados.setFont(new Font("Arial", Font.PLAIN, 16));
            dados.setText(SYS.getLoja().Visualizar());
            this.add(dados);
        }

        //------------Visualizar todos os clientes cadastrados---------
        if(titulo.equals("Clientes - Visualizar")){

            //---------Botoes com opcoes------------------
            opcao1 = new JButton();
            opcao1.setPreferredSize(new Dimension(150,40));
            opcao1.setBorder(disponivel);
            opcao1.setFocusable(false);
            opcao1.setText("<html>Cadastrar<br />novo cliente</html>");
            opcao1.setEnabled(true);
            opcao1.addActionListener(this);

            opcao2 = new JButton();
            opcao2.setPreferredSize(new Dimension(150,40));
            opcao2.setBorder(disponivel);
            opcao2.setFocusable(false);
            opcao2.setText("<html>Deletar<br />cliente</html>");
            opcao2.setEnabled(true);
            opcao2.addActionListener(this);

            opcao3 = new JButton();
            opcao3.setPreferredSize(new Dimension(150,40));
            opcao3.setBorder(disponivel);
            opcao3.setFocusable(false);
            opcao3.setText("<html>Editar<br />cadastro</html>");
            opcao3.setEnabled(true);
            opcao3.addActionListener(this);

            opcao4 = new JButton();
            opcao4.setPreferredSize(new Dimension(150,40));
            opcao4.setBorder(disponivel);
            opcao4.setFocusable(false);
            opcao4.setText("<html>Buscar<br />cadastro</html>");
            opcao4.setEnabled(true);
            opcao4.addActionListener(this);

            //-------Modelo de barra superior de descricoes-------------------
            String[] colunasClientes = {"Nome", "CPF", "Endereço", "Telefone"};

            //----------------Define o modelo de tabela------------
            modeloTabelaCLientes = new DefaultTableModel(colunasClientes, 0){
                //Torna todas as celulas nao editaveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma celula editavel
                    return false;
                }
            };

            //--------------------Adicionar todos os clientes na tabela-----------
            for(Cliente cliente : SYS.getClientes()){
                String nome = cliente.getNome();
                String cpf = cliente.getCpf();
                String endereco = cliente.getEndereco();
                String telefone = cliente.getTelefone();
                Object[] dadosCliente = {nome,cpf,endereco,telefone};
                modeloTabelaCLientes.addRow(dadosCliente);
            }

            //-------Definicao da tabela--------
            tabelaClientes = new JTable(modeloTabelaCLientes);
            tabelaClientes.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaClientes.setFillsViewportHeight(true);

            //---------Adicionar na tabela uma barra de rolagem-------------
            painelDados = new JScrollPane(tabelaClientes);

            //-----------Adicao da tabela na tela---------
            this.add(painelDados);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
            this.add(opcao4);
        }

        //----------Visualizar todos os funcionarios cadastrados-----------
        if(titulo.equals("Loja - Visualizar funcionarios")){

            //-----------Botoes com opcoes----------------------
            opcao1 = new JButton();
            opcao1.setPreferredSize(new Dimension(150,40));
            opcao1.setBorder(disponivel);
            opcao1.setFocusable(false);
            opcao1.setText("<html>Cadastrar<br />novo funcionario</html>");
            opcao1.setEnabled(true);
            opcao1.addActionListener(this);

            opcao2 = new JButton();
            opcao2.setPreferredSize(new Dimension(150,40));
            opcao2.setBorder(disponivel);
            opcao2.setFocusable(false);
            opcao2.setText("<html>Deletar<br />funcionario</html>");
            opcao2.setEnabled(true);
            opcao2.addActionListener(this);

            opcao3 = new JButton();
            opcao3.setPreferredSize(new Dimension(150,40));
            opcao3.setBorder(disponivel);
            opcao3.setFocusable(false);
            opcao3.setText("<html>Editar<br />cadastro</html>");
            opcao3.setEnabled(true);
            opcao3.addActionListener(this);

            opcao4 = new JButton();
            opcao4.setPreferredSize(new Dimension(150,40));
            opcao4.setBorder(disponivel);
            opcao4.setFocusable(false);
            opcao4.setText("<html>Buscar<br />cadastro</html>");
            opcao4.setEnabled(true);
            opcao4.addActionListener(this);
            
            //-------Modelo de barra superior de descricoes-------------------
            String[] colunasFuncionarios = {"Nome", "Matricula", "Cargo", "Endereco", "Telefone"};

            //----------------Define o modelo de tabela------------
            modeloTabelaFuncionarios = new DefaultTableModel(colunasFuncionarios, 0){
                //Torna todas as celulas nao editaveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma celula editavel
                    return false;
                }
            };

            //-----------Adicionar todos os funcionarios na�tabela--------------
            for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                String nome = funcionario.getNome();
                int id = funcionario.getId();
                String cargo = funcionario.getCargo();
                String endereco = funcionario.getEndereco();
                String telefone = funcionario.getTelefone();
                Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                modeloTabelaFuncionarios.addRow(dadosFuncionario);
            }

            //-------Definicao da tabela---------
            tabelaFuncionarios = new JTable(modeloTabelaFuncionarios);
            tabelaFuncionarios.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaFuncionarios.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem a tabela---------
            painelDados = new JScrollPane(tabelaFuncionarios);

            //----------Adiciona a tabela na tela----------
            this.add(painelDados);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
            this.add(opcao4);
        }

        //----------Visualizar todos os brinquedos cadastrados-----------
        if(titulo.equals("Loja - Visualizar estoque")){

            //-----------Botoes com opcoes----------------------
            opcao1 = new JButton();
            opcao1.setPreferredSize(new Dimension(150,40));
            opcao1.setBorder(disponivel);
            opcao1.setFocusable(false);
            opcao1.setText("<html>Cadastrar<br />novo brinquedo</html>");
            opcao1.setEnabled(true);
            opcao1.addActionListener(this);

            opcao2 = new JButton();
            opcao2.setPreferredSize(new Dimension(150,40));
            opcao2.setBorder(disponivel);
            opcao2.setFocusable(false);
            opcao2.setText("<html>Deletar<br />brinquedo</html>");
            opcao2.setEnabled(true);
            opcao2.addActionListener(this);

            opcao3 = new JButton();
            opcao3.setPreferredSize(new Dimension(150,40));
            opcao3.setBorder(disponivel);
            opcao3.setFocusable(false);
            opcao3.setText("<html>Editar<br />cadastro</html>");
            opcao3.setEnabled(true);
            opcao3.addActionListener(this);

            //-------Modelo de barra superior de descricoes-------------------
            String[] colunasEstoque = {"Nome", "Marca", "Categ.",
             "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            modeloTabelaEstoque = new DefaultTableModel(colunasEstoque, 0){
                //Torna todas as celulas nao editaveis
                @Override
                public boolean isCellEditable(int row, int column) {
                //Nenhuma celula editavel
                return false;
                }
            };

            //--------------------Adicionar todos os brinquedos na tabela-----------
            for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                String nome = brinquedo.getNome();
                String marca = brinquedo.getMarca();
                String categoria = brinquedo.getCategoria();
                Double preco = brinquedo.getPreco();
                int idadeIndicada = brinquedo.getIdade();
                int quantidade = brinquedo.getQuantidade();
                int id = brinquedo.getId();
                Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quantidade,id};
                modeloTabelaEstoque.addRow(dadosBrinquedo);
            }

            //------Definicao da tabela-------
            tabelaBrinquedos = new JTable(modeloTabelaEstoque);
            tabelaBrinquedos.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaBrinquedos.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem na tabela-----------
            painelDados = new JScrollPane(tabelaBrinquedos);
            
            //---------Adiciona a tabela na tela---------------
            this.add(painelDados);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
        }

        //----------Visualizar os carrinhos de compras do cliente selecionado-----------
        if(titulo.equals("Clientes - Carrinhos de compras")){

            opcao1 = new JButton();
            opcao1.setPreferredSize(new Dimension(150,40));
            opcao1.setBorder(disponivel);
            opcao1.setFocusable(false);
            opcao1.setText("<html>Adicionar item<br />ao carrinho</html>");
            opcao1.setEnabled(true);
            opcao1.addActionListener(this);

            opcao2 = new JButton();
            opcao2.setPreferredSize(new Dimension(150,40));
            opcao2.setBorder(disponivel);
            opcao2.setFocusable(false);
            opcao2.setText("<html>Retirar item<br />do carrinho</html>");
            opcao2.setEnabled(true);
            opcao2.addActionListener(this);

            opcao3 = new JButton();
            opcao3.setPreferredSize(new Dimension(150,40));
            opcao3.setBorder(disponivel);
            opcao3.setFocusable(false);
            opcao3.setText("<html>Editar quantidade<br />do item</html>");
            opcao3.setEnabled(true);
            opcao3.addActionListener(this);

            //-------Modelo de barra superior de descricoes-------------------
            String[] colunasCarrinho = {"Nome", "Marca", "Categ.",
                        "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            modeloTabelaCarrinho = new DefaultTableModel(colunasCarrinho, 0){
                //Torna todas as celulas não editaveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma celula editavel
                    return false;
                }
            };

            //--------Linha fina----------------
            JLabel linha = new JLabel();
            linha.setOpaque(false);
            linha.setPreferredSize(new Dimension(800, 1));

            //-----------Texto de instrucao----------
            JLabel instrucao = new JLabel();
            instrucao.setFont(new Font("Arial", Font.BOLD, 16));
            instrucao.setHorizontalAlignment(JLabel.CENTER);
            instrucao.setText("Selecione um cliente para visualizar seu carrinho de compras");
            instrucao.setPreferredSize(new Dimension(800, 30));
            instrucao.setVisible(true);

            //--------Definicoes da lista de CPF's----------------
            DefaultListModel<String> modeloLista = new DefaultListModel<>();
            for(Cliente cliente : SYS.getClientes()){
                String cpf = cliente.getCpf();
                modeloLista.addElement(cpf);
            }

            //-------------Adiciona uma barra de rolagem na lista de clientes--------
            JScrollPane painelClientes = new JScrollPane();
            listaClientes = new JList<String>(modeloLista);
            painelClientes.setViewportView(listaClientes);
            painelClientes.setPreferredSize(new Dimension(150,80));

            //--------------Selecao de clientes------------
            listaClientes.addListSelectionListener(new ListSelectionListener(){

                //----------Caso o cliente selecionado seja mudado---------
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if(!e.getValueIsAdjusting()){
                        int totalItens = modeloTabelaCarrinho.getRowCount();
                        //--------Zerar a lista anterior de itens no carrinho----------
                        for (int i = 0; i < totalItens; i++){
                            modeloTabelaCarrinho.removeRow(0);
                        }
                        String cpfCliente = listaClientes.getSelectedValue(); //Receber o CPF do cliente
                        Cliente cliente = SYS.BuscarCliente(cpfCliente); //Buscar cliente pelo CPF

                        //--------------------Adicionar todos os brinquedos no carrinho a tabela-----------
                        for(Brinquedo brinquedo : cliente.getCarrinho()){
                            String nome = brinquedo.getNome();
                            String marca = brinquedo.getMarca();
                            String categoria = brinquedo.getCategoria();
                            Double preco = brinquedo.getPreco();
                            int idadeIndicada = brinquedo.getIdade();
                            int quantidade = brinquedo.getQuantidade();
                            int id = brinquedo.getId();
                            Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quantidade,id};
                            modeloTabelaCarrinho.addRow(dadosBrinquedo);
                        }
                    }
                }
            });

            //------------Definicao da tabela de itens do carrinho---------------
            tabelaCarrinho = new JTable(modeloTabelaCarrinho);
            tabelaCarrinho.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaCarrinho.setFillsViewportHeight(true);

            //---------Adicao da barra de rolagem na tabela de itens do carrinho--------------
            JScrollPane painelCarrinho = new JScrollPane(tabelaCarrinho);
            
            //-------------Adicao na janela----------
            this.add(instrucao);
            this.add(painelClientes);
            this.add(linha);
            this.add(painelCarrinho);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
        }

        //-------Definicoes da janela principal----------
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(800,450));
        this.setResizable(false);
        this.setVisible(true);
    }
    
    
    /**
     * Realiza uma acao caso aconteca um ActionEvent
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        //--------------Para a opcao de cadastrar novo------------
        if(e.getSource() == opcao1){
            //---------Caso esteja na janela de visualizar clientes------------
            if(this.getTitle().equals("Clientes - Visualizar")){

                //-----------Abrir a janela de cadastro-----------
                new JanelaCadastro("Cliente - Novo Cadastro", SYS);

                int totalItens = modeloTabelaCLientes.getRowCount();
                //--------Zerar a lista anterior de itens na lista----------
                for (int i = 0; i < totalItens; i++){
                    modeloTabelaCLientes.removeRow(0);
                }

                //----------Atualizar a lista de clientes----------
                for(Cliente cliente : SYS.getClientes()){
                    String nome = cliente.getNome();
                    String cpf = cliente.getCpf();
                    String endereco = cliente.getEndereco();
                    String telefone = cliente.getTelefone();
                    Object[] dadosCliente = {nome,cpf,endereco,telefone};
                    modeloTabelaCLientes.addRow(dadosCliente);
                }
            }
            //---------Caso esteja na janela de visualizar funcionarios------------
            if(this.getTitle().equals("Loja - Visualizar funcionarios")){

                //-----------Abrir a janela de cadastro-----------
                new JanelaCadastro("Funcionario - Novo Cadastro", SYS);

                int totalItens = modeloTabelaFuncionarios.getRowCount();
                //--------Zerar a lista anterior de itens----------
                for (int i = 0; i < totalItens; i++){
                    modeloTabelaFuncionarios.removeRow(0);
                }

                //----------Atualizar a lista de funcionarios----------
                for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                    String nome = funcionario.getNome();
                    int id = funcionario.getId();
                    String cargo = funcionario.getCargo();
                    String endereco = funcionario.getEndereco();
                    String telefone = funcionario.getTelefone();
                    Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                    modeloTabelaFuncionarios.addRow(dadosFuncionario);
                }
            }
            //----------Caso esteja na janela de visualizar estoque-------------
            if(this.getTitle().equals("Loja - Visualizar estoque")){

                //-------Abrir a janela de cadastro----------
                new JanelaCadastro("Brinquedo - Novo Cadastro", SYS);

                int totalItens = modeloTabelaEstoque.getRowCount();
                //--------Zerar a lista anterior de itens no Estoque----------
                for (int i = 0; i < totalItens; i++){
                    modeloTabelaEstoque.removeRow(0);
                }

                //----------Atualizar a lista de brinquedos em estoque-----------
                for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                    String nome = brinquedo.getNome();
                    String marca = brinquedo.getMarca();
                    String categoria = brinquedo.getCategoria();
                    Double preco = brinquedo.getPreco();
                    int idadeIndicada = brinquedo.getIdade();
                    int quantidade = brinquedo.getQuantidade();
                    int id = brinquedo.getId();
                    Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quantidade,id};
                    modeloTabelaEstoque.addRow(dadosBrinquedo);
                }
            }
            //----------Caso esteja na janela de visualizar carrinhos de compras----------
            if(this.getTitle().equals("Clientes - Carrinhos de compras")){
                if(listaClientes.getSelectedValue() != null){
                    Cliente cliente = SYS.BuscarCliente(listaClientes.getSelectedValue());
                    //Opcao para adicionar um item ao carrinho de compras
                    String input = JOptionPane.showInputDialog("Digite o ID do brinquedo");
                    int buscarId;

                    if(input != null){
                        if(!input.equals("")){
                            buscarId = Integer.parseInt(input);
                            for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                                if(brinquedo.getId() == buscarId){
                                    String entrada = JOptionPane.showInputDialog("Informe a quantidade a ser adicionada");
                                    int quantidade = Integer.parseInt(entrada);
                                    if(quantidade > brinquedo.getQuantidade()){
                                        JOptionPane.showMessageDialog(null,
                                        "Quantidade invalida",
                                        "ERRO", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        Brinquedo adicionar;
                                        try {
                                            adicionar = brinquedo.clone();
                                            brinquedo.setQuantidade(brinquedo.getQuantidade() - quantidade);
                                            cliente.AdicionaItem(adicionar, quantidade);
                                        } catch (CloneNotSupportedException e1) {
                                            e1.printStackTrace();
                                        }
                                    }
                                    //-------Zerar tabela de itens----------------
                                    int totalItensCarrinho = modeloTabelaCarrinho.getRowCount();
                                    for(int i = 0; i < totalItensCarrinho; i++){
                                        modeloTabelaCarrinho.removeRow(0);
                                    }

                                    //--------------------Adicionar todos os brinquedos no carrinho na tabela-----------
                                    for(Brinquedo brinq : cliente.getCarrinho()){
                                        String nome = brinq.getNome();
                                        String marca = brinq.getMarca();
                                        String categoria = brinq.getCategoria();
                                        Double preco = brinq.getPreco();
                                        int idadeIndicada = brinq.getIdade();
                                        int qtd = brinq.getQuantidade();
                                        int id = brinq.getId();
                                        Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,qtd,id};
                                        modeloTabelaCarrinho.addRow(dadosBrinquedo);
                                    }

                                    break;
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum cliente selecionado.",
                      "Atencao",
                       JOptionPane.WARNING_MESSAGE);
                }
            } 
        }
        //------------Para a opcao de deletar--------------------
        if(e.getSource() == opcao2){
            //---------Caso esteja na janela de visualizar clientes-----------
            if(this.getTitle().equals("Clientes - Visualizar")){
                if(tabelaClientes.getSelectedRow() != -1){
                    //Obter CPF fo cliente a ser excluido
                    Object dado = tabelaClientes.getModel().getValueAt(tabelaClientes.getSelectedRow(), 1);

                    boolean removeu = SYS.DeletarCliente((String) dado);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Cadastro do cliente excluido com sucesso.",
                                "Informativo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    //Atualizar a lista
                    int totalClientes = modeloTabelaCLientes.getRowCount();
                    //--------Zerar a lista anterior de clientes----------
                    for (int i = 0; i < totalClientes; i++){
                        modeloTabelaCLientes.removeRow(0);
                    }
                    //--------------------Adicionar todos os clientes na tabela-----------
                    for(Cliente cliente : SYS.getClientes()){
                        String nome = cliente.getNome();
                        String cpf = cliente.getCpf();
                        String endereco = cliente.getEndereco();
                        String telefone = cliente.getTelefone();
                        Object[] dadosCliente = {nome,cpf,endereco,telefone};
                        modeloTabelaCLientes.addRow(dadosCliente);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum cliente selecionado, selecione um cliente para continuar.",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                }
            }
            //---------Caso esteja na janela de visualizar funcionarios-------
            if(this.getTitle().equals("Loja - Visualizar funcionarios")){
                if(tabelaFuncionarios.getSelectedRow() != -1){
                    //Obter o ID do funcionario a ser deletado
                    Object dado = tabelaFuncionarios.getModel().getValueAt(tabelaFuncionarios.getSelectedRow(), 1);
                    
                    boolean removeu = SYS.getLoja().DeletarFuncionario((int) dado);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Cadastro do funcionario excluido com sucesso.",
                                "Informativo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    //Atualizar a lista de funcionarios
                    int totalFuncionarios = modeloTabelaFuncionarios.getRowCount();
                    //--------Zerar a lista anterior de funcionarios----------
                    for (int i = 0; i < totalFuncionarios; i++){
                        modeloTabelaFuncionarios.removeRow(0);
                    }
                    //-----------Adicionar todos os funcionarios na tabela--------------
                    for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                        String nome = funcionario.getNome();
                        int id = funcionario.getId();
                        String cargo = funcionario.getCargo();
                        String endereco = funcionario.getEndereco();
                        String telefone = funcionario.getTelefone();
                        Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                        modeloTabelaFuncionarios.addRow(dadosFuncionario);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum funcionario selecionado, selecione um funcionario para continuar.",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                }
                
            }
            //---------Caso esteja na janela de visualizar estoque------------
            if(this.getTitle().equals("Loja - Visualizar estoque")){
                if(tabelaBrinquedos.getSelectedRow() != -1){
                    Object dado = tabelaBrinquedos.getModel().getValueAt(tabelaBrinquedos.getSelectedRow(), 6);
                    
                    boolean removeu = SYS.getLoja().DeletarBrinquedo((int) dado);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Cadastro do brinquedo excluido com sucesso.",
                                "Informativo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    //Atualizar a lista de brinquedos
                    int totalEstoque = modeloTabelaEstoque.getRowCount();
                    //--------Zerar a lista anterior de brinquedos----------
                    for (int i = 0; i < totalEstoque; i++){
                        modeloTabelaEstoque.removeRow(0);
                    }
                    //--------------------Adicionar todos os brinquedos na tabela-----------
                    for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                        String nome = brinquedo.getNome();
                        String marca = brinquedo.getMarca();
                        String categoria = brinquedo.getCategoria();
                        Double preco = brinquedo.getPreco();
                        int idadeIndicada = brinquedo.getIdade();
                        int quantidade = brinquedo.getQuantidade();
                        int id = brinquedo.getId();
                        Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quantidade,id};
                        modeloTabelaEstoque.addRow(dadosBrinquedo);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum brinquedo selecionado, para continuar selecione algum brinquedo.",
                      "Atencao!",
                       JOptionPane.WARNING_MESSAGE);
                }
            }
            //---------Caso esteja na janela de visualizar carrinho-----------
            if(this.getTitle().equals("Clientes - Carrinhos de compras")){
                if(tabelaCarrinho.getSelectedRow() != -1){
                    Cliente cliente = SYS.BuscarCliente(listaClientes.getSelectedValue());

                    Object idTabela = tabelaCarrinho.getModel().getValueAt(tabelaCarrinho.getSelectedRow(), 6);
                    int idExcluir = (int) idTabela;

                    Brinquedo noEstoque = SYS.getLoja().BuscarBrinquedo(idExcluir);
                    
                    Brinquedo noCarrinho = cliente.BuscaItem(idExcluir);
                    noEstoque.setQuantidade(noEstoque.getQuantidade() + noCarrinho.getQuantidade());
                    boolean removeu = cliente.removeItem(idExcluir);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Item removido com sucesso.",
                                 "Informativo",
                                  JOptionPane.INFORMATION_MESSAGE);
                    }

                    //-------Zerar tabela de itens----------------
                    int totalItensCarrinho = modeloTabelaCarrinho.getRowCount();
                    for(int i = 0; i < totalItensCarrinho; i++){
                        modeloTabelaCarrinho.removeRow(0);
                    }

                    //--------------------Adicionar todos os brinquedos do carrinho na tabela-----------
                    for(Brinquedo brinquedo : cliente.getCarrinho()){
                        String nome = brinquedo.getNome();
                        String marca = brinquedo.getMarca();
                        String categoria = brinquedo.getCategoria();
                        Double preco = brinquedo.getPreco();
                        int idadeIndicada = brinquedo.getIdade();
                        int quant = brinquedo.getQuantidade();
                        int id = brinquedo.getId();
                        Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quant,id};
                        modeloTabelaCarrinho.addRow(dadosBrinquedo);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum brinquedo selecionado, selecione um brinquedo para continuar",
                      "Atencao",
                       JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        //------------Para a opcao de editar-------------
        if(e.getSource() == opcao3){
            //---------------Caso esteja na janela de visualizar clientes------------
            if(this.getTitle().equals("Clientes - Visualizar")){
                //Caso nenhum item da lista tenha sido selecionado
                if(tabelaClientes.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null,
                    "Nenhum cliente selecionado, selecione um cliente para continuar",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                } else {
                    //Obter o CPF do cliente selecionado
                    Object dado_aProcurar = tabelaClientes.getModel().getValueAt(tabelaClientes.getSelectedRow(), 1);
                    //Instanciar a janela de edicao
                    new JanelaEdicao("Clientes - Editar dados", SYS, dado_aProcurar);

                    int totalClientes = modeloTabelaCLientes.getRowCount();
                    //--------Zerar a lista anterior de clientes----------
                    for (int i = 0; i < totalClientes; i++){
                        modeloTabelaCLientes.removeRow(0);
                    }
                    
                    //--------------------Adicionar todos os clientes na tabela-----------
                    for(Cliente cliente : SYS.getClientes()){
                        String nome = cliente.getNome();
                        String cpf = cliente.getCpf();
                        String endereco = cliente.getEndereco();
                        String telefone = cliente.getTelefone();
                        Object[] dadosCliente = {nome,cpf,endereco,telefone};
                        modeloTabelaCLientes.addRow(dadosCliente);
                    }
                }
            }
            //--------Caso esteja na janela de visualizar funcionarios-------
            if(this.getTitle().equals("Loja - Visualizar funcionarios")){
                //Caso nenhum item da lista tenha sido selecionado
                if(tabelaFuncionarios.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null,
                    "Nenhum funcionario selecionado, selecione um funcionario para continuar",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                } else {
                    //Obter o ID do funcionario selecionado
                    Object dado_aProcurar = tabelaFuncionarios.getModel().getValueAt(tabelaFuncionarios.getSelectedRow(), 1);

                    //Instanciar a janela de edicao
                    new JanelaEdicao("Funcionarios - Editar dados", SYS, dado_aProcurar);

                    int totalFuncionarios = modeloTabelaFuncionarios.getRowCount();
                    //--------Zerar a lista anterior de funcionarios----------
                    for (int i = 0; i < totalFuncionarios; i++){
                        modeloTabelaFuncionarios.removeRow(0);
                    }
                    
                    //-----------Adicionar todos os funcionarios na tabela--------------
                    for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                        String nome = funcionario.getNome();
                        int id = funcionario.getId();
                        String cargo = funcionario.getCargo();
                        String endereco = funcionario.getEndereco();
                        String telefone = funcionario.getTelefone();
                        Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                        modeloTabelaFuncionarios.addRow(dadosFuncionario);
                    }
                }
            }
            //---------Caso esteja na janela de visualizar estoque--------------
            if(this.getTitle().equals("Loja - Visualizar estoque")){
                //Caso nenhum item da lista tenha sido selecionado
                if(tabelaBrinquedos.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null,
                     "Nenhum brinquedo do estoque selecionado, selecione um brinquedo para continuar.",
                      "Atencao!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    Object dado_aProcurar = tabelaBrinquedos.getModel().getValueAt(tabelaBrinquedos.getSelectedRow(), 6);

                    new JanelaEdicao("Brinquedo - Editar dados", SYS, dado_aProcurar);

                    int totalEstoque = modeloTabelaEstoque.getRowCount();
                    //--------Zerar a lista anterior de brinquedos----------
                    for (int i = 0; i < totalEstoque; i++){
                        modeloTabelaEstoque.removeRow(0);
                    }

                    //--------------------Adicionar todos os brinquedos na tabela-----------
                    for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                        String nome = brinquedo.getNome();
                        String marca = brinquedo.getMarca();
                        String categoria = brinquedo.getCategoria();
                        Double preco = brinquedo.getPreco();
                        int idadeIndicada = brinquedo.getIdade();
                        int quantidade = brinquedo.getQuantidade();
                        int id = brinquedo.getId();
                        Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quantidade,id};
                        modeloTabelaEstoque.addRow(dadosBrinquedo);
                    }
                }
            }
            //-----------Caso esteja na janela de visualizar carrinhos de compras--------------
            if(this.getTitle().equals("Clientes - Carrinhos de compras")){
                if(tabelaCarrinho.getSelectedRow() != -1){
                    //Obter o ID do item a ser editado
                    Object dado = tabelaCarrinho.getModel().getValueAt(tabelaCarrinho.getSelectedRow(), 6);
                    int idEditar = (int) dado;
                    String cpfCliente = listaClientes.getSelectedValue();
                    Cliente cliente = SYS.BuscarCliente(cpfCliente);

                    String entrada = JOptionPane.showInputDialog("Informe a nova quantidade do item:");
                    int qtd = 0;

                    Brinquedo editar = null;


                    for(Brinquedo brinquedo : cliente.getCarrinho()){
                        if(brinquedo.getId() == idEditar){
                            editar = brinquedo;
                            qtd = Integer.parseInt(entrada) - brinquedo.getQuantidade();
                            editar.setQuantidade(editar.getQuantidade() + qtd);
                            qtd = qtd*(-1);
                            System.out.println(qtd);
                            break;
                        }
                    }

                    for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                        if(brinquedo.getId() == editar.getId()){
                            brinquedo.setQuantidade(brinquedo.getQuantidade() + qtd);
                        }
                    }

                    //-------Zerar tabela de itens----------------
                    int totalItensCarrinho = modeloTabelaCarrinho.getRowCount();
                    for(int i = 0; i < totalItensCarrinho; i++){
                        modeloTabelaCarrinho.removeRow(0);
                    }

                    //--------------------Adicionar todos os brinquedos no carrinho na tabela-----------
                    for(Brinquedo brinq : cliente.getCarrinho()){
                        String nome = brinq.getNome();
                        String marca = brinq.getMarca();
                        String categoria = brinq.getCategoria();
                        Double preco = brinq.getPreco();
                        int idadeIndicada = brinq.getIdade();
                        int quant = brinq.getQuantidade();
                        int id = brinq.getId();
                        Object[] dadosBrinquedo = {nome,marca,categoria,preco,idadeIndicada,quant,id};
                        modeloTabelaCarrinho.addRow(dadosBrinquedo);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                     "Nenhum brinquedo do carrinho selecionado, selecione um brinquedo para continuar",
                      "Atencao!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if(e.getSource() == opcao4) {
        	if(this.getTitle().equals("Clientes - Visualizar")) {
        		String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente que deseja buscar Ex.:(012.345.678-90):");
        		
        		Cliente cliente = SYS.BuscarCliente(cpf);
        		
        		if(cliente != null) {
        			JLabel dados = new JLabel();
            		dados.setText(cliente.Visualizar());
            		JDialog janelaVisualizar = new JDialog();
            		janelaVisualizar.setLayout(new FlowLayout(FlowLayout.CENTER));
            		janelaVisualizar.setModal(true);
            		janelaVisualizar.setSize(new Dimension(400,400));
            		janelaVisualizar.setTitle("Dados do cliente");
            		janelaVisualizar.add(dados);
            		janelaVisualizar.setResizable(false);
            		janelaVisualizar.setVisible(true);
        		} else {
        			JOptionPane.showMessageDialog(null,
        					"Cliente nao encontrado!",
        					"Aviso!",
        					JOptionPane.WARNING_MESSAGE);
        		}
        	}
        	if(this.getTitle().equals("Loja - Visualizar funcionarios")) {
        		String id = JOptionPane.showInputDialog("Digite o ID do funcionario que deseja buscar Ex.:(12345):");
        		
        		Funcionario funcionario = SYS.getLoja().BuscarFuncionario(id);
        		
        		if(funcionario != null) {
        			JLabel dados = new JLabel();
            		dados.setText(funcionario.Visualizar());
            		JDialog janelaVisualizar = new JDialog();
            		janelaVisualizar.setLayout(new FlowLayout(FlowLayout.CENTER));
            		janelaVisualizar.setModal(true);
            		janelaVisualizar.setSize(new Dimension(400,400));
            		janelaVisualizar.setTitle("Dados do funcionario");
            		janelaVisualizar.add(dados);
            		janelaVisualizar.setResizable(false);
            		janelaVisualizar.setVisible(true);
        		} else {
        			JOptionPane.showMessageDialog(null,
        					"Funcionario nao encontrado!",
        					"Aviso!",
        					JOptionPane.WARNING_MESSAGE);
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

	public JList<String> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(JList<String> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public DefaultTableModel getModeloTabelaCLientes() {
		return modeloTabelaCLientes;
	}

	public void setModeloTabelaCLientes(DefaultTableModel modeloTabelaCLientes) {
		this.modeloTabelaCLientes = modeloTabelaCLientes;
	}

	public DefaultTableModel getModeloTabelaFuncionarios() {
		return modeloTabelaFuncionarios;
	}

	public void setModeloTabelaFuncionarios(DefaultTableModel modeloTabelaFuncionarios) {
		this.modeloTabelaFuncionarios = modeloTabelaFuncionarios;
	}

	public DefaultTableModel getModeloTabelaEstoque() {
		return modeloTabelaEstoque;
	}

	public void setModeloTabelaEstoque(DefaultTableModel modeloTabelaEstoque) {
		this.modeloTabelaEstoque = modeloTabelaEstoque;
	}

	public DefaultTableModel getModeloTabelaCarrinho() {
		return modeloTabelaCarrinho;
	}

	public void setModeloTabelaCarrinho(DefaultTableModel modeloTabelaCarrinho) {
		this.modeloTabelaCarrinho = modeloTabelaCarrinho;
	}

	public JTable getTabelaClientes() {
		return tabelaClientes;
	}

	public void setTabelaClientes(JTable tabelaClientes) {
		this.tabelaClientes = tabelaClientes;
	}

	public JTable getTabelaFuncionarios() {
		return tabelaFuncionarios;
	}

	public void setTabelaFuncionarios(JTable tabelaFuncionarios) {
		this.tabelaFuncionarios = tabelaFuncionarios;
	}

	public JTable getTabelaBrinquedos() {
		return tabelaBrinquedos;
	}

	public void setTabelaBrinquedos(JTable tabelaBrinquedos) {
		this.tabelaBrinquedos = tabelaBrinquedos;
	}

	public JTable getTabelaCarrinho() {
		return tabelaCarrinho;
	}

	public void setTabelaCarrinho(JTable tabelaCarrinho) {
		this.tabelaCarrinho = tabelaCarrinho;
	}

	public JScrollPane getPainelDados() {
		return painelDados;
	}

	public void setPainelDados(JScrollPane painelDados) {
		this.painelDados = painelDados;
	}

	public JButton getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(JButton opcao1) {
		this.opcao1 = opcao1;
	}

	public JButton getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(JButton opcao2) {
		this.opcao2 = opcao2;
	}

	public JButton getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(JButton opcao3) {
		this.opcao3 = opcao3;
	}

	public JButton getOpcao4() {
		return opcao4;
	}

	public void setOpcao4(JButton opcao4) {
		this.opcao4 = opcao4;
	}

	public static Border getDisponivel() {
		return disponivel;
	}

	public static void setDisponivel(Border disponivel) {
		JanelaVisualizacao.disponivel = disponivel;
	}

	public static Border getIndisponivel() {
		return indisponivel;
	}

	public static void setIndisponivel(Border indisponivel) {
		JanelaVisualizacao.indisponivel = indisponivel;
	}
}
