import java.util.Scanner;

public class VerificaPar {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Digite o numero:\n");
        numero = ler.nextInt();

        if (numero % 2 == 0 || numero == 0){
            System.out.print("true");
        } else
            System.out.print("false");
    }
}
