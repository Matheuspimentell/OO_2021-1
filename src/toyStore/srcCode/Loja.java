package toyStore.srcCode;

import java.util.ArrayList;

/**
 * Objeto Loja
 * 
 * Um objeto que define os parametros e funcionalidades de uma Loja.
 * 
 * @author Matheus Pimentel Leal
 * @author Luana de Lima Medeiros
 * */

public class Loja extends Pessoa{
	
	/**
	 * Parametros uteis para uma loja.
	 * */
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Brinquedo> estoque;
    private String dadosLoja;

    /**
     * Construtor padrao de Loja.
     * 
     * @param nome O nome da Loja.
     * @param endereco O endereco da Loja.
     * @param cnpj O CNPJ da Loja.
     * */
    public Loja(String nome, String endereco, String cnpj){
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.estoque = new ArrayList<Brinquedo>();
        this.funcionarios = new ArrayList<Funcionario>();

        /**
         * Adicao de 10 funcionarios para facilitar testes.
         * */
        Funcionario funcionario1 = new Funcionario("Laura Maya Farias", 96234, "Gerente de Vendas");
        this.funcionarios.add(funcionario1);
        Funcionario funcionario2 = new Funcionario("Nicole Benedita", 39605, "Vendedor");
        this.funcionarios.add(funcionario2);
        Funcionario funcionario3 = new Funcionario("LuÃ­s TomÃ¡s", 11694, "Vendedor");
        this.funcionarios.add(funcionario3);
        Funcionario funcionario4 = new Funcionario("Francisco Miguel", 70384, "Vendedor");
        this.funcionarios.add(funcionario4);
        Funcionario funcionario5 = new Funcionario("Diego Juan", 68072, "Vendedor");
        this.funcionarios.add(funcionario5);
        Funcionario funcionario6 = new Funcionario("LuÃ­s Vitor", 97035, "Vendedor");
        this.funcionarios.add(funcionario6);
        Funcionario funcionario7 = new Funcionario("Leonardo Kaique", 58719, "Vendedor");
        this.funcionarios.add(funcionario7);
        Funcionario funcionario8 = new Funcionario("Brenda Daniela", 46712, "Vendedor");
        this.funcionarios.add(funcionario8);
        Funcionario funcionario9 = new Funcionario("Heitor Raul", 82053, "Vendedor");
        this.funcionarios.add(funcionario9);
        Funcionario funcionario10 = new Funcionario("Isabel Simone", 79658, "Vendedor");
        this.funcionarios.add(funcionario10);

        /**
         * Adicao de 5 brinquedos no estoque para facilitar testes.
         * */
        Brinquedo brinquedo1 = new Brinquedo("Boneca Barbie - Diversao na Praia",
         "Brabie", "Boneca", 38.99, 3, 20, 354);
        this.estoque.add(brinquedo1);
        Brinquedo brinquedo2 = new Brinquedo("Jogo Pula Macaco",
         "Estrela", "Tabuleiro", 64.99, 5, 15, 490);
        this.estoque.add(brinquedo2);
        Brinquedo brinquedo3 = new Brinquedo("Pista Hot Wheels - Track Set",
         "Hot Wheels", "Carros", 649.99, 8, 16, 291);
        this.estoque.add(brinquedo3);
        Brinquedo brinquedo4 = new Brinquedo("Celular Musical",
         "Estrela", "Musical", 58.99, 1, 8, 645);
        this.estoque.add(brinquedo4);
        Brinquedo brinquedo5 = new Brinquedo("Baby Alive - Lanchinhos Divertidos",
         "Baby Alive", "Boneca", 278.99, 8, 24, 463);
        this.estoque.add(brinquedo5);
    }

    /**
     * Sobrescrcao do metodo toString.
     * 
     * @return String contendo os dados da loja.
     * */
    public String toString(){
        return "Nome da loja: " + this.nome + "\n" +
                "CNPJ da loja: " + this.cnpj + "\n" +
                "Endereco da loja: " + this.endereco + "\n" +
                "Telefone da loja: " + this.telefone;
    }

    /**
     * Visualizacao apenas dos dados cadastrados da Loja.
     * 
     * @return String contendo os dados da loja.
     * */
    @Override
    public String Visualizar() {
        String dadosTelefone = "";
        if(this.telefone != null){
            dadosTelefone = "Telefone da loja: " + this.telefone;
        }
        dadosLoja = "<html>Nome da loja: " + this.nome + "<br /><br />" + 
        "CNPJ da loja: " + this.cnpj + "<br /><br />" + 
        "Endereco da loja: " + this.endereco + "<br /><br />" +
        dadosTelefone + "</html>";

        return dadosLoja;
    }
    
