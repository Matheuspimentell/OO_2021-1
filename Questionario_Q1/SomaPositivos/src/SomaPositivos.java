import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        int entrada = 0;

        do{
            soma += entrada;
            System.out.print("Digite um numero positivo para ser somado ou negativo para sair:\n");
            entrada = ler.nextInt();
        } while (entrada >= 0);

        System.out.println("A soma é: " + soma);
    }
}
