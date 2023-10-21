package cursojava.aula35labs;

public class CalculadoraFibonacci {
    
    public static int fibronacci(int num) {

        if (num < 2) {
            return 1;
        }

        return fibronacci(num - 1) + fibronacci( num - 2);
    }
}
    


