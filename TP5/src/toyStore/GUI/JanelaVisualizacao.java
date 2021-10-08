package toyStore.GUI;

import toyStore.srcCode.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaVisualizacao extends JDialog implements ActionListener{
    Sistema SYS;
    JList<String> listaClientes;
    DefaultTableModel modeloTabelaCLientes;
    DefaultTableModel modeloTabelaFuncionarios;
    DefaultTableModel modeloTabelaEstoque;
    DefaultTableModel modeloTabelaCarrinho;
    JTable tabelaClientes;
    JTable tabelaFuncionarios;
    JTable tabelaBrinquedos;
    JTable tabelaCarrinho;
    JScrollPane painelDados = new JScrollPane();
    JButton opcao1;
    JButton opcao2;
    JButton opcao3;
    JButton opcao4;
    Border disponivel = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    Border indisponivel = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

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

            //---------Botões com opções------------------
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

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasClientes = {"Nome", "CPF", "Endereço", "Telefone"};

            //----------------Define o modelo de tabela------------
            modeloTabelaCLientes = new DefaultTableModel(colunasClientes, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma célula editável
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

            //-------Definição da tabela--------
            tabelaClientes = new JTable(modeloTabelaCLientes);
            tabelaClientes.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaClientes.setFillsViewportHeight(true);

            //---------Adicionar na tabela uma barra de rolagem-------------
            painelDados = new JScrollPane(tabelaClientes);

            //-----------Adição da tabela à tela---------
            this.add(painelDados);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
            this.add(opcao4);
        }

        //----------Visualizar todos os funcionários cadastrados-----------
        if(titulo.equals("Loja - Visualizar funcionários")){

            //-----------Botões com opções----------------------
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
            
            //-------Modelo de barra superior de descrições-------------------
            String[] colunasFuncionarios = {"Nome", "Matrícula", "Cargo", "Endereço", "Telefone"};

            //----------------Define o modelo de tabela------------
            modeloTabelaFuncionarios = new DefaultTableModel(colunasFuncionarios, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma célula editável
                    return false;
                }
            };

            //-----------Adicionar todos os funcionários à tabela--------------
            for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                String nome = funcionario.getNome();
                int id = funcionario.getId();
                String cargo = funcionario.getCargo();
                String endereco = funcionario.getEndereco();
                String telefone = funcionario.getTelefone();
                Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                modeloTabelaFuncionarios.addRow(dadosFuncionario);
            }

            //-------Definição da tabela---------
            tabelaFuncionarios = new JTable(modeloTabelaFuncionarios);
            tabelaFuncionarios.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaFuncionarios.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem à tabela---------
            painelDados = new JScrollPane(tabelaFuncionarios);

            //----------Adiciona a tabela à tela----------
            this.add(painelDados);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
            this.add(opcao4);
        }

        //----------Visualizar todos os brinquedos cadastrados-----------
        if(titulo.equals("Loja - Visualizar estoque")){

            //-----------Botões com opções----------------------
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

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasEstoque = {"Nome", "Marca", "Categ.",
             "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            modeloTabelaEstoque = new DefaultTableModel(colunasEstoque, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                //Nenhuma célula editável
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

            //------Definição da tabela-------
            tabelaBrinquedos = new JTable(modeloTabelaEstoque);
            tabelaBrinquedos.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaBrinquedos.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem à tabela-----------
            painelDados = new JScrollPane(tabelaBrinquedos);
            
            //---------Adiciona a tabela à tela---------------
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

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasCarrinho = {"Nome", "Marca", "Categ.",
                        "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            modeloTabelaCarrinho = new DefaultTableModel(colunasCarrinho, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                    //Nenhuma célula editável
                    return false;
                }
            };

            //--------Linha fina----------------
            JLabel linha = new JLabel();
            linha.setOpaque(false);
            linha.setPreferredSize(new Dimension(800, 1));

            //-----------Texto de instrução----------
            JLabel instrucao = new JLabel();
            instrucao.setFont(new Font("Arial", Font.BOLD, 16));
            instrucao.setHorizontalAlignment(JLabel.CENTER);
            instrucao.setText("Selecione um cliente para visualizar seu carrinho de compras");
            instrucao.setPreferredSize(new Dimension(800, 30));
            instrucao.setVisible(true);

            //--------Definições da lista de CPF's----------------
            DefaultListModel<String> modeloLista = new DefaultListModel<>();
            for(Cliente cliente : SYS.getClientes()){
                String cpf = cliente.getCpf();
                modeloLista.addElement(cpf);
            }

            //-------------Adiciona uma barra de rolagem à lista de clientes--------
            JScrollPane painelClientes = new JScrollPane();
            listaClientes = new JList<String>(modeloLista);
            painelClientes.setViewportView(listaClientes);
            painelClientes.setPreferredSize(new Dimension(150,80));

            //--------------Selecão de clientes------------
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

                        //--------------------Adicionar todos os brinquedos no carrinho à tabela-----------
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

            //------------Definição da tabela de itens do carrinho---------------
            tabelaCarrinho = new JTable(modeloTabelaCarrinho);
            tabelaCarrinho.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaCarrinho.setFillsViewportHeight(true);

            //---------Adição da barra de rolagem à tabela de itens do carrinho--------------
            JScrollPane painelCarrinho = new JScrollPane(tabelaCarrinho);
            
            //-------------Adição na janela----------
            this.add(instrucao);
            this.add(painelClientes);
            this.add(linha);
            this.add(painelCarrinho);
            this.add(opcao1);
            this.add(opcao2);
            this.add(opcao3);
        }

        //-------Definições da janela principal----------
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(800,450));
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //--------------Para a opção de cadastrar novo------------
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
            //---------Caso esteja na janela de visualizar funcionários------------
            if(this.getTitle().equals("Loja - Visualizar funcionários")){

                //-----------Abrir a janela de cadastro-----------
                new JanelaCadastro("Funcionário - Novo Cadastro", SYS);

                int totalItens = modeloTabelaFuncionarios.getRowCount();
                //--------Zerar a lista anterior de itens na lista----------
                for (int i = 0; i < totalItens; i++){
                    modeloTabelaFuncionarios.removeRow(0);
                }

                //----------Atualizar a lista de funcionários----------
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
                    //Opção para adicionar um item ao carrinho de compras
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

                                    //--------------------Adicionar todos os brinquedos no carrinho à tabela-----------
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
        //------------Para a opção de deletar--------------------
        if(e.getSource() == opcao2){
            //---------Caso esteja na janela de visualizar clientes-----------
            if(this.getTitle().equals("Clientes - Visualizar")){
                if(tabelaClientes.getSelectedRow() != -1){
                    //Obter CPF fo cliente a ser excluído
                    Object dado = tabelaClientes.getModel().getValueAt(tabelaClientes.getSelectedRow(), 1);

                    boolean removeu = SYS.DeletarCliente((String) dado);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Cadastro do cliente excluído com sucesso.",
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
            //---------Caso esteja na janela de visualizar funcionários-------
            if(this.getTitle().equals("Loja - Visualizar funcionários")){
                if(tabelaFuncionarios.getSelectedRow() != -1){
                    //Obter o ID do funcionário a ser deletado
                    Object dado = tabelaFuncionarios.getModel().getValueAt(tabelaFuncionarios.getSelectedRow(), 1);
                    
                    boolean removeu = SYS.getLoja().DeletarFuncionario((int) dado);
                    
                    if(removeu) {
                    	JOptionPane.showMessageDialog(null,
                                "Cadastro do funcionário excluído com sucesso.",
                                "Informativo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    //Atualizar a lista de funcionários
                    int totalFuncionarios = modeloTabelaFuncionarios.getRowCount();
                    //--------Zerar a lista anterior de funcionários----------
                    for (int i = 0; i < totalFuncionarios; i++){
                        modeloTabelaFuncionarios.removeRow(0);
                    }
                    //-----------Adicionar todos os funcionários à tabela--------------
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
                     "Nenhum funcionário selecionado, selecione um funcionário para continuar.",
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
                                "Cadastro do brinquedo excluído com sucesso.",
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
                      "Atenção",
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

                    //--------------------Adicionar todos os brinquedos no carrinho à tabela-----------
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
        //------------Para a opção de editar-------------
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
                    //Instanciar a janela de edição
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
            //--------Caso esteja na janela de visualizar funcionários-------
            if(this.getTitle().equals("Loja - Visualizar funcionários")){
                //Caso nenhum item da lista tenha sido selecionado
                if(tabelaFuncionarios.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null,
                    "Nenhum funcionário selecionado, selecione um cliente para continuar",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                } else {
                    //Obter o ID do funcionário selecionado
                    Object dado_aProcurar = tabelaFuncionarios.getModel().getValueAt(tabelaFuncionarios.getSelectedRow(), 1);

                    //Instanciar a janela de edição
                    new JanelaEdicao("Funcionários - Editar dados", SYS, dado_aProcurar);

                    int totalFuncionarios = modeloTabelaFuncionarios.getRowCount();
                    //--------Zerar a lista anterior de funcionários----------
                    for (int i = 0; i < totalFuncionarios; i++){
                        modeloTabelaFuncionarios.removeRow(0);
                    }
                    
                    //-----------Adicionar todos os funcionários à tabela--------------
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
                      "Atenção",
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

                    //--------------------Adicionar todos os brinquedos no carrinho à tabela-----------
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
                      "Atencao", JOptionPane.WARNING_MESSAGE);
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
        	if(this.getTitle().equals("Loja - Visualizar funcionários")) {
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
}
