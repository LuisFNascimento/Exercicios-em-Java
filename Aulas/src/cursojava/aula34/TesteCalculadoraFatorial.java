package cursojava.aula34;

import java.util.Scanner;

public class TesteCalculadoraFatorial {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int num;

            do {

                System.out.println("Entre com o número positivo");
                num = scan.nextInt();

                if (num < 0) {
                    System.out.println("Número inválido, entre novamente");
                }

            }while (num < 0);
            System.out.println(Calculadora.fatorial(num));
        }
    }
}
