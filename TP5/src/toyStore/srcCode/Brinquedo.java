package toyStore.srcCode;

import toyStore.GUI.*;

public class Brinquedo implements Cloneable{
    private String nome, marca, categoria;
    private double precoUnitario;
    private int idadeIndicada, quantidade, id;

    //Alteração do construtor {new} de brinquedo
    public Brinquedo(String nome, String marca, String categoria,
                        double precoUnit, int idadeInd, int quant, int id){
        //No caso de Brinquedo, não existem dados desnecessários.
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.precoUnitario = precoUnit;
        this.idadeIndicada = idadeInd;
        this.quantidade = quant;
        this.id = id;
    }
    
    //Clonar Brinquedo
    @Override
    public Brinquedo clone() throws CloneNotSupportedException{
        try {
            return (Brinquedo) super.clone();
        } catch(CloneNotSupportedException e){
            return this;
        }
        
    }

    //Visualizar o Brinquedo
    public String toString(){
        return  "Nome do brinquedo: " +this.nome+ "\n"+
                "Marca: " +this.marca+ "\n"+
                "Categoria: " +this.categoria+ "\n"+
                "Preco unitario: " +this.precoUnitario+ "\n"+
                "Idade indicativa: " +this.idadeIndicada+ "\n"+
                "Quantidade: " +this.quantidade+ "\n"+
                "Codigo identificador: " +this.id+ "\n";
    }

    //Edição dos dados cadastrados
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