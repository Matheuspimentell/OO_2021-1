package Sistema;

public class Principal {

    public static void main(String[] args){
        Loja loja = new Loja("Toy Store", "Taguatinga", "32.988.686/0001-67");
        System.out.println("Visualizar 1:");
        loja.Visualizar();
        System.out.println("Visualizar Estoque 1:");
        loja.VisualizarEstoque();
        System.out.println("Visualizar funcionarios 1:");
        loja.VisualizarFuncionarios();
        System.out.println("Editar 1:");
        loja.Editar();
        System.out.println("Visualizar 2:");
        loja.Visualizar();
        System.out.println("Cadastrar 1:");
        loja.Cadastrar();
        System.out.println("Visualizar 3:");
        loja.Visualizar();
        System.out.println("Editar 2:");
        loja.Editar();
        Brinquedo teste = new Brinquedo("Hot Wheels", "Mattel", "Carrinhos", 19.90, 8, 40, 001);
        loja.setBrinquedo(teste);
        System.out.println("Visualizar Estoque 2:");
        loja.VisualizarEstoque();
        System.out.println("Buscar Brinquedo 1:");
        System.out.println(loja.BuscarBrinquedo()); //Retorna um Brinquedo
        Funcionario novo = new Funcionario("Cleiton", 000, "Gerente de loja");
        loja.setFuncionario(novo);
        System.out.println("Visualizar Funcionarios 2:");
        loja.VisualizarFuncionarios();
        System.out.println("Buscar Funcionario 1:");
        System.out.println(loja.BuscarFuncionario()); //Retorna um funcionario
        System.out.println("Deletar Brinquedo 1: ");
        loja.DeletarBrinquedo();
        System.out.println("Deletar Funcionario 1:");
        loja.DeletarFuncionario();
        System.out.println("Visualizar Estoque 3:");
        loja.VisualizarEstoque();
        System.out.println("Visualizar Funcionarios 3:");
        loja.VisualizarFuncionarios();
        System.out.println("Dados finais da loja:");
        System.out.println(loja);
    }
}