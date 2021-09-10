package Sistema;

public class Loja extends Pessoa{

    private String cnpj;
    private Funcionario[] funcionarios;
    private Brinquedo[] estoque;

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
        //construtor de funcionarios e Estoque
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

    @Override
    public void Deletar() {
        //Procurar como deletar
    }

    public void VisualizarFuncionarios(){
        System.out.println("==== Dados dos funcionarios ====");
        System.out.println(funcionarios);
        System.out.println("================================");
    }

    public void VisualizarEstoque(){

    }

    //Getters e Setters
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setEndereco(String e){
        this.endereco = e;
    }

    public void setTelefone(String t){
        this.telefone = t;
    }

    public void setCnpj(String c){
        this.cnpj = c;
    }
}
