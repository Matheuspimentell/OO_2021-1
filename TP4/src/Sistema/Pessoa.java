package Sistema;

import java.util.Scanner;

abstract class Pessoa {
    protected String nome, endereco, telefone;
    protected Scanner scan = new Scanner(System.in); //Declaração do scanner

    //Métodos CRUD para aplicação nas classes filhas
    abstract public void Editar(); 
    abstract public void Visualizar();
    //Para deletar o objeto, tem que ser na classe que vai controlar os dados do objeto

    //Setters
    abstract public void setNome(String nome);
    abstract public void setEndereco(String endereco);
    abstract public void setTelefone(String telefone);
    //Getters
    abstract public String getNome();
    abstract public String getEndereco();
    abstract public String getTelefone();
}
