package Sistema;

public class Principal {

    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Cleiton", 0001, "Gerente de vendas");
        System.out.println("Visualizar 1:");
        funcionario.Visualizar();
        System.out.println("Editar 1:");
        funcionario.Editar();
        System.out.println("Visualizar 2:");
        funcionario.Visualizar();
        System.out.println("Cadastrar 1:");
        funcionario.Cadastrar();
        System.out.println("Editar 2:");
        funcionario.Editar();
        System.out.println("Cadastrar 2:");
        funcionario.Cadastrar();
        System.out.println("Dados finais do funcionario:");
        System.out.println(funcionario);
    }
}