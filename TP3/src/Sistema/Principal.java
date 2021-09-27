package Sistema;


public class Principal {

    public static void main(String[] args){
        Sistema sys = new Sistema();
        Cliente cliente = new Cliente("Reginaldo", "053.721.701-07");
        Brinquedo brinquedo = new Brinquedo("Hot Wheels", "Mattel", "Carrinho", 19.90, 8, 10, 123);
        Funcionario funcionario = new Funcionario("Cleiton", 100, "Vendedor");
        sys.getLoja().setFuncionario(funcionario); //Adiciona o funcionario à lista de funcionarios
        sys.getLoja().setBrinquedo(brinquedo); //Adiciona o brinquedo ao estoque
        sys.setCliente(cliente); //Adiciona o cliente à lista de clientes
        
        
    }
}