package Sistema;

import java.util.ArrayList;

public class Loja extends Pessoa{

    private String cnpj;
    private ArrayList<Funcionario> funcionarios; //ArrayList de funcionarios
    private ArrayList<Brinquedo> estoque; //ArrayList de brinquedos
    private String dadosLoja;

    //Alteração do construtor {new} de Loja
    public Loja(String nome, String endereco, String cnpj){
        //únicos atributos ESTRITAMENTE NECESSÁRIOS de Loja
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.estoque = new ArrayList<Brinquedo>();
        this.funcionarios = new ArrayList<Funcionario>();
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
        //Caso contrário
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
    //Método para deletar um funcionário
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
    //Método para buscar e visualizar 1 funcionário na lista de funcionários
    public void BuscarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja buscar: ");
        int id = scan.nextInt();
        scan.nextLine();
        //Percorrer toda a lista de funcionários
        for (Funcionario funcionario : this.funcionarios){
            if(funcionario.getId() == id){
                //Caso o funcionario tenha sido encontrado, mostrá-lo e sair do método
                System.out.println("Funcionario encontrado:");
                funcionario.Visualizar();
                return;
            }
        }
        //Caso o funcionario não tenha sido encontrado
        System.out.println("Funcionario nao encontrado.");
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
    //Método para deletar brinquedos no estoque
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
    //Método para visualizar 1 brinquedo
    public void BuscarBrinquedo(){
        System.out.print("Digite o Codigo Identificador do brinquedo que deseja buscar: ");
        int cid = scan.nextInt();
        scan.nextLine();
        //Percorrer todo o estoque
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getId() == cid){
                //Caso o brinquedo seja encontrado, mostrá-lo e sair do método
                System.out.println("Brinquedo encontrado:");
                System.out.println(brinquedo);
                return;
            }
        }
        //Caso o brinquedo não tenha sido encontrado
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
        //Caso contrário
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
        //Retornar o ArrayList de funcionários da loja
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
    //Cadastro de 1 funcionário
    public void setFuncionario(Funcionario funcionario){
        //Adiciona 1 funcionário na loja
        this.funcionarios.add(funcionario);
    }
    //Cadastro de 1 brinquedo no estoque
    public void setBrinquedo(Brinquedo brinquedo){
        //Adiciona 1 brinquedo no estoque
        this.estoque.add(brinquedo);
    }
}
