package sistema;

import java.util.Scanner;
import java.util.Arrays;

public class Cliente {
    String nome;
    String endereco;
    String telefone;
    public static Cliente[] Cadastro(Cliente[] dados){
        int numeroClientes;
        Scanner ler = new Scanner(System.in);
        System.out.print("\n\tInforme o número de clientes que deseja cadastrar: ");
        numeroClientes = ler.nextInt();
        ler.nextLine();
        //Criar Array de novos clientes para inserção correta dos dados
        Cliente[] novos;
        //Copiar o conteúdo do banco de dados para o Array de novos clientes
        novos = Arrays.copyOf(dados, (numeroClientes + dados.length));
        for (int i = 0; i < numeroClientes; i++){
            //Preenchimento do novo Array com os dados desejados
            novos[i + dados.length] = new Cliente();
            System.out.print("\n\t---------------------------------------\n");
            System.out.print("\tInforme o nome do " + (i+1) + "° cliente: ");
            novos[i + dados.length].nome = ler.nextLine();
            System.out.print("\tInforme o endereco do " + (i+1) + "° cliente: ");
            novos[i + dados.length].endereco = ler.nextLine();
            System.out.print("\tInforme o telefone do " + (i+1) + "° cliente: ");
            novos[i + dados.length].telefone = ler.nextLine();
            System.out.print("\t---------------------------------------\n");
        }
        System.out.print("\tPressione enter para retornar ao menu...\n");
        ler.nextLine();
        System.out.print("\t=======================================\n\n");
        //Copiando os novos dados gerados para o banco de dados geral
        return novos;
    }
    public static Cliente[] Busca(Cliente[] dados){
        Scanner ler = new Scanner(System.in);
        String nome;
        Cliente[] novo = Arrays.copyOf(dados, dados.length);
        System.out.print("\n\t=======================================\n\n");
        System.out.print("\tDigite o nome do cliente que deseja procurar: ");
        nome = ler.nextLine();
        for (int j = 0; j < novo.length; j++) {
            if (novo[j].nome.equals(nome)) {
                //Cliente encontrado, mostrar dados
                System.out.print("\n\tCliente encontrado.");
                System.out.print("\n\t========== Dados do Cliente ===========\n");
                System.out.println("\tNome: " + novo[j].nome + "\n");
                System.out.println("\tEndereço: " + novo[j].endereco + "\n");
                System.out.println("\tTelefone: " + novo[j].telefone);
                System.out.print("\t---------------------------------------\n");
                //Opção de alterar cadastro
                char opcao;
                System.out.print("\tDeseja alterar o cadastro do cliente acima ?\n");
                System.out.print("\tDigite 'S' para alterar ou 'N' para não alterar\n\t");
                opcao = ler.next().charAt(0);
                ler.nextLine();
                if (opcao == 's' || opcao == 'S'){
                    System.out.print("\n\t=======================================\n\n");
                    System.out.print("\tDigite o novo endereço: ");
                    novo[j].endereco = ler.nextLine();
                    System.out.print("\tDigite o novo telefone: ");
                    novo[j].telefone = ler.nextLine();
                    System.out.print("\n\tCadastro alterado com sucesso.\n");
                }
                System.out.print("\t---------------------------------------\n");
                System.out.print("\tPressione enter para retornar ao menu...\n\t");
                ler.nextLine();
                break;
            } else if (j == novo.length - 1 && !(novo[j].nome.equals(nome))) {
                System.out.print("\n\tCliente não cadastrado.\n");
            }
        }
        System.out.print("\t=======================================\n\n");
        return novo;
    }
}
