package Sistema;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;

public class JanelaVisualizacao extends JDialog{
    Sistema SYS;

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

        //------------Visualizar todos os funcionários cadastrados---------
        if(titulo.equals("Clientes - Visualizar")){
            String[] colunasClientes = {"Nome", "CPF", "Endereço", "Telefone"};
            DefaultTableModel modeloTabelaCLientes = new DefaultTableModel(colunasClientes, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
                }
            };
            for(Cliente cliente : SYS.getClientes()){
                String nome = cliente.getNome();
                String cpf = cliente.getCpf();
                String endereco = cliente.getEndereco();
                String telefone = cliente.getTelefone();
                Object[] dadosCliente = {nome,cpf,endereco,telefone};
                modeloTabelaCLientes.addRow(dadosCliente);
            }
            JTable tabela = new JTable(modeloTabelaCLientes);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);
            JScrollPane painelDados = new JScrollPane(tabela);
            this.add(painelDados);
        }

        //----------Visualizar todos os funcionários cadastrados-----------
        if(titulo.equals("Loja - Visualizar funcioários")){
            String[] colunasFuncionarios = {"Nome", "Matrícula", "Cargo", "Endereço", "Telefone"};
            DefaultTableModel modeloTabelaFuncionarios = new DefaultTableModel(colunasFuncionarios, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
                }
            };
            for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                String nome = funcionario.getNome();
                int id = funcionario.getId();
                String cargo = funcionario.getCargo();
                String endereco = funcionario.getEndereco();
                String telefone = funcionario.getTelefone();
                Object[] dadosFuncionario = {nome,id,cargo,endereco,telefone};
                modeloTabelaFuncionarios.addRow(dadosFuncionario);
            }
            JTable tabela = new JTable(modeloTabelaFuncionarios);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);
            JScrollPane painelDados = new JScrollPane(tabela);
            this.add(painelDados);
        }

        //----------Visualizar todos os brinquedos cadastrados-----------
        if(titulo.equals("Loja - Visualizar estoque")){
            String[] colunasEstoque = {"Nome", "Marca", "Categ.",
             "R$/Un.", "Idade indicada", "#QTD", "ID"};
            DefaultTableModel modeloTabelaEstoque = new DefaultTableModel(colunasEstoque, 0){
                //Torna todas as células não editáveis
                @Override
                public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
                }
            };
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
            JTable tabela = new JTable(modeloTabelaEstoque);
            tabela.setPreferredScrollableViewportSize(new Dimension(750,150));
            tabela.setFillsViewportHeight(true);
            JScrollPane painelDados = new JScrollPane(tabela);
            this.add(painelDados);
        }

        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(800,450));
        this.setResizable(false);
        this.setVisible(true);
    }
}
