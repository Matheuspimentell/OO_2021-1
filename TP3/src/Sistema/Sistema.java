package Sistema;

import java.util.Objects;
import java.util.Scanner;

public class Sistema {
    private Scanner scan = new Scanner(System.in);
    private Cliente[] clientes; //Array de clientes
    private int totalClientes; //Numero total de clientes cadastrados
    private Loja loja; //Inicializador de uma loja

    public void CadastrarVenda(){
        // Buscar produtos e gerar nota fiscal
        // Buscar cliente nome ou cpf clientes.BuscarClientes("05372170107");
        // Pedir nome dos produtos carrinhoCompras[1] = loja.BuscarBrinquedo("Boneca Barbie de verão");
        // Caso não hajam mais produtos, gerar nota fical GerarNotaFiscal(carrinho de compras);
        System.out.println("Método ainda não implementado");
    }

    public void BuscarCliente(String c){
        int i = 0;
        for (i = 0; i < this.clientes.length; i++){
            if (Objects.equals(this.clientes[i].getCpf(), c)){
                break;
            }
        }
        System.out.println(this.clientes[i]); //imprime os dados do cliente
    }

    public void GerarNotaFiscal(){
        //Impressão da nota fiscal
        System.out.println("Método ainda não implementado");
    }

    //Getters e Setters
    public Cliente[] getClientes(){
        return this.clientes;
    }

    public int getTotalClientes(){
        return this.totalClientes;
    }

    public Loja getLoja(){
        return this.loja;
    }

    public void setClientes(){
        this.clientes = new Cliente[10]; //Cria espaço para 10 clientes
        this.setTotalClientes();
    }

    public void setTotalClientes(){
        this.totalClientes = this.clientes.length;
    }

    public void setLoja(){
        this.loja = new Loja();
    }
}


