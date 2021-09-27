package Sistema;

import java.util.ArrayList;

public class Loja extends Pessoa{

    private String cnpj;
    private ArrayList<Funcionario> funcionarios; //ArrayList de funcionarios
    private ArrayList<Brinquedo> estoque; //ArrayList de brinquedos

    //Alteração do construtor {new} de Loja
    public Loja(String nome, String endereco, String cnpj){
        //únicos atributos ESTRITAMENTE NECESSÁRIOS de Loja
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
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
    @Override
    public void Cadastrar() {
        //Caso o telefone da loja seja nulo
        if(this.telefone == null){
            System.out.print("Digite o telefone da loja: ");
            String telefone = scan.nextLine();
            this.telefone = telefone;
        //Caso contrário
        } else {
            System.out.println("A loja já está com o cadastro completo.");
        }
    }
    //Mostra apenas os dados cadastrados
    @Override
    public void Visualizar() {
        System.out.println("Nome da loja: " + this.nome);
        System.out.println("CNPJ da loja: " + this.cnpj);
        System.out.println("Endereco da loja: " + this.endereco);
        if(this.telefone != null){
            System.out.println("Telefone da loja: " + this.telefone);
        }
    }
    //Edita os dados cadastrados
    @Override
    public void Editar() {
        //Imprimir os dados anteriores
        System.out.println("Dados anteriores");
        this.Visualizar();
        System.out.println("-----------------------------------------------------");
        //Nome
        System.out.print("Digite o novo nome da loja: ");
        String nome = scan.nextLine();
        this.nome = nome;
        //CNPJ
        System.out.print("Digite o novo CNPJ da loja: ");
        String cnpj = scan.nextLine();
        this.cnpj = cnpj;
        //Endereco
        System.out.print("Digite o novo endereco da loja: ");
        String endereco = scan.nextLine();
        this.endereco = endereco;
        if(this.telefone != null){
            //Telefone
            System.out.print("Digite o novo telefone da loja: ");
            String telefone = scan.nextLine();
            this.telefone = telefone;
        }
    }
    //Método para deletar um funcionário
    public void DeletarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja excluir: ");
        int id = scan.nextInt();
        scan.nextLine();
        boolean removeu = false;
        for(Funcionario funcionario : this.funcionarios){
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
    //Método para buscar e visualizar 1 funcionário no banco de funcionários
    public void BuscarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja buscar: ");
        int id = scan.nextInt();
        scan.nextLine();
        //Percorrer toda a lista de funcionários
        for(Funcionario funcionario : this.funcionarios){
            if(funcionario.getId() == id){
                //Caso o funcionario tenha sido encontrado, mostrá-lo e sair do método
                System.out.println("Funcionario encontrado:");
                funcionario.Visualizar();
                return;
            }
        }
        //Caso o funcionario não tenha sido encontrado
        System.out.println("Funcionario não encontrado.");
    }
    //Visualizar todos os funcionarios
    public void VisualizarFuncionarios(){
        if(this.funcionarios != null){
            for(Funcionario funcionario : this.funcionarios){
                funcionario.Visualizar();
            }
        } else {
            System.out.println("Não ha funcionarios cadastrados.");
        }
    }
    //Método para deletar brinquedos no estoque
    public void DeletarBrinquedo(){
        System.out.print("Digite o Código Identificador do brinquedo que deseja excluir: ");
        int cid = scan.nextInt();
        scan.nextLine();
        boolean removeu = false;
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getCid() == cid){
                this.estoque.remove(brinquedo);
                System.out.println("Brinquedo excluído:");
                System.out.println(brinquedo);
                removeu = true;
                break;
            }
        }
        if(removeu == false){
            System.out.println("Brinquedo não encontrado.");
        }
    }
    //Método para visualizar 1 brinquedo
    public void BuscarBrinquedo(){
        System.out.print("Digite o Código Identificador do brinquedo que deseja buscar: ");
        int cid = scan.nextInt();
        scan.nextLine();
        //Percorrer todo o estoque
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getCid() == cid){
                //Caso o brinquedo seja encontrado, mostrá-lo e sair do método
                System.out.println("Brinquedo encontrado:");
                System.out.println(brinquedo);
                return;
            }
        }
        //Caso o brinquedo não tenha sido encontrado
        System.out.println("Brinquedo não encontrado.");
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
            System.out.println("Não ha itens em estoque.");
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
