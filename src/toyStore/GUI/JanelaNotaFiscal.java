package toyStore.GUI;

import toyStore.srcCode.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 * Objeto JanelaNotaFiscal
 * 
 * Janela de visualizacao de dados da nota fiscal apos uma venda, para a GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */
public class JanelaNotaFiscal extends JDialog implements ActionListener{
	
	/**
	 * Parametros uteis para uma janela de impressao de nota fiscal.
	 * */
    private JPanel conteudo;
    private JButton botao;
    private Sistema SYS;
    
    /**
     * Construtor padrao de JanelaNotaFiscal
     *  
     * @param sistema Conexao com o srcCode feita por meio da classe sistema.
     * @param cliente Cliente que esta efetuando a compra
     * */
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
        textoNotaFiscal.setPreferredSize(new Dimension(350, 615));
        textoNotaFiscal.setVisible(true);

        conteudo = new JPanel();
        conteudo.setLayout(new BorderLayout());
        conteudo.setBackground(new Color(0xffff9e));
        conteudo.setPreferredSize(new Dimension(350, 650));
        conteudo.add(textoNotaFiscal, BorderLayout.NORTH);
        conteudo.add(botao, BorderLayout.SOUTH);
        
        this.setModal(true);
        this.setSize(new Dimension(400, 700));
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(conteudo);
        this.setVisible(true);
        
        //Limpar carrinho
        for(int i = 0; i < comprador.getCarrinho().size(); i++) {
        	comprador.getCarrinho().remove(0);
        }
    }
    
    /**
     * Realiza uma acao caso aconteca um ActionEvent
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao){
            dispose();
        }
    }
    
	public JPanel getConteudo() {
		return conteudo;
	}
	public void setConteudo(JPanel conteudo) {
		this.conteudo = conteudo;
	}
	public JButton getBotao() {
		return botao;
	}
	public void setBotao(JButton botao) {
		this.botao = botao;
	}
	public Sistema getSYS() {
		return SYS;
	}
	public void setSYS(Sistema sYS) {
		SYS = sYS;
	}
}
