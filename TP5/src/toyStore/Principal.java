package toyStore;

import toyStore.srcCode.*;
import toyStore.GUI.*;

/**
 * Metodo principal (main) do projeto
 * 
 * Metodo que cont�m o sistema e a inst�ncia da janela principal (frame)
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * @version 1.0
 * */

public class Principal {
	/**
	 * Metodo main
	 * */
    public static void main(String[] args){
        Sistema SYS = new Sistema();
        new JanelaPrincipal(SYS); //Inicia a tela
    }
}