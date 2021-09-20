package Sistema;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList de clientes
    private Loja loja; //Inicializador de uma loja

    public void CadastrarVenda(Cliente comprador, Funcionario vendedor){
        //Carrinho de compras do cliente
        String opcao;
        //Enquanto a opção for Sim, adicionar um novo item ao carrinho
        do{
            ArrayList<Brinquedo> carrinhoCompras = new ArrayList<Brinquedo>();
            Brinquedo novo = this.loja.BuscarBrinquedo(); //Procura o brinquedo a ser adicionado
            if(novo == null){
                System.out.println("Brinquedo não encontrado."); //Imprime mensagem de erro
            } else {
                carrinhoCompras.add(novo); //Adiciona o brinquedo ao carrinho de compras
            }
            System.out.print("Deseja adicionar mais itens ao carrinho (S/N)? ");
            opcao = scan.next();
        } while (opcao != "n" || opcao != "N");
        //Gerar nota fical GerarNotaFiscal(carrinho de compras);
    }

    public void GerarNotaFiscal(Cliente comprador, Funcionario vendedor){
        //Impressão da nota fiscal
        System.out.println("Método ainda não implementado");
    }
    
    //Deleta 1 cliente do ArrayList de clientes
    public void DeletarCliente(){
        System.out.println("Digite o CPF do cliente que deseja deletar: ");
        String c = scan.nextLine();
        int i = 0;
        //Procurar dentro do array de clientes
        for(;i < this.clientes.size(); i++){
            if(this.clientes.get(i).getCpf() == c){
                break;
            }
        }
        if(i != this.clientes.size()){
            this.clientes.remove(i);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    //Mostra 1 cliente
    public void BuscarCliente(){
        System.out.println("Digite o CPF do cliente que deseja procurar: ");
        String c = scan.nextLine();
        int i = 0;
        //Procurar dentro do array de clientes
        for(;i < this.clientes.size(); i++){
            if(this.clientes.get(i).getCpf() == c){
                break;
            }
        }
        //Se não tiver chegado ao final do arrayList de clientes
        if(i != this.clientes.size()){
            //Imprimir os dados do cliente
            System.out.println(this.clientes.get(i));
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    //Getters e Setters

    //Retorna o Array de clientes.
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public Loja getLoja(){
        return this.loja;
    }

    public void setCliente(Cliente novo){
        //Cadastrar 1 cliente
        this.clientes.add(novo);
    }

    public void setLoja(){
        this.loja = new Loja(); //Cria espaço para 1 loja
        this.loja.Cadastrar(); //Cadastra 1 loja
    }
}


