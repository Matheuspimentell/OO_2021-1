package toyStore.srcCode;

import toyStore.GUI.*;
import java.util.ArrayList;

public class Loja extends Pessoa{

    private String cnpj;
    private ArrayList<Funcionario> funcionarios; //ArrayList de funcionarios
    private ArrayList<Brinquedo> estoque; //ArrayList de brinquedos
    private String dadosLoja;

    //AlteraÃ§Ã£o do construtor {new} de Loja
    public Loja(String nome, String endereco, String cnpj){
        //Ãºnicos atributos ESTRITAMENTE NECESSÃ�RIOS de Loja
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.estoque = new ArrayList<Brinquedo>();
        this.funcionarios = new ArrayList<Funcionario>();

        //-------------AdiÃ§Ã£o de 10 funcionarios------------
        Funcionario funcionario1 = new Funcionario("Laura Maya Farias", 96234, "Gerente de Vendas");
        this.funcionarios.add(funcionario1);
        Funcionario funcionario2 = new Funcionario("Nicole Benedita", 39605, "Vendedor");
        this.funcionarios.add(funcionario2);
        Funcionario funcionario3 = new Funcionario("LuÃ­s TomÃ¡s", 11694, "Vendedor");
        this.funcionarios.add(funcionario3);
        Funcionario funcionario4 = new Funcionario("Francisco Miguel", 70384, "Vendedor");
        this.funcionarios.add(funcionario4);
        Funcionario funcionario5 = new Funcionario("Diego Juan", 68072, "Vendedor");
        this.funcionarios.add(funcionario5);
        Funcionario funcionario6 = new Funcionario("LuÃ­s Vitor", 97035, "Vendedor");
        this.funcionarios.add(funcionario6);
        Funcionario funcionario7 = new Funcionario("Leonardo Kaique", 58719, "Vendedor");
        this.funcionarios.add(funcionario7);
        Funcionario funcionario8 = new Funcionario("Brenda Daniela", 46712, "Vendedor");
        this.funcionarios.add(funcionario8);
        Funcionario funcionario9 = new Funcionario("Heitor Raul", 82053, "Vendedor");
        this.funcionarios.add(funcionario9);
        Funcionario funcionario10 = new Funcionario("Isabel Simone", 79658, "Vendedor");
        this.funcionarios.add(funcionario10);

        //--------AdiÃ§Ã£o de 5 brinquedos---------
        Brinquedo brinquedo1 = new Brinquedo("Boneca Barbie - Diversao na Praia",
         "Brabie", "Boneca", 38.99, 3, 20, 354);
        this.estoque.add(brinquedo1);
        Brinquedo brinquedo2 = new Brinquedo("Jogo Pula Macaco",
         "Estrela", "Tabuleiro", 64.99, 5, 15, 490);
        this.estoque.add(brinquedo2);
        Brinquedo brinquedo3 = new Brinquedo("Pista Hot Wheels - Track Set",
         "Hot Wheels", "Carros", 649.99, 8, 16, 291);
        this.estoque.add(brinquedo3);
        Brinquedo brinquedo4 = new Brinquedo("Celular Musical",
         "Estrela", "Musical", 58.99, 1, 8, 645);
        this.estoque.add(brinquedo4);
        Brinquedo brinquedo5 = new Brinquedo("Baby Alive - Lanchinhos Divertidos",
         "Baby Alive", "Boneca", 278.99, 8, 24, 463);
        this.estoque.add(brinquedo5);
    }


