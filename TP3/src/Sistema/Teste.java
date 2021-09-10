package Sistema;

public class Teste {
    public static void main(String[] args){
        Sistema sys = new Sistema();

        sys.setClientes(); // Inicializa um array que cabem 10 clientes
        sys.getClientes()[0] = new Cliente();
        sys.getClientes()[0].nome = "Jose dos Santos";
        sys.getClientes()[0].endereco = "Lago Sul";
        sys.getClientes()[0].telefone = "61 999999999";
        sys.getClientes()[0].setCpf("012.345.678-90");

        sys.getClientes()[1] = new Cliente();
        sys.getClientes()[1].nome = "Jamilton Borges da Costa";
        sys.getClientes()[1].endereco = "Candangolandia";
        sys.getClientes()[1].telefone = "61 999999998";
        sys.getClientes()[1].setCpf("112.345.678-90");

        sys.getClientes()[2] = new Cliente();
        sys.getClientes()[2].nome = "Barbara Alves Ferreira";
        sys.getClientes()[2].endereco = "Park Way";
        sys.getClientes()[2].telefone = "61 999999997";
        sys.getClientes()[2].setCpf("212.345.678-90");
        sys.setTotalClientes(); // Atualiza o total de clientes cadastrados

        sys.getClientes()[3] = new Cliente();
        sys.getClientes()[3].Cadastrar(); //Pede para cadastrar 1 cliente
        sys.getClientes()[3].Editar(); //Pede para editar 1 cliente
        sys.getClientes()[3].Visualizar(); // Mostra o cliente

        sys.setLoja();
        sys.getLoja().nome = "Brinquedolandia";
        sys.getLoja().endereco = "Conjunto Nacional";
        sys.getLoja().telefone = "61 33333333";
        sys.getLoja().setCnpj("123.465.798.78-1");
        sys.getLoja().getFuncionarios()[0] = new Funcionario();
        sys.getLoja().getFuncionarios()[0].nome = "Cleiton";
        sys.getLoja().getFuncionarios()[0].setCid(15324687);
        sys.getLoja().getFuncionarios()[0].setCargo("Porteiro");
        sys.getLoja().getFuncionarios()[0].setTelefone("61 986767868");
        sys.getLoja().getFuncionarios()[0].setEndereco("Planaltina");
        sys.getLoja().setFuncionarios(); // Pede para cadastrar 1 funcionário
        sys.getLoja().getFuncionarios()[1].Editar(); // Pede para editar 1 funcionario
        sys.getLoja().getFuncionarios()[1].Visualizar(); // Pede para editar 1 funcionario
        sys.getLoja().getEstoque()[0] = new Brinquedo();
        sys.getLoja().getEstoque()[0].setNome("Carrinho Hot Wheels");
        sys.getLoja().getEstoque()[0].setMarca("Mattel");
        sys.getLoja().getEstoque()[0].setCategoria("Carrinho de brinquedo");
        sys.getLoja().getEstoque()[0].setPreco(21.90);
        sys.getLoja().getEstoque()[0].setIdade(10);
        sys.getLoja().getEstoque()[0].setQuantidade(10);
        sys.getLoja().getEstoque()[0].setCid(123456567);
        sys.getLoja().setEstoque(); // Pede para cadastrar 1 brinquedo
        sys.getLoja().getEstoque()[1].Editar(); // Pede para editar 1 brinquedo
        sys.getLoja().getEstoque()[1].Visualizar(); // Pede para editar 1 brinquedo

        sys.BuscarCliente("212.345.678-90");
    }
}