    /**
     * Edicao dos dados da Loja.
     * 
     * @param nome Nome da Loja.
     * @param endereco Endereco da Loja.
     * @param cnpj CNPJ da Loja
     * @param telefone Telefone da Loja
     * */
    public void Editar(String nome, String endereco, String cnpj, String telefone) {
        //Nome
        if(nome != null){
            this.nome = nome;
        }
        //Endereco
        if(endereco != null){
            this.endereco = endereco;
        }
        //CNPJ
        if(cnpj != null){
            this.cnpj = cnpj;
        }
        //Telefone
        if(telefone != null){
            this.telefone = telefone;
        }
    }
    
    
    /**
     * Delecao do cadastro de um Funcionario do ArrayList de funcionarios.
     * 
     * @param id ID do funcionario a ser retirado.
     * @return Um boolean caso a delecao tenha sido feita com sucesso Ex.: sucesso = true | falha = false.
     * */
    public boolean DeletarFuncionario(int id){
        for (Funcionario funcionario : this.funcionarios){
            if(funcionario.getId() == id){
                this.funcionarios.remove(funcionario);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca por um funcionario no ArrayList de funcionarios.
     * 
     * @param id ID do funcionario a ser buscado.
     * @return Retorna o funcionario encontrado ou null caso não encontrado.
     * */
    public Funcionario BuscarFuncionario(String id){
       int procurarId = Integer.parseInt(id);
       for(Funcionario funcionario : this.funcionarios) {
    	   if(procurarId == funcionario.getId()) {
    		   return funcionario;
    	   }
       }
       return null;
    }
    
    /**
     * Visualiza todos os funcionarios cadastrados.
     * */
    public void VisualizarFuncionarios(){
        if(this.funcionarios != null){
            for(Funcionario funcionario : this.funcionarios){
                funcionario.Visualizar();
            }
        } else {
            System.out.println("Nao ha funcionarios cadastrados.");
        }
    }    
    
    /**
     * Deletar um brinquedo do ArrayList de brinquedos.
     * 
     * @param cid Codigo identificador do brinquedo a ser removido.
     * @return Um boolean indicando sucesso ou falha na remocao Ex.: sucesso = true | falha = false.
     * */
    public boolean DeletarBrinquedo(int cid){
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getId() == cid){
                this.estoque.remove(brinquedo);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca por um brinquedo cadastrado.
     * 
     * @param cid Codigo identificador do brinquedo a ser procurado.
     * @return Caso encontrado retorna o objeto Brinquedo. Caso não encontrado retorna null.
     * */
    public Brinquedo BuscarBrinquedo(int cid){
        //Percorrer todo o estoque
        for(Brinquedo brinquedo : this.estoque){
            if(brinquedo.getId() == cid){
                return brinquedo;
            }
        }
        return null;
    }
    
    /**
     * Visualiza o estoque da Loja.
     * 
     * @deprecated
     * */
    public void VisualizarEstoque(){
        //Caso existam brinquedos cadastrados
        if(this.estoque != null){
            System.out.println("-----------------------------------------------------");
            for (Brinquedo brinquedo : this.estoque){
                System.out.println(brinquedo);
                System.out.println("-----------------------------------------------------");
            }
        //Caso contrÃ¡rio
        } else {
            System.out.println("Nao ha itens em estoque.");
        }
    }
    
  /**
   * Adicao de um funcionario no ArrayList de funcionarios.
   * 
   * @param funcionario Objeto Funcionario com dados a serem adicionados.
   * @param endereco Endereco do Funcionario.
   * @param telefone Telefone do Funcionario.
   * */
    public void addFuncionario(Funcionario funcionario, String endereco, String telefone){
        if(endereco != null){
            funcionario.setEndereco(endereco);
        }
        if(telefone != null){
            funcionario.setTelefone(telefone);
        }
        //Adiciona 1 funcionÃ¡rio na loja
        this.funcionarios.add(funcionario);
    }
    //Cadastro de 1 brinquedo no estoque
    public void addBrinquedo(Brinquedo brinquedo){
        //Adiciona 1 brinquedo no estoque
        this.estoque.add(brinquedo);
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
    public String getCnpj(){
        return this.cnpj;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        //Retornar o ArrayList de funcionÃ¡rios da loja
        return this.funcionarios;
    }
    public ArrayList<Brinquedo> getEstoque(){
        //Retornar o ArrayList dos brinquedos
        return this.estoque;
    }
    //Setters
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
    public void setCnpj(String c){
        this.cnpj = c;
    }
}
