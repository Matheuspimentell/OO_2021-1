package Sistema;

import java.util.Scanner;

abstract class Pessoa {
    protected String nome, endereco, telefone;
    protected Scanner scan = new Scanner(System.in);
    //Métodos CRUD para aplicação nas classes filhas
    abstract public void Cadastrar();
    abstract public void Editar();
    abstract public void Visualizar();
}
