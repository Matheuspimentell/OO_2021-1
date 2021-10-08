package toyStore.srcCode;

/**
 * Objeto Funcionario.
 * 
 * Um objeto que define os parametros e funcionalidades de um Funcionario.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * @version 1.0
 * */

public class Funcionario extends Pessoa{
	
	/**
	 * Parametros uteis para um Funcionario.
	 * */
    private int id;
    private String cargo;

    /**
     * Construtor padrao de Funcionario
     * 
     * @param nome Nome do funcionario.
     * @param id Codigo identificador do funcionario.
     * @param cargo Cargo ocupado pelo funcionario na loja.
     * */
    public Funcionario(String nome, int id, String cargo){
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
    }
    
    /**
     * Sobrescrcao do metodo toString
     * 
     * @return String contendo os dados do funcionario
     * */
    public String toString(){
        return  "Nome do funcionario: " + this.nome+ "\n" +
                "ID do funcionario: " + this.id+ "\n" +
                "Cargo do funcionario: " + this.cargo + "\n" +
                "Endereco do funcionario: " + this.endereco + "\n" +
                "Telefone do funcionario: " + this.telefone + "\n" ;
    }

    /**
     * Visualizacao dos dados cadastrados do funcionario.
     * 
     * @return String contendo os dados cadastrados do funcionario
     * */
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
    
    /**
     * Edita os dados de um funcionario
     * 
     * @param novosDados Objeto Funcionario contendo os dados atualizados.
     * */
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