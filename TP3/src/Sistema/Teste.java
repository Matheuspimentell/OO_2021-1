package Sistema;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        Sistema sys = new Sistema();

        sys.setLoja();
        
        Funcionario novo = new Funcionario();
        novo.setNome("Cleiton");
        novo.setEndereco("Taguatinga");
        novo.setTelefone("61 999999999");
        novo.setMatricula(100);
        novo.setCargo("Porteiro");

        sys.getLoja().setFuncionario(novo); //Cadastra o cleiton

        Funcionario novoA = new Funcionario();
        novoA.setNome("Cleiton Jr");
        novoA.setEndereco("Taguatinga");
        novoA.setTelefone("61 999999999");
        novoA.setMatricula(101);
        novoA.setCargo("Assistente de RH");

        sys.getLoja().setFuncionario(novoA);

        Funcionario novoB = new Funcionario();
        novoB.setNome("Cleiton Neto");
        novoB.setEndereco("Taguatinga");
        novoB.setTelefone("61 999999999");
        novoB.setMatricula(102);
        novoB.setCargo("Vendedor");

        sys.getLoja().setFuncionario(novoB);

        sys.getLoja().DeletarFuncionario();

        sys.getLoja().getFuncionarios(); //Imprime denovo
    }
}