package toyStore.srcCode;

import toyStore.GUI.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList de clientes
    private Loja loja = new Loja("Toy Store", "Taguatinga", "87.499.017/0001-13"); //Declaração da loja
    
    //Construtor de sistema
    public Sistema(){

        //-----------Adicao de 10 clientes--------
        Cliente cliente1 = new Cliente("Cleiton Silva", "649.094.970-99");
        this.clientes.add(cliente1);
        Cliente cliente2 = new Cliente("Cleiton Rocha", "004.941.170-52");
        this.clientes.add(cliente2);
        Cliente cliente3 = new Cliente("Cleiton Costa", "377.415.620-45");
        this.clientes.add(cliente3);
        Cliente cliente4 = new Cliente("Cleiton Araújo", "567.472.170-04");
        this.clientes.add(cliente4);
        Cliente cliente5 = new Cliente("Cleiton de Melo", "447.756.700-69");
        this.clientes.add(cliente5);
        Cliente cliente6 = new Cliente("Benedita Guerra", "225.483.950-06");
        this.clientes.add(cliente6);
        Cliente cliente7 = new Cliente("Benedita Barros", "141.210.010-01");
        this.clientes.add(cliente7);
        Cliente cliente8 = new Cliente("Benedita Pereira", "422.312.330-02");
        this.clientes.add(cliente8);
        Cliente cliente9 = new Cliente("Benedita Abreu", "254.596.400-08");
        this.clientes.add(cliente9);
        Cliente cliente10 = new Cliente("Benedita Fonseca", "895.003.850-15");
        this.clientes.add(cliente10);
    }

    //Cadastra a venda de um carrinho de compras de UM cliente
    public void CadastrarVenda(Funcionario vendedor){
        //Buscar cliente pelo CPF
        System.out.println("Digite o CPF do comprador:");
        String cpf = scan.nextLine();
        boolean encontrou = false;
        for (Cliente cliente : this.clientes){
            if(cliente.getCpf().equals(cpf)){
                encontrou = true;
                //Impressão da nota fiscal
                System.out.println("Cupom fiscal da compra:\n\n");
                System.out.println("\t\t  " + this.loja.getNome() + "\n" +
                                   this.loja.getEndereco() + "\n" +
                                   "CNPJ: " + this.loja.getCnpj() + "\n" +
                                   "_________________________________________________\n\n" + 
                                   "\t  Cupom fiscal eletronico\n" + 
                                   "_________________________________________________\n" + 
                                   "CPF do consumidor: " + cliente.getCpf() + "\n\n" + 
                                   "Nome do vendedor: " + vendedor.getNome() + "\n" +
                                   "_________________________________________________\n" + 
                                   "#|COD|DESC|QTD|VL UN R$|VL TI R$|\n" + 
                                   "-------------------------------------------------");
                cliente.VisualizarCarrinho();
                System.out.println("-------------------------------------------------\n" + 
                                   "Valor total = \t\t\t" + cliente.getTotalCompras());
                //Zerar o carrinho
            }
        }
        if(encontrou == false){
            System.out.println("Cliente nao encontrado.");
        }
    }
    //Visualizar todos os clientes cadastrados
    public void VisualizarClientes(){
        System.out.println("-----------------------------------------------------");
        for(Cliente cliente : this.clientes){
            cliente.Visualizar();
            System.out.println("-----------------------------------------------------");
        }
    }
    //Buscar um cliente
    public Cliente BuscarCliente(String cpf){
        //------Procurar cliente no banco de dados--------
        for(Cliente cliente : this.clientes){
            //---------Caso encontrado---------
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        //---------Caso não encontrar---------
        return null;
    }
    //Deletar um cliente
    public boolean DeletarCliente(String cpf){
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf() == cpf){
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }
    //Editar um cliente
    public void EditarCliente(Object cpf, Cliente novosDados){
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf().equals(cpf)){
                cliente.Editar(novosDados);
                break;
            }
        }
    }

    //Getters
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    public Loja getLoja(){
        return this.loja;
    }
    //Setters
    public void setCliente(Cliente cliente, String endereco, String telefone){
        if(endereco != null){
            cliente.setEndereco(endereco);
        }
        if(telefone != null){
            cliente.setTelefone(telefone);
        }
        this.clientes.add(cliente); //Adição do cliente
    }
    public void setLoja(Loja loja){
        this.loja = loja; //Troca a loja cadastrada
    }
}