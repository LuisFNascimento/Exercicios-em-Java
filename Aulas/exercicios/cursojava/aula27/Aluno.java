package cursojava.aula27;

public class Aluno {
    
    String nome; 
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String [3];
    double[][] notaDisciplinas = new double[3][4];

    void mostrarInfor(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i=0; i<notaDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notaDisciplinas[i].length; j++) {
                System.out.print(notaDisciplinas[i][j] + " - " );
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice){

        double soma = 0;

        for (int i=0; i<notaDisciplinas[indice].length; i++) {
            soma += notaDisciplinas[indice][i];
            if (indice < 0 || indice >= notaDisciplinas.length) {
                System.out.println("Índice inválido.");
                return false;
            }
        }

        double media = soma / notaDisciplinas[indice].length ;

        if (media >= 7 ) {
            return true;
        }

        return false;
    }
}
