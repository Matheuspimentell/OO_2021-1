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

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Amaury");
        novoCliente.setEndereco("Asa Norte");
        novoCliente.setTelefone("61 99999 9999");
        novoCliente.setCpf("000.000.000-00");
        
        sys.setCliente(novoCliente); //Cadastra o Amaury

        Brinquedo novoBrinquedo = new Brinquedo();
        novoBrinquedo.setNome("teste");
        novoBrinquedo.setMarca("Mattel");
        novoBrinquedo.setCategoria("testando");
        novoBrinquedo.setPreco(29.99);
        novoBrinquedo.setIdade(10);
        novoBrinquedo.setQuantidade(35);
        novoBrinquedo.setCid(000);

        sys.getLoja().setBrinquedo(novoBrinquedo); //Cadastra o brinquedo teste

        sys.CadastrarVenda(novoCliente, novo); //Testa se foi realmente adicionado
    }
}