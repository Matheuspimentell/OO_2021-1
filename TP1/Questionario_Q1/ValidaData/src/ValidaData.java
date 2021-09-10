import java.util.Scanner; //leitura de dados

public class ValidaData {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia:\n");    
        dia = ler.nextInt();
        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();
        if(mes >= 1 && mes <= 12) {
        // Data Válida
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                if(dia >= 1 && dia <= 31 && ano > 0) {
                	System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia >= 1 && dia <= 30 && ano > 0) {
                	System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 2) {
                // Se o mês é fevereiro, é necessário saber se o ano é bissexto ou não, ou seja, se fevereiro tem 28 ou 29 dias.
                if (dia >= 1 && dia <= 28) {
                	// Se o dia está entre 1 e 28, a data é válida para todos os anos
                	System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else if (dia == 29){
                	// Se o dia é 29, checar se o ano é bissexto
                	if (ano % 4 == 0) {
                		// Se o ano é uniformemente divisível por quatro, checar se o mesmo vale para cem
                		if (ano % 100 != 0) {
                			// Se o ano não for uniformemente divisível por 100, ele é bissexto
                			System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                		} else {
                			// Caso contrário, checar se ele é divisível por 400
                			if (ano % 400 == 0) {
                				// Se o ano é divisível por 100 e 400 ao mesmo tempo, ele é bissexto
                				System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                			} else {
                				// Caso contrário, a data é inválida
                				System.out.println("Data Inválida");
                			}
                		}
                	} else {
                		// Caso não seja uniformemente divisível por 4
                		System.out.println("Data Inválida");
                	}
                } else {
                	// Caso o dia seja 0 ou maior que 29
                	System.out.println("Data Inválida");
                }
            }
        } else {
            // Mes invalido
            System.out.println("Data Inválida");
        }
    }
}