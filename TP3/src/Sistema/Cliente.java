package Sistema;

public class Cliente extends Pessoa{
    private String cpf;

    public String toString(){
        return "Nome do cliente: " +this.nome+ "\n" +
               "Endereco do cliente: " +this.endereco+ "\n" +
               "Telefone do cliente: " +this.telefone+ "\n" +
               "CPF do cliente: " +this.cpf+ "\n";
    }

    @Override
    public void Cadastrar() {
        //Nome
        System.out.print("Digite o nome do cliente: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Endereco
        System.out.print("Digite o endereco do cliente: ");
        String e = scan.nextLine();
        this.setEndereco(e);
        //Telefone
        System.out.print("Digite o telefone do cliente: ");
        String t = scan.nextLine();
        this.setTelefone(t);
        //CPF
        System.out.print("Digite o CPF do cliente: ");
        String c = scan.nextLine();
        this.setCpf(c);
    }

    @Override
    public void Editar() {
        //Imprimir os dados anteriores
        System.out.println("Dados anteriores");
        this.Visualizar();
        //Nome
        System.out.print("Digite o novo nome do cliente: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Endereco
        System.out.print("Digite o novo endereco do cliente: ");
        String e = scan.nextLine();
        this.setEndereco(e);
        //Telefone
        System.out.print("Digite o novo telefone do cliente: ");
        String t = scan.nextLine();
        this.setTelefone(t);
        //CPF
        System.out.print("Digite o novo CPF do cliente: ");
        String c = scan.nextLine();
        this.setCpf(c);
    }

    @Override
    public void Visualizar() {
        System.out.println(this);
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

    public String getCpf(){
        return this.cpf;
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

    public void setCpf(String c){
        this.cpf = c;
    }
}
