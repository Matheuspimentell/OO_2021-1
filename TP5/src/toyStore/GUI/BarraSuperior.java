package toyStore.GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

public class BarraSuperior extends JPanel{
    BarraMenu barraMenu;
    
    BarraSuperior(){
        barraMenu = new BarraMenu();
        ImageIcon logotipo = new ImageIcon("imgs/Logo.png"); //Componente com a logotipo escolhida
        JLabel areaIcone = new JLabel(); //Define uma nova label que contém o espaço com o logotipo
        areaIcone.setIcon(logotipo); //Adiciona o logotipo à area
        JLabel bordaMeio = new JLabel(); //Define uma borda para melhor posicionamento do logotipo
        bordaMeio.setPreferredSize(new Dimension(310,150)); //Definição do tamanho da borda
        this.setPreferredSize(new Dimension(100,150)); //Dimensões "Preferidas para a barra superior"
        this.setBackground(new Color(0x78c3fb)); //Cor da barra superior  (Que contém o logotipo)
        this.setLayout(new BorderLayout()); //Define o Layout como ser um BorderLayout
        this.add(areaIcone, BorderLayout.CENTER); //Adiciona a area do ícone à barra superior
        this.add(bordaMeio, BorderLayout.WEST); //Adiciona a borda à barra superior
        this.add(barraMenu, BorderLayout.SOUTH); //Adiciona a barra de menu à borda superior
    }
}
