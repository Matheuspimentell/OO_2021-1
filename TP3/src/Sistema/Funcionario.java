package Sistema;

public class Funcionario extends Pessoa{

    private int matricula;
    private String cargo;

    public String toString(){
        return  "===============================================\n"
                +"Nome do funcionario: " +this.nome+ "\n" +
                "Endereco do funcionario: " +this.endereco+ "\n" +
                "Telefone do funcionario: " +this.telefone+ "\n" +
                "ID do funcionario: " +this.matricula+ "\n" +
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
        this.matricula = m;
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
        this.setMatricula(m);
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

    public int getMatricula(){
        return this.matricula;
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

    public void setMatricula(int m){
        this.matricula = m;
    }

    public void setCargo(String car){
        this.cargo = car;
    }
}
