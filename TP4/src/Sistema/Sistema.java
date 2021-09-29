package Sistema;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList de clientes
    private Loja loja = new Loja("Toy Store", "Taguatinga", "87.499.017/0001-13"); //Declaração da loja
    
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
    public void BuscarCliente(){
        System.out.println("Digite o CPF do cliente que deseja buscar:");
        String cpf = scan.nextLine();
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf().equals(cpf)){
                //Caso o cliente tenha sido encontrado, mostrar o cliente e sair do método
                System.out.println("Cliente encontrado:");
                cliente.Visualizar();
                return;
            }
        }
        //Caso o cliente não tenha sido encontrado
        System.out.println("Cliente nao encontrado.");
    }
    //Deletar um cliente
    public void DeletarCliente(){
        System.out.println("Digite o CPF do cliente que deseja excluir: ");
        String cpf = scan.nextLine();
        boolean removeu = false;
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf() == cpf){
                clientes.remove(cliente);
                System.out.println("Cliente excluido: ");
                cliente.Visualizar();
                removeu = true;
                break;
            }
        }
        if(removeu == false){
            System.out.println("Cliente nao encontrado.");
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
    public void setCliente(Cliente cliente){
        this.clientes.add(cliente); //Adição do cliente
    }
    public void setLoja(Loja loja){
        this.loja = loja; //Troca a loja cadastrada
    }
}