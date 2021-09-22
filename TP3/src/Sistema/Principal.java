package Sistema;

public class Principal {

    public static void main(String[] args){
        Cliente cliente = new Cliente("Matheus Pimentel Leal", "053.721.701-07");
        System.out.println("Funcao Editar 1:");
        cliente.Editar();
        System.out.println("Funcao Visualizar 1:");
        cliente.Visualizar();
        System.out.println("Funcao Cadastrar 1:");
        cliente.Cadastrar();
        System.out.println("Funcao Editar 2:");
        cliente.Editar();
        System.out.println("Funcao Visualizar 2:");
        cliente.Visualizar();
        System.out.println("Funcao Cadastrar 2:");
        cliente.Cadastrar();
        System.out.println("Dados finais:");
        System.out.println(cliente);
    }
}