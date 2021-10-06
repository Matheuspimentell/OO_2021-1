package toyStore;

import toyStore.srcCode.*;
import toyStore.GUI.*;

public class Principal {
    public static void main(String[] args){
        Sistema SYS = new Sistema();
        new JanelaPrincipal(SYS); //Inicia a tela
    }
}