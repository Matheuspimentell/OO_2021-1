package toyStore.GUI;

import toyStore.srcCode.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JanelaNotaFiscal extends JDialog implements ActionListener{
    JPanel conteudo;
    JButton botao;
    Sistema SYS;

    JanelaNotaFiscal(Sistema sistema, Cliente comprador){
        SYS = sistema;

        botao = new JButton();
        botao.setBorder(BorderFactory.createRaisedBevelBorder());
        botao.setText("Ok");
        botao.setFocusable(false);
        botao.setPreferredSize(new Dimension(170,35));
        botao.addActionListener(this);

        String itensCarrinho = "";
        Double totalVenda = 0.0;

        for(Brinquedo item : comprador.getCarrinho()){
            Double totalItem = (item.getQuantidade()*item.getPreco());
            itensCarrinho = itensCarrinho + item.getId() + " " +
             item.getNome() + " " + item.getQuantidade() + " * " + item.getPreco() +
              " (" + totalItem + ")<br/>";
            totalVenda = totalVenda + totalItem;
        }

        String notaFiscal = "<html>" +
         SYS.getLoja().getNome() + "<br/><br/>" +
         SYS.getLoja().getEndereco() + "<br/>" +
         "CNPJ: " + SYS.getLoja().getCnpj() + "<br/>" +
           "--------------------------------------------------------------------------------------------<br/>" +
           "Cupom fiscal eletronico<br/>" +
           "--------------------------------------------------------------------------------------------<br/>" +
           "CPF do consumidor: " + comprador.getCpf() + "<br/>" + 
           "--------------------------------------------------------------------------------------------<br/>" +
           "#|COD|DESC|QTD|VL UN R$|VL TI R$|<br/>" +
           "--------------------------------------------------------------------------------------------<br/>" +
           itensCarrinho +
           "--------------------------------------------------------------------------------------------<br/>" +
           "Valor total = " + totalVenda + "</html>";

        JLabel textoNotaFiscal = new JLabel(notaFiscal, SwingConstants.CENTER);
        textoNotaFiscal.setFont(new Font("Arial", Font.PLAIN, 12));
        textoNotaFiscal.setPreferredSize(new Dimension(400, 615));
        textoNotaFiscal.setVisible(true);

        conteudo = new JPanel();
        conteudo.setLayout(new BorderLayout());
        conteudo.setBackground(new Color(0xffff9e));
        conteudo.setPreferredSize(new Dimension(400, 650));
        conteudo.add(textoNotaFiscal, BorderLayout.NORTH);
        conteudo.add(botao, BorderLayout.SOUTH);
        
        this.setModal(true);
        this.setSize(new Dimension(400, 700));
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(conteudo);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao){
            dispose();
        }
    }
}
