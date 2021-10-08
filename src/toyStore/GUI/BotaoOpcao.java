package toyStore.GUI;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Font;

/**
 * Objeto BotaoOpcao
 * 
 * botao padrao para a GUI do sistema de loja de brinquedos.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */

public class BotaoOpcao extends JButton{
	
	/**
     * Construtor padrao de BotaoOpcao
     *  
     * @param text texto do botao
     * */
    BotaoOpcao(String texto){
        this.setText(texto);
        this.setFont(new Font("Arial", Font.BOLD, 18));
        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        if(texto != ""){
            this.setVisible(true);
        } else {
            this.setVisible(false);
        }
    }
}
