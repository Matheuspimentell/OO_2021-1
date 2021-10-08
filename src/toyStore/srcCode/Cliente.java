package toyStore.srcCode;

import java.util.ArrayList;

/**
 * Um objeto Cliente.
 * 
 * Um objeto que define os parametros e funcionalidades de um Cliente.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */
public class Cliente extends Pessoa implements Cloneable{
	
	/**
	 * Parametros uteis para um Cliente.
	 * */
    private String cpf;
    private ArrayList<Brinquedo> carrinho;   
    
    /**
     * Construtor padrao de Cliente.
     * 
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * */
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.carrinho = new ArrayList<Brinquedo>();
    }
    
    /**
     * Sobrescricao do metodo toString.
     * */
    public String toString(){
        return "Nome do cliente: " +this.nome+ "\n" +
               "CPF do cliente: " +this.cpf+ "\n" +
               "Endereco do cliente: " +this.endereco+ "\n" +
               "Telefone do cliente: " +this.telefone+ "\n";
    }

    /**
     * Edita os dados do cliente.
     * 
     * @param novosDados Objeto Cliente contendo os dados atualizados.
     * */
    public void Editar(Cliente novosDados) {
        //Nome
        if(novosDados.getNome() != null){
            this.nome = novosDados.getNome();
        }
        //CPF
        if(novosDados.getCpf() != null){
            this.cpf = novosDados.getCpf();
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

    /**
     * Metodo Visualizar.
     * 
     * @return Os dados atualmente cadastrados de um cliente.
     * */
    @Override
    public String Visualizar() {
    	if(this.telefone == null && this.endereco == null) {
    		return "<html>Nome do cliente: " + this.nome + "<br />" +
            		"CPF do cliente: " + this.cpf + "<br />" +
            		"Telefone do cliente: " + "" + "<br />" +
            		"Endereco do cliente: " + "" + "</html>";
    	} else if(this.telefone != null && this.endereco == null) {
    		return "<html>Nome do cliente: " + this.nome + "<br />" +
            		"CPF do cliente: " + this.cpf + "<br />" +
            		"Telefone do cliente: " + this.telefone + "<br />" +
            		"Endereco do cliente: " + "" + "</html>";
    	} else if(this.telefone == null && this.endereco != null) {
    		return "<html>Nome do cliente: " + this.nome + "<br />" +
            		"CPF do cliente: " + this.cpf + "<br />" +
            		"Telefone do cliente: " + "" + "<br />" +
            		"Endereco do cliente: " + this.endereco + "</html>";
    	} else {
    		return "<html>Nome do cliente: " + this.nome + "<br />" +
            		"CPF do cliente: " + this.cpf + "<br />" +
            		"Telefone do cliente: " + this.telefone + "<br />" +
            		"Endereco do cliente: " + this.endereco + "</html>";
    	}
    }
    
    /**
     * Busca de um item no carrinho de compras do cliente.
     * 
     * @param id O codigo identificador do brinquedo a ser procurado
     * @return O objeto encontrado, caso não encontrado retorna null 
     * */
    public Brinquedo BuscaItem(int id) {
    	for(Brinquedo brinquedo : this.getCarrinho()) {
    		if(brinquedo.getId() == id) {
    			return brinquedo;
    		}
    	}
    	return null;
    }
    
    /**
     * Adicao de um item no carrinho de compras do cliente
     * 
     * @param brinquedo Item a ser adicionado.
     * @param quantidade Quantidade do item a ser adicionado ao carrinho de compras.
     * */
    public void AdicionaItem(Brinquedo brinquedo, int quantidade){
        if(brinquedo != null){
            brinquedo.setQuantidade(quantidade);
            this.carrinho.add(brinquedo);
        }
    }
    
    /**
     * Remocao de um item do carrinho de compras do cliente
     * 
     * @param id O codigo identificador do brinquedo a ser removido do carrinho
     * @return Retorna um boolean indicando a remocao com sucesso: true = sucesso | false = falha
     * */
    public boolean removeItem(int id) {
    	for(Brinquedo brinquedo : this.getCarrinho()) {
    		if(brinquedo.getId() == id) {
    			this.getCarrinho().remove(brinquedo);
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Visualizacao do carrinho de compras do cliente
     * 
     * @deprecated
     * */
    public void VisualizarCarrinho(){
        for(Brinquedo brinquedo : this.carrinho){
            System.out.println(brinquedo.getId() + " " + brinquedo.getNome() +
                               " " + brinquedo.getQuantidade() + " * " + brinquedo.getPreco() +
                               " (" + brinquedo.getQuantidade()*brinquedo.getPreco() + ")");
        }
    }
    
    /**
     * Remocao de todos os itens do carrinho de compras de um cliente
     * */
    public void LimpaCarrinho() {
    	for(int i = 0; i < this.carrinho.size(); i++) {
    		this.carrinho.remove(0);
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
    public ArrayList<Brinquedo> getCarrinho(){
        return this.carrinho;
    }
    /**
     * Retorna o valor total em compras do cliente
     * 
     * @return O valor total de itens comprados pelo cliente
     * */
    public double getTotalCompras(){
        double valorTotal = 0.00;
        for(Brinquedo brinquedo : this.carrinho){
            valorTotal = valorTotal + (brinquedo.getQuantidade()*brinquedo.getPreco());
        }
        return valorTotal;
    }
    //Setters
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    @Override
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setCarrinho(ArrayList<Brinquedo> carrinho){
        this.carrinho = carrinho;
    }
}