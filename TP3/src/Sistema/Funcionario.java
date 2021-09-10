package Sistema;

import java.util.Arrays;

public class Funcionario extends Pessoa{

    private int codigoIdentificador;
    private String cargo;

    public String toString(){
        return  "===============================================\n"
                +"Nome do funcionario: " +this.nome+ "\n" +
                "Endereco do funcionario: " +this.endereco+ "\n" +
                "Telefone do funcionario: " +this.telefone+ "\n" +
                "ID do funcionario: " +this.codigoIdentificador+ "\n" +
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
        int cid = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o cargo do funcionario: ");
        String car = scan.nextLine();
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
        this.codigoIdentificador = cid;
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
        int cid = scan.nextInt();
        scan.nextLine();
        this.setCid(cid);
        //Cargo
        System.out.print("Digite o novo cargo do funcionario: ");
        String car = scan.nextLine();
        this.setCargo(car);
    }


    public Funcionario[] Deletar(Funcionario[] funcionarios, String c) {
        //Procurar pelo codigo do funcionario e retirá-lo do array
        return funcionarios;
    }

    //Getter e Setters
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public int getCid(){
        return this.codigoIdentificador;
    }

    public String getCargo(){
        return this.cargo;
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

    public void setCid(int cid){
        this.codigoIdentificador = cid;
    }

    public void setCargo(String car){
        this.cargo = car;
    }
}
