package toyStore.srcCode;

/**
 * Objeto Brinquedo.
 * 
 * Um objeto que define os parametros e funcionalidades de um Brinquedo.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * @version 1.0
 * @see https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Cloneable.html
 * */

public class Brinquedo implements Cloneable{
	
	/**
	 * Parametros uteis para um brinquedo em estoque ou no carrinho de compras de um cliente
	 * */
    private String nome, marca, categoria;
    private double precoUnitario;
    private int idadeIndicada, quantidade, id;

    /**
     * Construtor padrao de Brinquedo
     * 
     * @param nome Nome do brinquedo
     * @param marca Marca do brinquedo
     * @param categoria Categoria do brinquedo
     * @param precoUnit Preco por unidade do brinquedo
     * @param idadeInd Idade indicativa do brinquedo, Ex.: Recomendado para <strong>8</strong> ou mais anos de idade
     * @param quant Quantidade em estoque do brinquedo
     * @param id Codigo identificador do brinquedo
     * */
    public Brinquedo(String nome, String marca, String categoria,
                        double precoUnit, int idadeInd, int quant, int id){
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.precoUnitario = precoUnit;
        this.idadeIndicada = idadeInd;
        this.quantidade = quant;
        this.id = id;
    }
    
    /**
     * Clonar um brinquedo.
     * 
     * Metodo utilizado para transferir dados de um Objeto Brinquedo outro sem ligacao entre os dois.
     * 
     * @return Clone do Objeto Brinquedo
     * @see https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Cloneable.html
     * @throws CloneNotSupportedException
     * */
    @Override
    public Brinquedo clone() throws CloneNotSupportedException{
        try {
            return (Brinquedo) super.clone();
        } catch(CloneNotSupportedException e){
            return null;
        }
        
    }

    /**
     * Sobrescricao do metodo toString.
     * 
     * @return String contendo todos os dados do Brinquedo.
     * */
    public String toString(){
        return  "Nome do brinquedo: " +this.nome+ "\n"+
                "Marca: " +this.marca+ "\n"+
                "Categoria: " +this.categoria+ "\n"+
                "Preco unitario: " +this.precoUnitario+ "\n"+
                "Idade indicativa: " +this.idadeIndicada+ "\n"+
                "Quantidade: " +this.quantidade+ "\n"+
                "Codigo identificador: " +this.id+ "\n";
    }

    /**
     * Editar dados de um Brinquedo
     * 
     * @param novosDados Objeto Brinquedo contendo os dados atualizados.
     * */
    public void Editar(Brinquedo novosDados){
        //Nome
        if(novosDados.getNome() != null){
            this.nome = novosDados.getNome();
        }
        //Marca
        if(novosDados.getMarca() != null){
            this.marca = novosDados.getMarca();
        }
        //Categoria
        if(novosDados.getCategoria() != null){
            this.categoria = novosDados.getCategoria();
        }
        //Preço unitário
        if(novosDados.getPreco() != -1.0){
            this.precoUnitario = novosDados.getPreco();
        }
        //Idade indicativa
        if(novosDados.getIdade() != -1){
            this.idadeIndicada = novosDados.getIdade();
        }
        //Quantidade em estoque
        if(novosDados.getQuantidade() != -1){
            this.quantidade = novosDados.getQuantidade();
        }
        //Código identificador
        if(novosDados.getId() != -1){
            this.id = novosDados.getId();
        }
    }

    //Getters
    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public double getPreco(){
        return this.precoUnitario;
    }
    public int getIdade(){
        return this.idadeIndicada;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public int getId(){
        return this.id;
    }
    //Setters
    public void setNome(String n){
        this.nome = n;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public void setCategoria(String c){
        this.categoria = c;
    }
    public void setPreco(double p){
        this.precoUnitario = p;
    }
    public void setIdade(int i){
        this.idadeIndicada = i;
    }
    public void setQuantidade(int q){
        this.quantidade = q;
    }
    public void setId(int id){
        this.id = id;
    }
}