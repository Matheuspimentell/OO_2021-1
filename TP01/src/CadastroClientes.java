import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        int numeroClientes;
        do{
            System.out.print("\t----Menu de opcões----\n\n");
            System.out.print("\t1. Cadastrar clientes\n");
            System.out.print("\t2. Buscar cliente\n");
            System.out.print("\t3. Cadastrar produtos\n");
            System.out.print("\t4. Buscar produto\n");
            System.out.print("\t5. Cadastrar uma venda\n");
            System.out.print("\t6. Mostrar produtos em estoque\n");
            System.out.print("\t0. Sair do sistema\n");
            System.out.print("\t\nDigite a opção desejada: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1 -> {
                    // Pedir número de clientes que o usuário deseja cadastrar
                    System.out.print("\t\nQuantos clientes deseja cadastrar ?\n");
                    numeroClientes = ler.nextInt();
                    ler.nextLine();
                    // Cadastro do cliente base:
                    String[] nomes = new String[numeroClientes + 1];
                    String[] enderecos = new String[numeroClientes + 1];
                    int[] telefones = new int[numeroClientes + 1];
                    nomes[0] = "Matheus Pimentel Leal";
                    enderecos[0] = "Brasília-DF, Asa Sul";
                    telefones[0] = 995627819;
                    //Preenchimento dos vetores com os respectivos clientes
                    for (int i = 1; i <= numeroClientes; i++){
                        System.out.println("\n\tDigite o nome do " + i + "° cliente:\n");
                        nomes[i] = ler.nextLine();

                        System.out.println("\n\tDigite o endereço do " + i + "° cliente:\n");
                        enderecos[i] = ler.nextLine();

                        System.out.println("\n\tDigite o telefone do " + i + "° cliente:\n");
                        telefones[i] = ler.nextInt();
                        ler.nextLine();
                    }
                    System.out.println("\t\n" + nomes[1] + "\n");
                    System.out.println("\t\n" + enderecos[1] + "\n");
                    System.out.println("\t\n" + telefones[1] + "\n");
                }
                case 2 -> System.out.print("\tVocê selecionou a opção 2!\n");
                case 3 -> System.out.print("\tVocê selecionou a opção 3!\n");
                case 4 -> System.out.print("\tVocê selecionou a opção 4!\n");
                case 5 -> System.out.print("\tVocê selecionou a opção 5!\n");
                case 6 -> System.out.print("\tVocê selecionou a opção 6!\n");
                case 0 -> System.out.print("\t\nSaindo do programa...\n\n");
                default -> System.out.print("\t\nOpção incorreta, digite uma opção válida.\n\n");
            }
        } while (opcao != 0);
    }
}
