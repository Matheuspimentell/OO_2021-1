package toyStore;

import toyStore.srcCode.*;
import toyStore.GUI.*;

/**
 * Metodo principal (main) do projeto
 * 
 * Metodo que contém o sistema e a instância da janela principal (frame)
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