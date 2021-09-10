package Sistema;

import java.util.Scanner;

public class Brinquedo {
    private Scanner scan = new Scanner(System.in);
    private String nome, marca, categoria;
    private double precoUnitario;
    private int idadeIndicada, quantidade, codigoIdentificador;

    public String toString(){
        return  "=================================================\n"+
                "Nome do brinquedo: " +this.nome+ "\n"+
                "Marca: " +this.marca+ "\n"+
                "Categoria:" +this.categoria+ "\n"+
                "Preco unitario: " +this.precoUnitario+ "\n"+
                "Idade indicativa: " +this.idadeIndicada+ "\n"+
                "Quantidade em estoque: " +this.quantidade+ "\n"+
                "Codigo identificador: " +this.codigoIdentificador+ "\n";
    }

    public void Cadastrar(){
        //Nome
        System.out.print("Digite o nome do brinquedo: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Marca
        System.out.print("Digite a marca do brinquedo: ");
        String m = scan.nextLine();
        this.setMarca(m);
        //Categoria
        System.out.print("Digite a categoria do brinquedo: ");
        String c = scan.nextLine();
        this.setCategoria(c);
        //Preço unitário
        System.out.print("Digite o preco unitario do brinquedo: ");
        double p = scan.nextDouble();
        scan.nextLine();
        this.setPreco(p);
        //Idade indicativa
        System.out.print("Digite a idade indicada para o uso do brinquedo: ");
        int i = scan.nextInt();
        scan.nextLine();
        this.setIdade(i);
        //Código identificador
        System.out.print("Digite o código identificador do brinquedo: ");
        int cid = scan.nextInt();
        scan.nextLine();
        this.setCid(cid);
    }

    public void Visualizar(){
        System.out.println(this);
    }

    public void Editar(){
        System.out.println("Dados anteriores");
        this.Visualizar();
        //Nome
        System.out.print("Digite o novo nome do brinquedo: ");
        String n = scan.nextLine();
        this.setNome(n);
        //Marca
        System.out.print("Digite a nova marca do brinquedo: ");
        String m = scan.nextLine();
        this.setMarca(m);
        //Categoria
        System.out.print("Digite a nova categoria do brinquedo: ");
        String c = scan.nextLine();
        this.setCategoria(c);
        //Preço unitário
        System.out.print("Digite o novo preco unitario do brinquedo: ");
        double p = scan.nextDouble();
        scan.nextLine();
        this.setPreco(p);
        //Idade indicativa
        System.out.print("Digite a nova idade indicada para o uso do brinquedo: ");
        int i = scan.nextInt();
        scan.nextLine();
        this.setIdade(i);
        //Código identificador
        System.out.print("Digite o novo código identificador do brinquedo: ");
        int cid = scan.nextInt();
        scan.nextLine();
        this.setCid(cid);
    }

    public void Deletar(){
        //Procurar como deletar
        System.out.println("Método ainda não implementado");
    }

    //Getters e Setters
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

    public double getCid(){
        return this.codigoIdentificador;
    }

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

    public void setCid(int cid){
        this.codigoIdentificador = cid;
    }
}
