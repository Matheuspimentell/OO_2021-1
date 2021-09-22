package Sistema;

public class Funcionario extends Pessoa{

    private int id;
    private String cargo;

    //Alteração do construtor {new} de Funcionário
    public Funcionario(String nome, String endereco, String telefone, int id, String cargo){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = id;
        this.cargo = cargo;
    }

    public String toString(){
        return  "===============================================\n"+
                "Nome do funcionario: " +this.nome+ "\n" +
                "Endereco do funcionario: " +this.endereco+ "\n" +
                "Telefone do funcionario: " +this.telefone+ "\n" +
                "ID do funcionario: " +this.id+ "\n" +
                "Cargo do funcionario: " +this.cargo+ "\n";
    }

    @Override
    public void Cadastrar() {
        System.out.print("Digite o nome do funcionario: ");
        String n = scan.nextLine();
        System.out.print("Digite o endereco do funcionario: ");
        String e = scan.nextLine();
        System.out.print("Digite o telefone do funcionario: ");
        String t = scan.nextLine();
        System.out.print("Digite o ID do funcionario: ");
        int m = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o cargo do funcionario: ");
        String car = scan.nextLine();
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
        this.id = m;
        this.cargo = car;
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
        System.out.print("Digite o novo nome do funcionario: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Endereco
        System.out.print("Digite o novo endereco do funcionario: ");
        String e = scan.nextLine();
        this.setEndereco(e);
        //Telefone
        System.out.print("Digite o novo telefone do funcionario: ");
        String t = scan.nextLine();
        this.setTelefone(t);
        //Codigo identificador
        System.out.print("Digite o novo ID do funcionario: ");
        int m = scan.nextInt();
        scan.nextLine();
        this.setid(m);
        //Cargo
        System.out.print("Digite o novo cargo do funcionario: ");
        String car = scan.nextLine();
        this.setCargo(car);
    }

    //Getter e Setters
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

    public int getid(){
        return this.id;
    }

    public String getCargo(){
        return this.cargo;
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

    public void setid(int m){
        this.id = m;
    }

    public void setCargo(String car){
        this.cargo = car;
    }
}
