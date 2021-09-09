package Sistema;

public class Teste {
    public static void main(String[] args){
        Cliente cleiton = new Cliente();
        Funcionario cleitonjr = new Funcionario();
        Loja cleitons = new Loja();

        cleiton.Cadastrar();
        cleitonjr.Cadastrar();
        cleitons.Cadastrar();

        System.out.println(cleiton);
        System.out.println(cleitonjr);
        System.out.println(cleitons);

        cleiton.Editar();
        cleitonjr.Editar();
        cleitons.Editar();

        cleiton.Visualizar();
        cleitonjr.Visualizar();
        cleitons.Visualizar();
    }
}
