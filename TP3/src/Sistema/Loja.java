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

    @Override
    public void Visualizar() {
        System.out.println("Nome da loja: " + this.nome);
        System.out.println("CNPJ da loja: " + this.cnpj);
        System.out.println("Endereco da loja: " + this.endereco);
        if(this.telefone != null){
            System.out.println("Telefone da loja: " + this.telefone);
        }
    }

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

    //Função para deletar funcioários
    public void DeletarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja excluir: ");
        int id = scan.nextInt();
        scan.nextLine();
        //Variável que indica a posição à ser excluída
        int i = 0;
        //Percorrer toda a lista de funcionários
        for(;i<this.funcionarios.size();i++){
            if(id == this.funcionarios.get(i).getid()){
                break;
            }
        }
        //Verificar se chegamos ao final da lista
        if(i != this.funcionarios.size()){
            this.funcionarios.remove(i);
        } else {
            System.out.println("Código identificador não encontrado.");
        }
    }

    //Função para buscar e visualizar 1 funcionário no banco de funcionários
    public Funcionario BuscarFuncionario(){
        System.out.print("Digite o ID do funcionario que deseja buscar: ");
        int m = scan.nextInt();
        scan.nextLine();
        int i = 0; //Variável que indica a posição à ser excluída
        //Percorrer toda a lista de funcionários
        for(;i<this.funcionarios.size();i++){
            if(m == this.funcionarios.get(i).getid()){
                break;
            }
        }
        //Verificar se chegamos ao final da lista
        if(i != this.funcionarios.size()){
            //Mostrar os dados cadastrados do funcionario
            return this.funcionarios.get(i);
        } else {
            System.out.println("Código identificador não encontrado.");
            return null;
        }
    }

    //Visualizar todos os funcionarios
    public void VisualizarFuncionarios(){
        if(this.funcionarios != null){
            for (int i = 0; i < this.funcionarios.size(); i++){
                //Mostrar os dados cadastrados de cada funcionario
                this.funcionarios.get(i).Visualizar();
            }
        } else {
            System.out.println("Não ha funcionarios cadastrados.");
        }
    }

    //Função para deletar brinquedos no estoque
    public void DeletarBrinquedo(){
        System.out.print("Digite o Código Identificador do brinquedo que deseja excluir: ");
        int cid = scan.nextInt();
        scan.nextLine();
        //Variável que indica a posição à ser excluída
        int i = 0;
        //Percorrer todo o estoque
        for(;i<this.estoque.size();i++){
            if(cid == this.estoque.get(i).getCid()){
                break;
            }
        }
        //Verificar se chegamos ao final do estoque
        if(i != this.estoque.size()){
            this.estoque.remove(i);
        } else {
            System.out.println("Código identificador não encontrado.");
        }
    }

    //Função para visualizar 1 brinquedo
    public Brinquedo BuscarBrinquedo(){
        System.out.print("Digite o Código Identificador do brinquedo que deseja buscar: ");
        int cid = scan.nextInt();
        scan.nextLine();
        //Variável que indica a posição à ser excluída
        int i = 0;
        //Percorrer toda o estoque
        for(;i<this.estoque.size();i++){
            if(cid == this.estoque.get(i).getCid()){
                break;
            }
        }
        //Verificar se chegamos ao final da lista
        if(i!=this.estoque.size()){
            return this.estoque.get(i);
        } else {
            System.out.println("Brinquedo não encontrado.");
            return null;
        }
    }

    //Visualizar o estoque inteiro
    public void VisualizarEstoque(){
        if(this.estoque != null){
            for (int i = 0; i < this.estoque.size(); i++){
                System.out.println(this.estoque.get(i));
            }
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
    public void setFuncionario(Funcionario novo){
        //Adiciona 1 funcionário na loja
        this.funcionarios.add(novo);
    }
    //Cadastro de 1 brinquedo no estoque
    public void setBrinquedo(Brinquedo novo){
        //Adiciona 1 brinquedo no estoque
        this.estoque.add(novo);
    }
}
