package sistema;

import java.util.Arrays;
import java.util.Scanner;

public class Cadastrador {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //Declaração de variáveis
        int opcao;
        int numeroClientes, numeroProdutos;
        //pré cadastro do primeiro cliente
        Cliente[] dados = new Cliente[1];
        dados[0] = new Cliente();
        dados[0].nome = "Diego Silva";
        dados[0].endereco = "Rua das Palmeiras, Casa 90";
        dados[0].telefone = "61 999999999";
        //pré cadastro do primeiro produto
        Produto[] estoque = new Produto[1];
        estoque[0] = new Produto();
        estoque[0].nome = "Vaso de flores";
        estoque[0].descricao = "Vaso de flores com uma imagem de nossa senhora aparecida.";
        estoque[0].valor = 25.99;
        estoque[0].pctLucro = 14.3;
        estoque[0].qtdEstoque = 4;
        do{
            //Impressão do menu na tela
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
                    dados = Arrays.copyOf(novos, novos.length);
                }
                case 2->{
                    //Busca pelo nome do cliente
                    String buscaCliente;
                    System.out.print("\n\t=======================================\n\n");
                    System.out.print("\tDigite o nome do cliente que deseja procurar: ");
                    ler.nextLine();
                    buscaCliente = ler.nextLine();
                    for (int j = 0; j < dados.length; j++) {
                        if (dados[j].nome.equals(buscaCliente)) {
                            System.out.print("\n\tCliente encontrado.");
                            System.out.print("\n\t========== Dados do Cliente ===========\n");
                            System.out.println("\tNome: " + dados[j].nome + "\n");
                            System.out.println("\tEndereço: " + dados[j].endereco + "\n");
                            System.out.println("\tTelefone: " + dados[j].telefone);
                            System.out.print("\t---------------------------------------\n");
                            System.out.print("\tPressione enter para retornar ao menu...\n");
                            ler.nextLine();
                            break;
                        } else if ((j == (dados.length - 1))) {
                            System.out.print("\n\tCliente não cadastrado.\n");
                        }
                    }
                    System.out.print("\t=======================================\n\n");
                }
                case 3->{
                    //Cadastro de produto
                    System.out.print("\n\tInforme o número de produtos que deseja cadastrar: ");
                    numeroProdutos = ler.nextInt();
                    ler.nextLine();
                    //Criar array de novos produtos
                    Produto[] novos;
                    //Copiar o conteúdo dos produtos já cadastrados para o array de novos produtos
                    novos = Arrays.copyOf(estoque, (numeroProdutos + estoque.length));
                    for (int k = 0; k < numeroProdutos; k++){
                        novos[k+ estoque.length] = new Produto();
                        System.out.print("\n\t---------------------------------------\n");
                        System.out.print("\tInforme o nome do " + (k+1) + "° produto: ");
                        novos[k + estoque.length].nome = ler.nextLine();
                        System.out.print("\tInforme a descrição do " + (k+1) + "° produto: ");
                        novos[k + estoque.length].descricao = ler.nextLine();
                        System.out.print("\tInforme o valor do " + (k+1) + "° produto: ");
                        novos[k + estoque.length].valor = ler.nextDouble();
                        System.out.print("\tInforme a porcentagem de lucro do " + (k+1) + "° produto: ");
                        novos[k + estoque.length].pctLucro = ler.nextDouble();
                        System.out.print("\tInforme a quantidade em estoque do " + (k+1) + "° produto: ");
                        novos[k + estoque.length].qtdEstoque = ler.nextInt();
                        ler.nextLine();
                        System.out.print("\t---------------------------------------\n");
                    }
                    System.out.print("\tPressione enter para retornar ao menu...");
                    ler.nextLine();
                    System.out.print("\t=======================================\n\n");
                    //Copiando os novos dados gerados para o banco de estoques geral
                    estoque = Arrays.copyOf(novos, novos.length);
                }
                case 4->{
                    //Busca pelo nome do produto
                    String buscaProduto;
                    ler.nextLine();
                    System.out.print("\n\t=======================================\n\n");
                    System.out.print("\tDigite o nome do produto que deseja procurar: ");
                    buscaProduto = ler.nextLine();
                    for(int l = 0; l < estoque.length; l++){
                        if(estoque[l].nome.equals(buscaProduto)){
                            System.out.println("\n\tNome do Produto: " + estoque[l].nome);
                            System.out.println("\n\tDescrição do Produto: " + estoque[l].descricao);
                            System.out.println("\n\tValor do Produto: " + estoque[l].valor);
                            System.out.println("\n\tPorcentagem de lucro do Produto: " + estoque[l].pctLucro);
                            System.out.println("\n\tQuantidade em estoque do Produto: " + estoque[l].qtdEstoque);
                            System.out.print("\t---------------------------------------\n");
                            System.out.print("\tPressione enter para retornar ao menu...");
                            ler.nextLine();
                            break;
                        } else if (l == (estoque.length - 1)){
                            System.out.print("\n\tProduto não cadastrado.\n");
                        }
                    }
                    System.out.print("\t=======================================\n\n");
                }
                case 5->{
                    //Registro de venda
                    String nomeProduto;
                    int unidades;
                    double valorTotal;
                    ler.nextLine();
                    System.out.print("\n\t=======================================\n\n");
                    System.out.print("\tDigite o nome do produto para registrar sua venda: ");
                    nomeProduto = ler.nextLine();
                    for(int b = 0; b < estoque.length; b++){
                        if(estoque[b].nome.equals(nomeProduto)){
                            System.out.println("\n\tQuantidade do produto em estoque: " + estoque[b].qtdEstoque);
                            System.out.print("\tQuantas unidades deseja vender ? ");
                            unidades = ler.nextInt();
                            if(unidades > estoque[b].qtdEstoque){
                                System.out.print("\tNão é possível vender mais unidades do que existe em estoque.\n");
                            } else {
                                valorTotal = unidades * estoque[b].valor;
                                estoque[b].qtdEstoque -= unidades;
                                System.out.println("\n\tVenda de " + unidades + " unidades registrada com sucesso.");
                                System.out.println("\tValor total da venda: R$" + valorTotal);
                            }
                            break;
                        }
                    }
                    ler.nextLine();
                    System.out.print("\t---------------------------------------\n");
                    System.out.print("\tPressione enter para retornar ao menu...");
                    ler.nextLine();
                }
                case 6->{
                    //Amostragem do estoque
                }
                case 0-> {
                    System.out.print("\n\tSaindo do sistema...\n");
                    System.out.print("\t=======================================\n\n");
                }
                default -> {
                    System.out.print("\t\n Opção inválida, favor informar uma opção válida.\n");
                    System.out.print("\t=======================================\n\n");
                }
            }
        } while(opcao != 0);
    }
}
