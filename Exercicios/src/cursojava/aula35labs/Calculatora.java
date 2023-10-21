package cursojava.aula35labs;

public class Calculatora {

    public static int somatorio(int num) {

        if (num == 1) {
            return 1;
        }

        return num + somatorio( num - 1);
    }
    
}
