package Sistema;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JanelaPrincipal extends JFrame{
    BarraSuperior barraSuperior;
    
    public JanelaPrincipal(){
        barraSuperior = new BarraSuperior(); //Instancia o componente da barra superior
        JPanel bordaEsquerda = new JPanel(); //Instancia a borda que vai definir as margens da janela
        bordaEsquerda.setPreferredSize(new Dimension(70,100)); //Define as dimensões da borda
        bordaEsquerda.setBackground(Color.RED); //Define uma cor para rápida identificação de erros
        bordaEsquerda.setOpaque(false); //Deixa a borda invisível
        JPanel bordaDireita = new JPanel(); //Instancia a borda que vai definir as margens da janela
        bordaDireita.setPreferredSize(new Dimension(70,100)); //Define as dimensões da borda
        bordaDireita.setBackground(Color.RED); //Define uma cor para rápida identificação de erros
        bordaDireita.setOpaque(false); //Deixa a borda invisível
        JPanel teste = new JPanel();
        teste.setBackground(new Color(0x78c3fb));
        this.setTitle("Toy Store Brinquedos LTDA."); //Título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar o programa ao fechar a janela
        this.setLayout(new BorderLayout()); //Faz a janela principal possuir um layout por bordas
        this.setSize(750,700); //Define o tamanho da janela
        this.getContentPane().setBackground(new Color(0xFFFFFF)); //Define a cor de fundo da janela
        this.add(barraSuperior, BorderLayout.NORTH); //Adiciona a barra superior ao norte da janela
        this.add(bordaEsquerda, BorderLayout.WEST); //Adiciona a borda esquerda ao oeste da janela
        this.add(bordaDireita, BorderLayout.EAST); //Adiciona a borda direita ao leste da janela
        this.add(teste, BorderLayout.CENTER);
        this.setVisible(true); //Deixa a janela visível
        this.setResizable(false); //Limita o tamanho da tela
    }
}
