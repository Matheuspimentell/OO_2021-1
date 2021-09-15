package Sistema;

import java.util.ArrayList;

public class Loja extends Pessoa{

    private String cnpj;
    private ArrayList<Funcionario> funcionarios; //Array de funcionarios
    private ArrayList<Brinquedo> estoque; //Array de brinquedos

    public String toString(){
        return "Nome da loja: " +this.nome+ "\n" +
                "Endereco da loja: " +this.endereco+ "\n" +
                "Telefone da loja: " +this.telefone+ "\n" +
                "CNPJ da loja: " +this.cnpj+ "\n";
    }

    @Override
    public void Cadastrar() {
        System.out.print("Digite o nome da loja: ");
        String n = scan.nextLine();
        System.out.print("Digite o endereco da loja: ");
        String e = scan.nextLine();
        System.out.print("Digite o telefone da loja: ");
        String t = scan.nextLine();
        System.out.print("Digite o CNPJ da loja: ");
        String c = scan.nextLine();
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
        this.cnpj = c;
        funcionarios = new ArrayList<Funcionario>();
        estoque = new ArrayList<Brinquedo>();
    }

    @Override
    public void Visualizar() {
        System.out.println(this);
    }

    @Override
    public void Editar() {
        //Imprimir os dados anteriores
        System.out.println("Dados anteriores");
        this.Visualizar();
        //Nome
        System.out.print("Digite o novo nome da loja: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Endereco
        System.out.print("Digite o novo endereco da loja: ");
        String e = scan.nextLine();
        this.setEndereco(e);
        //Telefone
        System.out.print("Digite o novo telefone da loja: ");
        String t = scan.nextLine();
        this.setTelefone(t);
        //CNPJ
        System.out.print("Digite o novo CNPJ da loja: ");
        String c = scan.nextLine();
        this.setCnpj(c);
    }

    //Função para deletar funcioários
    public void DeletarFuncionario(){
        System.out.println("Digite o ID do funcionario que deseja excluir");
        int m = scan.nextInt();
        scan.nextLine();
        //Variável que indica a posição à ser excluída
        int i = 0;
        //Percorrer toda a lista de funcionários
        for(;i<this.funcionarios.size();i++){
            if(m == this.funcionarios.get(i).getMatricula()){
                break;
            }
        }
        //Verificar se chegamos ao final da lista
        if(i!=this.funcionarios.size()){
            this.funcionarios.remove(i);
        } else {
            System.out.println("Código identificador não encontrado.");
        }
    }

    //Função para deletar brinquedos no estoque
    public void DeletarBrinquedo(){
        System.out.println("Digite o Código Identificador do brinquedo que deseja excluir");
        int cid = scan.nextInt();
        scan.nextLine();
        //Variável que indica a posição à ser excluída
        int i = 0;
        //Percorrer toda a lista de funcionários
        for(;i<this.estoque.size();i++){
            if(cid == this.estoque.get(i).getCid()){
                break;
            }
        }
        //Verificar se chegamos ao final da lista
        if(i!=this.estoque.size()){
            this.estoque.remove(i);
        } else {
            System.out.println("Código identificador não encontrado.");
        }
    }

    //Getters e Setters
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
        this.funcionarios.add(novo);
    }

    //Mostrar todos os funcionários cadastrados
    public void getFuncionarios(){
        //Substituir por um laço
        for (int i=0 ; i<this.funcionarios.size(); i++){
            System.out.println(this.funcionarios.get(i));
        }
    }

    //Cadastro de 1 brinquedo no estoque
    public void setEstoque(Brinquedo novo){
        this.estoque.add(novo);
    }

    //Mostrar todos os itens no estoque
    public void getEstoque(){
        //Substituir por um laço
        for (int i=0 ; i<this.estoque.size(); i++){
            System.out.println(this.estoque.get(i));
        }
    }
}
