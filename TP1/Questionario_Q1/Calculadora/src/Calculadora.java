import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        char opcao;
        System.out.print("Entre com a operação a ser realizada (+, - ou *):\n");
        opcao = ler.next().charAt(0);
        int numA;
        int numB;
        int resultado;
        System.out.print("Entre com o primeiro número:\n");
        numA = ler.nextInt();
        System.out.print("Entre com o segundo número:\n");
        numB = ler.nextInt();
        switch (opcao){
            case '+':
                resultado = numA+numB;
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case '-':
                resultado = numA-numB;
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case '*':
                resultado = numA*numB;
                System.out.println("O resultado da operação é: " + resultado);
                break;
            default:
                System.out.print("Operação inválida");
        }
    }
}
