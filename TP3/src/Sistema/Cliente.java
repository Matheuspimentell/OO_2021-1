package Sistema;

public class Cliente extends Pessoa{
    private String cpf;

    //Alteração do construtor {new} de Cliente
    public Cliente(String nome, String cpf){
        //únicos atributos ESTRITAMENTE NECESSÁRIOS de Cliente
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome do cliente: " +this.nome+ "\n" +
               "CPF do cliente: " +this.cpf+ "\n" +
               "Endereco do cliente: " +this.endereco+ "\n" +
               "Telefone do cliente: " +this.telefone+ "\n";
    }

    //Completa o cadastro do cliente
    @Override
    public void Cadastrar() {
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
    @Override
    public void Editar() {
        //Imprimir os dados anteriores
        System.out.println("Dados anteriores:");
        this.Visualizar();
        System.out.println("-----------------------------------------------------");
        //Nome
        System.out.print("Digite o novo nome do cliente: ");
        String n = scan.nextLine();
        this.nome = n;
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
        //CPF
        System.out.print("Digite o novo CPF do cliente: ");
        String c = scan.nextLine();
        this.cpf = c;
    }

    //Imprime apenas os dados cadastrados
    @Override
    public void Visualizar() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF do cliente: " + this.cpf);
        if(this.endereco != null){
            System.out.println("Endereco do cliente: " + this.endereco);
        }
        if(this.telefone != null){
            System.out.println("Telefone do cliente: " + this.telefone);
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
    public void setCpf(String c){
        this.cpf = c;
    }
}