package sistema;

import java.util.Scanner;

public class Cadastrador {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        int numeroClientes;
        Cliente[] dados = new Cliente[1];
        dados[0] = new Cliente();
        dados[0].nome = "Matheus Pimentel Leal";
        dados[0].endereco = "Asa sul, Brasília";
        dados[0].telefone = "61 995767733";
        do{
            System.out.print("\t========== Sistema de vendas ==========\n");
            System.out.print("\n\t1. Cadastrar Cliente\n");
            System.out.print("\t2. Busca por Cliente\n");
            System.out.print("\t3. Cadastrar Produto\n");
            System.out.print("\t4. Busca por Produto\n");
            System.out.print("\t5. Registrar Venda\n");
            System.out.print("\t6. Mostrar Estoque\n\n");
            System.out.print("\t0. Sair do programa\n");
            System.out.print("\t=======================================\n");
            System.out.print("\tInforme a opção desejada: ");
            opcao = ler.nextInt();
            switch(opcao){
                case 1->{
                    //Cadastro de cliente
                    System.out.print("\n\tInforme o número de clientes que deseja cadastrar: ");
                    numeroClientes = ler.nextInt();
                    ler.nextLine();
                    Cliente[] novos = new Cliente[numeroClientes];
                    for (int i = 0; i < numeroClientes; i++){
                        novos[i] = new Cliente();
                        System.out.print("\tInforme o nome do " + (i+1) + "° cliente: ");
                        novos[i].nome = ler.nextLine();
                        System.out.print("\tInforme o endereco do " + (i+1) + "° cliente: ");
                        novos[i].endereco = ler.nextLine();
                        System.out.print("\tInforme o telefone do " + (i+1) + "° cliente: ");
                        novos[i].telefone = ler.nextLine();
                        System.out.print("\n\n");
                    }
                    System.out.print("\t=======================================\n");
                }
                case 2->{
                    //Busca pelo nome do cliente
                }
                case 3->{
                    //Cadastro de produto
                }
                case 4->{
                    //Busca pelo nome do produto
                }
                case 5->{
                    //Registro de venda
                }
                case 6->{
                    //Amostragem do estoque
                }
            }
        } while(opcao != 0);
    }
}
