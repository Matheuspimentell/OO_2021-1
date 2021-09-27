package Sistema;

import java.util.Scanner;

abstract class Pessoa {
    protected String nome, endereco, telefone;
    protected Scanner scan = new Scanner(System.in); //Declaraçao do scanner

    //Métodos CRUD para aplicação nas classes filhas
    abstract public void Editar(); 
    abstract public void Visualizar();
    //Para deletar o objeto, tem que ser na classe que vai controlar os dados do objeto

    //Setters
    abstract public void setNome(String n);
    abstract public void setEndereco(String e);
    abstract public void setTelefone(String t);
    //Getters
    abstract public String getNome();
    abstract public String getEndereco();
    abstract public String getTelefone();
}
