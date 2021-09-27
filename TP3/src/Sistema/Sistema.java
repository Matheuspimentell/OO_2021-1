package Sistema;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList de clientes
    private Loja loja = new Loja("Toy Store", "Taguatinga", "87.499.017/0001-13"); //Declaração da loja
    
    public void CadastrarVenda(String cpfCliente, String nomeFuncionario){
        //Cadastrar a venda de UM item com os dados recebidos
        ArrayList<Brinquedo> carrinhoCompras = new ArrayList<Brinquedo>();
        ArrayList<Integer> quantidades = new ArrayList<Integer>();
        System.out.println("Digite o codigo identificador do brinquedo à ser adicionado ao carrinho:");
        int codigo = scan.nextInt();
        scan.nextLine();
        //Procura o brinquedo em estoque
        for (Brinquedo brinquedo : this.loja.getEstoque()){
            if(codigo == brinquedo.getCid()){
                System.out.println("Digite a quantidade de itens vendidos: ");
                int quantidade = scan.nextInt();
                scan.nextLine();
                if(quantidade > brinquedo.getQuantidade()){
                    System.out.println("Quantidade maior do que quantidade em estoque!");
                } else {
                    //Tira a quantidade vendida de estoque
                    brinquedo.setQuantidade(brinquedo.getQuantidade() - quantidade);
                    //Adiciona a quantidade do brinquedo à ser adicionado
                    quantidades.add(quantidade);
                    //Adiciona o Brinquedo no carrinho de compras
                    carrinhoCompras.add(brinquedo);
                }
            }
        }
        //Imprimir um teste de nota fiscal
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
        System.out.println("Cliente não encontrado.");
    }
    //Deletar um cliente
    public void DeletarCliente(){
        System.out.println("Digite o CPF do cliente que deseja excluir: ");
        String cpf = scan.nextLine();
        boolean removeu = false;
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf() == cpf){
                clientes.remove(cliente);
                System.out.println("Cliente excluído: ");
                cliente.Visualizar();
                removeu = true;
                break;
            }
        }
        if(removeu == false){
            System.out.println("Cliente não encontrado.");
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