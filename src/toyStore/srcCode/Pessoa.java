package toyStore.srcCode;

/**
 * Classe abstrata "Pessoa".
 * 
 * Classe abstrata para utilizacao em objetos que representam pessoas fisicas e juridicas.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * @version 1.0
 * */
abstract class Pessoa {
	
	/**
	 * @param nome O nome da pessoa
	 * @param endereco O endereco da pessoa
	 * @param telefone O telefone da pessoa 
	 * */
    protected String nome, endereco, telefone;

    /**
     * Funcao de visualizacao que todas as classes filhas sobrescrevem.
     * */
    abstract public String Visualizar();

    //Setters
    abstract public void setNome(String nome);
    abstract public void setEndereco(String endereco);
    abstract public void setTelefone(String telefone);
    //Getters
    abstract public String getNome();
    abstract public String getEndereco();
    abstract public String getTelefone();
}