    public String toString(){
        return "Nome da loja: " + this.nome + "\n" +
                "CNPJ da loja: " + this.cnpj + "\n" +
                "Endereco da loja: " + this.endereco + "\n" +
                "Telefone da loja: " + this.telefone;
    }
    //Completa o cadastro da loja
    public void CompletaCadastro(String telefone) {
        //Caso o telefone da loja seja nulo
        if(this.telefone == null){
            this.telefone = telefone;
        //Caso contrÃ¡rio
        } else {
            System.out.println("A loja ja esta com o cadastro completo.");
        }
    }
    //Mostra apenas os dados cadastrados
    @Override
    public String Visualizar() {
        String dadosTelefone = "";
        if(this.telefone != null){
            dadosTelefone = "Telefone da loja: " + this.telefone;
        }
        dadosLoja = "<html>Nome da loja: " + this.nome + "<br /><br />" + 
        "CNPJ da loja: " + this.cnpj + "<br /><br />" + 
        "Endereco da loja: " + this.endereco + "<br /><br />" +
        dadosTelefone + "</html>";

        return dadosLoja;
    }
    //Edita os dados cadastrados
    public void Editar(String nome, String endereco, String cnpj, String telefone) {
        //Nome
        if(nome != null){
            this.nome = nome;
        }
        //Endereco
        if(endereco != null){
            this.endereco = endereco;
        }
        //CNPJ
        if(cnpj != null){
            this.cnpj = cnpj;
        }
        //Telefone
        if(this.telefone != null && telefone != null){
            this.telefone = telefone;
        }
    }
    //MÃ©todo para deletar um funcionÃ¡rio
    public void DeletarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja excluir: ");
        int id = scan.nextInt();
        scan.nextLine();
        boolean removeu = false;
        for (Funcionario funcionario : this.funcionarios){
            if(funcionario.getId() == id){
                this.funcionarios.remove(funcionario);
                removeu = true;
                System.out.println("Funcionario excluido:");
                funcionario.Visualizar();
                break;
            }
        }
        if(removeu == false){
            System.out.println("Funcionario nao encontrado.");
        }
    }
    //MÃ©todo para buscar e visualizar 1 funcionÃ¡rio na lista de funcionÃ¡rios
    public Funcionario BuscarFuncionario(String id){
       int procurarId = Integer.parseInt(id);
       for(Funcionario funcionario : this.funcionarios) {
    	   if(procurarId == funcionario.getId()) {
    		   return funcionario;
    	   }
       }
       return null;
    }
    //Visualizar todos os funcionarios
    public void VisualizarFuncionarios(){
        if(this.funcionarios != null){
            for(Funcionario funcionario : this.funcionarios){
                funcionario.Visualizar();
            }
        } else {
            System.out.println("Nao ha funcionarios cadastrados.");
        }
    }
    //MÃ©todo para deletar brinquedos no estoque
    public void DeletarBrinquedo(){
        System.out.print("Digite o Codigo Identificador do brinquedo que deseja excluir: ");
        int cid = scan.nextInt();
        scan.nextLine();
        boolean removeu = false;
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getId() == cid){
                this.estoque.remove(brinquedo);
                removeu = true;
                System.out.println("Brinquedo excluido:");
                System.out.println(brinquedo);
                break;
            }
        }
        if(removeu == false){
            System.out.println("Brinquedo nao encontrado.");
        }
    }
    //MÃ©todo para visualizar 1 brinquedo
    public void BuscarBrinquedo(){
        System.out.print("Digite o Codigo Identificador do brinquedo que deseja buscar: ");
        int cid = scan.nextInt();
        scan.nextLine();
        //Percorrer todo o estoque
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getId() == cid){
                //Caso o brinquedo seja encontrado, mostrÃ¡-lo e sair do mÃ©todo
                System.out.println("Brinquedo encontrado:");
                System.out.println(brinquedo);
                return;
            }
        }
        //Caso o brinquedo nÃ£o tenha sido encontrado
        System.out.println("Brinquedo nao encontrado.");
    }
    //Visualizar o estoque inteiro
    public void VisualizarEstoque(){
        //Caso existam brinquedos cadastrados
        if(this.estoque != null){
            System.out.println("-----------------------------------------------------");
            for (Brinquedo brinquedo : this.estoque){
                System.out.println(brinquedo);
                System.out.println("-----------------------------------------------------");
            }
        //Caso contrÃ¡rio
        } else {
            System.out.println("Nao ha itens em estoque.");
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
    public String getCnpj(){
        return this.cnpj;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        //Retornar o ArrayList de funcionÃ¡rios da loja
        return this.funcionarios;
    }
    public ArrayList<Brinquedo> getEstoque(){
        //Retornar o ArrayList dos brinquedos
        return this.estoque;
    }
    //Setters
    @Override
    public void setNome(String n){
        this.nome = n;
    }
    @Override
    public void setEndereco(String e){
        this.endereco = e;
    }
    @Override
    public void setTelefone(String t){
        this.telefone = t;
    }
    public void setCnpj(String c){
        this.cnpj = c;
    }
    //Cadastro de 1 funcionÃ¡rio
    public void setFuncionario(Funcionario funcionario, String endereco, String telefone){
        if(endereco != null){
            funcionario.setEndereco(endereco);
        }
        if(telefone != null){
            funcionario.setTelefone(telefone);
        }
        //Adiciona 1 funcionÃ¡rio na loja
        this.funcionarios.add(funcionario);
    }
    //Cadastro de 1 brinquedo no estoque
    public void setBrinquedo(Brinquedo brinquedo){
        //Adiciona 1 brinquedo no estoque
        this.estoque.add(brinquedo);
    }
}
