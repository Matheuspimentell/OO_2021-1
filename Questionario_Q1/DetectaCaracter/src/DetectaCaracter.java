import java.util.Scanner;

public class DetectaCaracter {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        char caracter;
        System.out.print("Digite o caracter a ser verificado:\n");
        caracter = ler.next().charAt(0);
        if (caracter >= '0' && caracter <= '9'){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
