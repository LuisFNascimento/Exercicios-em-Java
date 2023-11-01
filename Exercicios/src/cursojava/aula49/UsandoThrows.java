package cursojava.aula49;

import java.util.Scanner;

public class UsandoThrows {
    
    public static void main(String[] args) {

        System.out.println("Entre com o número decimal");
        try{
            double num = leNumero();
            System.out.println("Você digitou " + num);
        }catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
        
    }

    public static double leNumero() throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            double num = scan.nextDouble();
            return num;
        }
    }


}
