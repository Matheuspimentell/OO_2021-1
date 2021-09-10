package Sistema;

import java.util.Scanner;
import java.util.Arrays;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private Cliente[] clientes; //Array de clientes
    private int totalClientes; //Numero total de clientes cadastrados
    private Loja loja = new Loja(); //Inicializador de uma loja

    public void CadastrarVenda(){
        // Buscar produtos e gerar nota fiscal
        // Buscar cliente nome ou cpf clientes.BuscarClientes("05372170107");
        // Pedir nome dos produtos carrinhoCompras[1] = loja.BuscarBrinquedo("Boneca Barbie de verão");
        // Caso não hajam mais produtos, gerar nota fical GerarNotaFiscal(carrinho de compras);
    }

    public void BuscarCliente(String c){

    }

    public void GerarNotaFiscal(){
        //Impressão da nota fiscal
    }
}
