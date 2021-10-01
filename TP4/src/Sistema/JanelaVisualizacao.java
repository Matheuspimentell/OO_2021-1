package Sistema;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;

public class JanelaVisualizacao extends JDialog{
    Sistema SYS;
    JList<String> listaClientes;
    JScrollPane painelDados = new JScrollPane();

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

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasClientes = {"Nome", "CPF", "Endereço", "Telefone"};

            //----------------Define o modelo de tabela------------
            DefaultTableModel modeloTabelaCLientes = new DefaultTableModel(colunasClientes, 0){
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
            JTable tabela = new JTable(modeloTabelaCLientes);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);

            //---------Adicionar na tabela uma barra de rolagem-------------
            JScrollPane painelDados = new JScrollPane(tabela);

            //-----------Adição da tabela à tela---------
            this.add(painelDados);
        }

        //----------Visualizar todos os funcionários cadastrados-----------
        if(titulo.equals("Loja - Visualizar funcioários")){

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasFuncionarios = {"Nome", "Matrícula", "Cargo", "Endereço", "Telefone"};

            //----------------Define o modelo de tabela------------
            DefaultTableModel modeloTabelaFuncionarios = new DefaultTableModel(colunasFuncionarios, 0){
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
            JTable tabela = new JTable(modeloTabelaFuncionarios);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem à tabela---------
            JScrollPane painelDados = new JScrollPane(tabela);

            //----------Adiciona a tabela à tela----------
            this.add(painelDados);
        }

        //----------Visualizar todos os brinquedos cadastrados-----------
        if(titulo.equals("Loja - Visualizar estoque")){

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasEstoque = {"Nome", "Marca", "Categ.",
             "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            DefaultTableModel modeloTabelaEstoque = new DefaultTableModel(colunasEstoque, 0){
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
            JTable tabela = new JTable(modeloTabelaEstoque);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);

            //-----------Adiciona uma barra de rolagem à tabela-----------
            JScrollPane painelDados = new JScrollPane(tabela);
            
            //---------Adiciona a tabela à tela---------------
            this.add(painelDados);
        }

        //----------Visualizar os carrinhos de compras do cliente selecionado-----------
        if(titulo.equals("Clientes - Carrinhos de compras")){

            //-------Modelo de barra superior de descrições-------------------
            String[] colunasCarrinho = {"Nome", "Marca", "Categ.",
                        "R$/Un.", "Idade indicada", "#QTD", "ID"};

            //----------------Define o modelo de tabela------------
            DefaultTableModel modeloTabelaCarrinho = new DefaultTableModel(colunasCarrinho, 0){
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

                        //--------Zerar a lista anterior de itens no carrinho----------
                        for (int i = 0; i < modeloTabelaCarrinho.getRowCount(); i++){
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
            JTable tabelaCarrinho = new JTable(modeloTabelaCarrinho);
            tabelaCarrinho.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabelaCarrinho.setFillsViewportHeight(true);

            //---------Adição da barra de rolagem à tabela de itens do carrinho--------------
            JScrollPane painelCarrinho = new JScrollPane(tabelaCarrinho);
            
            //-------------Adição na janela----------
            this.add(instrucao);
            this.add(painelClientes);
            this.add(linha);
            this.add(painelCarrinho);
        }

        //-------Definições da janela principal----------
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(800,450));
        this.setResizable(false);
        this.setVisible(true);
    }
}
