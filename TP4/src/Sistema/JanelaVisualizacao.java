package Sistema;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;

public class JanelaVisualizacao extends JDialog{
    Sistema SYS;

    JanelaVisualizacao(String titulo, Sistema sistema){
        SYS = sistema;
        String[] colunasClientes = {"Nome", "CPF", "Endereço", "Telefone"};
        Object[][] dadosClientes = {{"Matheus", "053.721.701-07", "Asa Sul", "61 99576-7733"}
        ,{"Luana", "000.000.000-01", "", ""}
        ,{"Cleiton", "000.002.003-04", "Jacarepaguá", "28 98761-8531"}
        ,{"Baiano", "002.003.004-05", "", "61 3333-3123"}
        ,{"Japones", "003.004.005-06", "", ""}
        ,{"Japones", "003.004.005-06", "", ""}
        ,{"Japones", "003.004.005-06", "", ""}
        ,{"Japones", "003.004.005-06", "", ""}
        ,{"Japones", "003.004.005-06", "", ""}};

        if(titulo.equals("Sistema - Dados da loja")){
            JLabel dados = new JLabel();
            dados.setPreferredSize(new Dimension(300,300));
            dados.setFont(new Font("Arial", Font.PLAIN, 16));
            dados.setText(SYS.getLoja().Visualizar());
            this.add(dados);
        }

        if(titulo.equals("Clientes - Visualizar")){
            JTable tabela = new JTable(dadosClientes, colunasClientes);
            tabela.setPreferredScrollableViewportSize(new Dimension(450,95));
            tabela.setFillsViewportHeight(true);

            JScrollPane painelDados = new JScrollPane(tabela);
            this.add(painelDados);
        }

        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.setVisible(true);
    }
}
