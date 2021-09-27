package Sistema;

import java.util.Scanner;

public class Brinquedo implements Cloneable{
    private Scanner scan = new Scanner(System.in);
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
        return (Brinquedo) super.clone();
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
    public void Editar(){
        //Dados anteriores
        System.out.println("Dados anteriores");
        System.out.println(this);
        System.out.println("-----------------------------------------------------");
        //Nome
        System.out.print("Digite o novo nome do brinquedo: ");
        String nome = scan.nextLine();
        this.nome = nome;
        //Marca
        System.out.print("Digite a nova marca do brinquedo: ");
        String marca = scan.nextLine();
        this.marca = marca;
        //Categoria
        System.out.print("Digite a nova categoria do brinquedo: ");
        String categoria = scan.nextLine();
        this.categoria = categoria;
        //Preço unitário
        System.out.print("Digite o novo preco unitario do brinquedo: ");
        double precoUnitario = scan.nextDouble();
        scan.nextLine();
        this.precoUnitario = precoUnitario;
        //Idade indicativa
        System.out.print("Digite a nova idade indicada para o uso do brinquedo: ");
        int idade = scan.nextInt();
        scan.nextLine();
        this.idadeIndicada = idade;
        //Código identificador
        System.out.print("Digite o novo código identificador do brinquedo: ");
        int id = scan.nextInt();
        scan.nextLine();
        this.id = id;
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