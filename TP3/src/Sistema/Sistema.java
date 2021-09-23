package Sistema;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList de clientes
    private Loja loja;

    public void CadastrarVenda(Cliente comprador, Funcionario vendedor){
        String opcao;
        //Carrinho de compras do cliente
        ArrayList<Brinquedo> carrinhoCompras = new ArrayList<Brinquedo>();
        ArrayList<Integer> qtd = new  ArrayList<Integer>();
        //Enquanto a opção for Sim, adicionar um novo item ao carrinho
        do {
            Brinquedo novo = this.loja.BuscarBrinquedo(); //Procura o brinquedo a ser adicionado
            if(novo == null){
                System.out.println("Brinquedo não encontrado."); //Imprime mensagem de erro
            } else {
                //Pedir quantidade do item
                System.out.println("Qual a quantidade do item que deseja adicionar ?");
                int quant = scan.nextInt();
                scan.nextLine();
                qtd.add(quant);
                carrinhoCompras.add(novo); //Adiciona o brinquedo ao carrinho de compras
            }
            System.out.print("Deseja adicionar mais itens ao carrinho (S/N)? ");
            opcao = scan.nextLine();
        } while (opcao != "n" || opcao != "N");
        //Gerar nota fical GerarNotaFiscal(carrinho de compras);
    }

    public String GerarNotaFiscal(ArrayList<Brinquedo> carrinhoCompras, String cpf, String nomeVendedor){
        return this.loja.getNome() + "\n\n" +
               this.loja.getEndereco() + "\n" +
               this.loja.getCnpj() + "\n" +
               "_________________________________________________\n\n" + 
               "Cupom fiscal eletrônico\n" + 
               "_________________________________________________\n\n" +
               "CPF do consumidor: " + cpf + "\n\n" +
               "Nome do vendedor: " + nomeVendedor + "\n" +
               "_________________________________________________\n" +
               "#|COD|DESC|QTD|VL UN R$|VL TI R$|\n" +
               "-------------------------------------------------\n" +
               "";
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

    //Busca e Mostra 1 cliente
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
    //Acesso à Loja
    public Loja getLoja(){
        return this.loja;
    }
    //Cadastrar 1 cliente
    public void setCliente(Cliente novo){
        this.clientes.add(novo);
    }

    public void setLoja(String nome, String endereco, String cnpj){
        this.loja = new Loja(nome, endereco, cnpj); //Cria espaço para 1 loja
    }
}