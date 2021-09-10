import java.util.Scanner;

public class RetornaMaior {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        int numeroTemporario;

        System.out.print("Entre com o primeiro numero:\n");
        numero = ler.nextInt();
        System.out.print("Entre com o segundo numero:\n");
        numeroTemporario = ler.nextInt();
        if(numeroTemporario > numero){
            numero = numeroTemporario;
        }
        System.out.print("Entre com o terceiro numero:\n");
        numeroTemporario = ler.nextInt();
        if(numeroTemporario > numero){
            numero = numeroTemporario;
        }
        System.out.print("Entre com o quarto numero:\n");
        numeroTemporario = ler.nextInt();
        if(numeroTemporario > numero){
            numero = numeroTemporario;
        }
        System.out.print("Entre com o quinto numero:\n");
        numeroTemporario = ler.nextInt();
        if(numeroTemporario > numero){
            numero = numeroTemporario;
        }
        System.out.println(numero);
    }
}
