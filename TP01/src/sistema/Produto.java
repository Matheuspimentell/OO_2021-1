package sistema;

import java.util.Scanner;
import java.util.Arrays;

public class Produto {
    String nome;
    String descricao;
    double valor;
    double pctLucro;
    int qtdEstoque;
    public static Produto[] Cadastro(Produto[] estoque){
        Scanner ler = new Scanner(System.in);
        int numeroProdutos;
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
        return novos;
    }
    public static Produto[] Busca(Produto[] estoque){
        Scanner ler = new Scanner(System.in);
        String nome;
        Produto[] novos = Arrays.copyOf(estoque, estoque.length);
        System.out.print("\n\t=======================================\n\n");
        System.out.print("\tDigite o nome do produto que deseja procurar: ");
        nome = ler.nextLine();
        for(int l = 0; l < novos.length; l++){
            if(novos[l].nome.equals(nome)){
                System.out.print("\n\t========== Dados do Produto ===========\n");
                System.out.println("\tNome do Produto: " + novos[l].nome);
                System.out.println("\tDescrição do Produto: " + novos[l].descricao);
                System.out.println("\tValor do Produto: " + novos[l].valor);
                System.out.println("\tPorcentagem de lucro do Produto: " + novos[l].pctLucro);
                System.out.println("\tQuantidade em estoque do Produto: " + novos[l].qtdEstoque);
                System.out.print("\t---------------------------------------\n");
                //Opção de alterar cadastro do produto
                char opcao;
                System.out.print("\tDeseja alterar o cadastro do produto acima ?\n");
                System.out.print("\tDigite 'S' para alterar ou 'N' para não alterar\n\t");
                opcao = ler.next().charAt(0);
                ler.nextLine();
                if(opcao == 'S' || opcao == 's'){
                    System.out.print("\t=======================================\n\n");
                    System.out.print("\tDigite a nova descrição: ");
                    novos[l].descricao = ler.nextLine();
                    System.out.print("\tDigite o novo valor: ");
                    novos[l].valor = ler.nextDouble();
                    System.out.print("\tDigite a nova porcentagem de lucro: ");
                    novos[l].pctLucro = ler.nextDouble();
                    System.out.print("\tDigite a nova quantidade em estoque: ");
                    novos[l].qtdEstoque = ler.nextInt();
                    ler.nextLine();
                    System.out.print("\n\tCadastro alterado com sucesso.\n");
                }
                System.out.print("\t---------------------------------------\n");
                System.out.print("\tPressione enter para retornar ao menu...");
                ler.nextLine();
                break;
            } else if (l == (novos.length - 1)){
                System.out.print("\n\tProduto não cadastrado.\n");
            }
        }
        System.out.print("\t=======================================\n\n");
        return novos;
    }
    public static void MostraEstoque(Produto[] estoque){
        Scanner ler = new Scanner(System.in);
        System.out.print("\t=======================================\n");
        System.out.print("\t========= Produtos cadastrados ========\n");
        for(int t = 0; t < estoque.length; t++){
                System.out.println("\tNome do Produto: " + estoque[t].nome);
                System.out.println("\tDescrição do Produto: " + estoque[t].descricao);
                System.out.println("\tValor do Produto: " + estoque[t].valor);
                System.out.println("\tPorcentagem de lucro do Produto: " + estoque[t].pctLucro + "%");
                if(estoque[t].qtdEstoque > 0) {
                    System.out.println("\tQuantidade em estoque do Produto: " + estoque[t].qtdEstoque);
                } else{
                    System.out.println("\tProduto fora de estoque.");
                }
                System.out.print("\t---------------------------------------\n");
        }
        System.out.print("\tPressione enter para retornar ao menu...");
        ler.nextLine();
    }
    public static Produto[] Venda(Produto[] estoque, Cliente[] cliente){
        Scanner ler = new Scanner(System.in);
        Produto[] novo;
        novo = Arrays.copyOf(estoque, estoque.length);
        String nomeProduto;
        String nomeCliente;
        char opcao = 'S';
        int unidades, cont = 0;
        double valorTotal = 0;
        System.out.print("\n\t============= Clientes ==============\n");
        for (int j = 0; j < cliente.length; j++){
            System.out.println("\tNome do cliente: " + cliente[j].nome);
        }
        System.out.print("\t---------------------------------------\n");
        System.out.print("\tDigite o nome do cliente que está comprando: ");
        nomeCliente = ler.nextLine();
        do{
            System.out.print("\t============= Produtos ==============\n");
            for (int k = 0; k < estoque.length; k++){
                System.out.println("\tNome do produto: " + estoque[k].nome);
                System.out.println("\tValor do produto: " + estoque[k].valor);
                System.out.println("\tQuantidade em estoque: "+ estoque[k].qtdEstoque);
                System.out.print("\t---------------------------------------\n");
            }
            System.out.print("\t=======================================\n\n");
            System.out.print("\tDigite o nome do produto para registrar sua venda: ");
            nomeProduto = ler.nextLine();
            for(int b = 0; b < novo.length; b++){
                if(estoque[b].nome.equals(nomeProduto)){
                    System.out.println("\n\tQuantidade do produto em estoque: " + novo[b].qtdEstoque);
                    System.out.print("\tQuantas unidades deseja vender ? ");
                    unidades = ler.nextInt();
                    if(unidades > novo[b].qtdEstoque){
                        System.out.print("\tNão é possível vender mais unidades do que existe em estoque.\n");
                    } else {
                        valorTotal = unidades * novo[b].valor;
                        novo[b].qtdEstoque -= unidades;
                        System.out.println("\n\tVenda de " + unidades + " unidades de " + nomeProduto + " para " + nomeCliente + " registrada com sucesso.");
                        ler.nextLine();
                    }
                    break;
                } else if(b == novo.length-1  && !(novo[b].nome.equals(nomeProduto))){
                    System.out.println("\tProduto não cadastrado.");
                }
            }
            cont++;
            if(cont > 0){
                System.out.print("\tDeseja registrar mais uma venda ? (S/N)\n\t");
                opcao = ler.next().charAt(0);
                ler.nextLine();
            }
            if (opcao == 'N' || opcao == 'n'){
                System.out.format("\tValor total da venda: R$ %.2f\n", valorTotal);
            }
        } while (opcao == 'S' || opcao == 's');
        System.out.print("\t---------------------------------------\n");
        System.out.print("\tPressione enter para retornar ao menu...");
        ler.nextLine();
        return novo;
    }
}
