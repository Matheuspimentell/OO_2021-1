package toyStore.srcCode;

import toyStore.GUI.*;

public class Funcionario extends Pessoa{

    private int id;
    private String cargo;

    //AlteraÃ§Ã£o do construtor {new} de FuncionÃ¡rio
    public Funcionario(String nome, int id, String cargo){
        //Ãºnicos atributos ESTRITAMENTE NECESSÃ�RIOS de FuncionÃ¡rio
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
    }

    public String toString(){
        return  "Nome do funcionario: " + this.nome+ "\n" +
                "ID do funcionario: " + this.id+ "\n" +
                "Cargo do funcionario: " + this.cargo + "\n" +
                "Endereco do funcionario: " + this.endereco + "\n" +
                "Telefone do funcionario: " + this.telefone + "\n" ;
    }

    //Completa o cadastro do funcionario
    public void CompletaCadastro() {
        //Caso ainda existam dados nulos
        if(this.endereco == null || this.telefone == null){
            //EndereÃ§o
            if(this.endereco == null){
                System.out.print("Digite o endereco do funcionario: ");
                String e = scan.nextLine();
                this.endereco = e;
            }
            //Telefone
            if(this.telefone == null){
                System.out.print("Digite o telefone do funcionario: ");
                String t = scan.nextLine();
                this.telefone = t;
            }
        //Caso contrÃ¡rio
        } else {
            System.out.println("O funcionario em questao ja possui um cadastro completo.");
        }
    }

    //Imprime apenas os dados cadastrados
    @Override
    public String Visualizar() {
    	if(this.endereco == null && this.telefone == null){
    		return "<html> Nome do funcionario: " + this.nome + "<br />" +
            		"ID do funcionario: " + this.id + "<br />" +
            		"Cargo do funcionario: " + this.cargo + "<br />" +
            		"Endereco do funcionario: " + "" + "<br />" +
            		"Telefone do funcionario: " + "" + "</html>";
    	} else if (this.endereco != null && this.telefone == null) {
    		return "<html> Nome do funcionario: " + this.nome + "<br />" +
            		"ID do funcionario: " + this.id + "<br />" +
            		"Cargo do funcionario: " + this.cargo + "<br />" +
            		"Endereco do funcionario: " + this.endereco + "<br />" +
            		"Telefone do funcionario: " + "" + "</html>";
    	} else if (this.endereco == null && this.telefone != null) {
    		return "<html> Nome do funcionario: " + this.nome + "<br />" +
            		"ID do funcionario: " + this.id + "<br />" +
            		"Cargo do funcionario: " + this.cargo + "<br />" +
            		"Endereco do funcionario: " + "" + "<br />" +
            		"Telefone do funcionario: " + this.telefone + "</html>";
    	} else {
    		return "<html> Nome do funcionario: " + this.nome + "<br />" +
            		"ID do funcionario: " + this.id + "<br />" +
            		"Cargo do funcionario: " + this.cargo + "<br />" +
            		"Endereco do funcionario: " + this.endereco + "<br />" +
            		"Telefone do funcionario: " + this.telefone + "</html>";
    	}
    }
    
    public void Editar(Funcionario novosDados) {
        //Nome
        if(novosDados.getNome() != null){
            this.nome = novosDados.getNome();
        }
        //Codigo identificador
        if(novosDados.getId() != -1){
            this.id = novosDados.getId();
        }
        //Cargo
        if(novosDados.getCargo() != null){
            this.cargo = novosDados.getCargo();
        }
        //Endereco
        if(novosDados.getEndereco() != null){
            this.endereco = novosDados.getEndereco();
        }
        //Telefone
        if(novosDados.getTelefone() != null){
            this.telefone = novosDados.getTelefone();
        }
    }

    //Getters
    @Override
    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
    public String getCargo(){
        return this.cargo;
    }
    @Override
    public String getEndereco(){
        return this.endereco;
    }
    @Override
    public String getTelefone(){
        return this.telefone;
    }
    //Setters
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    @Override
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    @Override
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}