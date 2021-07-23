import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do{
            System.out.print("\t----Menu de opcões----\n\n");
            System.out.print("\t1. Cadastrar clientes\n");
            System.out.print("\t2. Buscar cliente\n");
            System.out.print("\t3. Cadastrar produtos\n");
            System.out.print("\t4. Buscar produto\n");
            System.out.print("\t5. Cadastrar uma venda\n");
            System.out.print("\t6. Mostrar produtos em estoque\n");
            System.out.print("\t0. Sair do sistema\n");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("\tVocê selecionou a opção 1!\n");
                    break;
                case 2:
                    System.out.print("\tVocê selecionou a opção 2!\n");
                    break;
                case 3:
                    System.out.print("\tVocê selecionou a opção 3!\n");
                    break;
                case 4:
                    System.out.print("\tVocê selecionou a opção 4!\n");
                    break;
                case 5:
                    System.out.print("\tVocê selecionou a opção 5!\n");
                    break;
                case 6:
                    System.out.print("\tVocê selecionou a opção 6!\n");
                    break;
                case 0:
                    System.out.print("\tSaindo do programa...\n\n");
                    break;
                default:
                    System.out.print("\tOpção incorreta, digite uma opção válida.\n\n");
                    break;
            }
        } while (opcao != 0);
    }
}
