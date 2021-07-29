package sistema;

import java.util.Arrays;
import java.util.Scanner;

public class Cadastrador {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //Declaração de variáveis
        int opcao;
        //pré cadastro do primeiro cliente
        Cliente[] dados = new Cliente[10];
        Cliente[] tempCliente;
        dados[0] = new Cliente();
        dados[0].nome = "Diego Silva";
        dados[0].endereco = "Rua das Palmeiras, Casa 90";
        dados[0].telefone = "999999999";
        dados[1] = new Cliente();
        dados[1].nome = "Anderson Cristiano";
        dados[1].endereco = "Rua da liberdade, Casa 12";
        dados[1].telefone = "911111111";
        dados[2] = new Cliente();
        dados[2].nome = "Manuela Gouveia";
        dados[2].endereco = "Avenida são josé, Casa 1";
        dados[2].telefone = "922222222";
        dados[3] = new Cliente();
        dados[3].nome = "Catarina Ferreira";
        dados[3].endereco = "Rua das Palmeiras, Casa 4";
        dados[3].telefone = "933333333";
        dados[4] = new Cliente();
        dados[4].nome = "Douglas Leal";
        dados[4].endereco = "Rua do cacique, Casa 78";
        dados[4].telefone = "944444444";
        dados[5] = new Cliente();
        dados[5].nome = "Gabriela Costa";
        dados[5].endereco = "Setor habitacional oeste, Casa 40";
        dados[5].telefone = "955555555";
        dados[6] = new Cliente();
        dados[6].nome = "Giovana das dores";
        dados[6].endereco = "Vila recife, Casa 77";
        dados[6].telefone = "966666666";
        dados[7] = new Cliente();
        dados[7].nome = "Lucrecia Navarro";
        dados[7].endereco = "Vila da jiboia, Casa 8";
        dados[7].telefone = "977777777";
        dados[8] = new Cliente();
        dados[8].nome = "Rafaela Freitas";
        dados[8].endereco = "Rua da aliança, Casa 2";
        dados[8].telefone = "988888888";
        dados[9] = new Cliente();
        dados[9].nome = "Bruno da Costa";
        dados[9].endereco = "Rua da aliança, Casa 1";
        dados[9].telefone = "910000000";
        //pré cadastro do primeiro produto
        Produto[] estoque = new Produto[10];
        Produto[] tempProduto;
        estoque[0] = new Produto();
        estoque[0].nome = "Vaso de flores";
        estoque[0].descricao = "Vaso de flores com uma imagem de nossa senhora aparecida.";
        estoque[0].valor = 25.99;
        estoque[0].pctLucro = 14.3;
        estoque[0].qtdEstoque = 18;
        estoque[1] = new Produto();
        estoque[1].nome = "Jarra para suco";
        estoque[1].descricao = "Jarra roxa para suco.";
        estoque[1].valor = 20.90;
        estoque[1].pctLucro = 10.3;
        estoque[1].qtdEstoque = 27;
        estoque[2] = new Produto();
        estoque[2].nome = "Garrafa para líquidos";
        estoque[2].descricao = "Garrafa transparente para líquidos variados.";
        estoque[2].valor = 37.89;
        estoque[2].pctLucro = 16.8;
        estoque[2].qtdEstoque = 40;
        estoque[3] = new Produto();
        estoque[3].nome = "Garrafa térmica";
        estoque[3].descricao = "Garrafa para líquidos quentes ou frios.";
        estoque[3].valor = 31.00;
        estoque[3].pctLucro = 15.0;
        estoque[3].qtdEstoque = 0;
        estoque[4] = new Produto();
        estoque[4].nome = "Caneca";
        estoque[4].descricao = "Caneca personalizada FRIENDS.";
        estoque[4].valor = 45.90;
        estoque[4].pctLucro = 20.0;
        estoque[4].qtdEstoque = 3;
        estoque[5] = new Produto();
        estoque[5].nome = "Copo de cerveja";
        estoque[5].descricao = "Copo de cerveja personalizado How I Met Your Mother.";
        estoque[5].valor = 45.90;
        estoque[5].pctLucro = 14.0;
        estoque[5].qtdEstoque = 3;
        estoque[6] = new Produto();
        estoque[6].nome = "Pote";
        estoque[6].descricao = "Pote de geleia vermelho pintado à mão.";
        estoque[6].valor = 14.87;
        estoque[6].pctLucro = 9.94;
        estoque[6].qtdEstoque = 1;
        estoque[7] = new Produto();
        estoque[7].nome = "Vasilhame";
        estoque[7].descricao = "Vasilhame de sorvete personalizado feijão.";
        estoque[7].valor = 10.90;
        estoque[7].pctLucro = 10.3;
        estoque[7].qtdEstoque = 45;
        estoque[8] = new Produto();
        estoque[8].nome = "Regador";
        estoque[8].descricao = "Regador simples verde.";
        estoque[8].valor = 22.50;
        estoque[8].pctLucro = 12.6;
        estoque[8].qtdEstoque = 31;
        estoque[9] = new Produto();
        estoque[9].nome = "Segurador de vela";
        estoque[9].descricao = "Base seguradora para velas.";
        estoque[9].valor = 18.90;
        estoque[9].pctLucro = 10.1;
        estoque[9].qtdEstoque = 18;
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
                    tempCliente = Cliente.Cadastro(dados);
                    dados = Arrays.copyOf(tempCliente, tempCliente.length);
                }
                case 2->{
                    //Busca pelo nome do cliente
                    tempCliente = Cliente.Busca(dados);
                    dados = Arrays.copyOf(tempCliente, tempCliente.length);
                }
                case 3->{
                    //Cadastro de produto
                    tempProduto = Produto.Cadastro(estoque);
                    estoque = Arrays.copyOf(tempProduto, tempProduto.length);
                }
                case 4->{
                    //Busca pelo nome do produto
                    tempProduto = Produto.Busca(estoque);
                    estoque = Arrays.copyOf(tempProduto, tempProduto.length);
                }
                case 5->{
                    //Registro de venda
                    tempProduto = Produto.Venda(estoque, dados);
                    estoque = tempProduto;
                }
                case 6->{
                    //Amostragem do estoque
                    Produto.MostraEstoque(estoque);
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
