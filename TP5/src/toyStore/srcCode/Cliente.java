package toyStore.srcCode;

import toyStore.GUI.*;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String cpf;
    private ArrayList<Brinquedo> carrinho;

    //Alteração do construtor {new} de Cliente
    public Cliente(String nome, String cpf){
        //únicos atributos ESTRITAMENTE NECESSÁRIOS de Cliente
        this.nome = nome;
        this.cpf = cpf;
        this.carrinho = new ArrayList<Brinquedo>();
    }

    public String toString(){
        return "Nome do cliente: " +this.nome+ "\n" +
               "CPF do cliente: " +this.cpf+ "\n" +
               "Endereco do cliente: " +this.endereco+ "\n" +
               "Telefone do cliente: " +this.telefone+ "\n";
    }

    //Completa o cadastro do cliente
    public void CompletaCadastro() {
        //Caso ainda existam dados nulos
        if(this.endereco == null || this.telefone == null){
            System.out.println("Completar o cadastro do cliente: " + this.nome);
            System.out.println("-----------------------------------------------------");
            //Endereco
            if(this.endereco == null){
                System.out.print("Digite o endereco do cliente: ");
                String e = scan.nextLine();
                this.endereco = e;
                System.out.println("-----------------------------------------------------");
            }
            //Telefone
            if(this.telefone ==  null){
                System.out.print("Digite o telefone do cliente: ");
                String t = scan.nextLine();
                this.telefone = t;
                System.out.println("-----------------------------------------------------");
            }
        //Caso contrário
        } else {
            System.out.println("O cliente em questao ja possui um cadastro completo.");
            System.out.println("-----------------------------------------------------");
        }
    }

    //Edita apenas os dados já cadastrados
    public void Editar() {
        //Imprimir os dados anteriores
        System.out.println("Dados anteriores:");
        this.Visualizar();
        System.out.println("-----------------------------------------------------");
        //Nome
        System.out.print("Digite o novo nome do cliente: ");
        String n = scan.nextLine();
        this.nome = n;
        //CPF
        System.out.print("Digite o novo CPF do cliente: ");
        String c = scan.nextLine();
        this.cpf = c;
        //Endereco
        if(this.endereco != null){
            System.out.print("Digite o novo endereco do cliente: ");
            String e = scan.nextLine();
            this.endereco = e;
        }
        //Telefone
        if(this.telefone != null){
            System.out.print("Digite o novo telefone do cliente: ");
            String t = scan.nextLine();
            this.telefone = t;
        }
    }

    //Imprime apenas os dados cadastrados
    @Override
    public String Visualizar() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF do cliente: " + this.cpf);
        if(this.endereco != null){
            System.out.println("Endereco do cliente: " + this.endereco);
        }
        if(this.telefone != null){
            System.out.println("Telefone do cliente: " + this.telefone);
        }
        return null;
    }

    //Adiciona um item e sua quantidade comprada ao carrinho de compras do cliente
    public void AdicionaItem(Brinquedo brinquedo, int quantidade){
        brinquedo.setQuantidade(quantidade); //Adiciona a quantidade correta do brinquedo
        this.carrinho.add(brinquedo); //Adiciona o brinquedo ao carrinho
    }
    
    //Imprime todos os brinquedos no carrinho de compras
    public void VisualizarCarrinho(){
        for(Brinquedo brinquedo : this.carrinho){
            System.out.println(brinquedo.getId() + " " + brinquedo.getNome() +
                               " " + brinquedo.getQuantidade() + " * " + brinquedo.getPreco() +
                               " (" + brinquedo.getQuantidade()*brinquedo.getPreco() + ")");
        }
    }

    //Getters
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public String getEndereco(){
        return this.endereco;
    }
    @Override
    public String getTelefone(){
        return this.telefone;
    }
    public String getCpf(){
        return this.cpf;
    }
    public ArrayList<Brinquedo> getCarrinho(){
        return this.carrinho;
    }
    public double getTotalCompras(){
        double valorTotal = 0;
        for(Brinquedo brinquedo : this.carrinho){
            valorTotal = valorTotal + (brinquedo.getQuantidade()*brinquedo.getPreco());
        }
        return valorTotal;
    }
    //Setters
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    @Override
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setCarrinho(ArrayList<Brinquedo> carrinho){
        this.carrinho = carrinho;
    }
}