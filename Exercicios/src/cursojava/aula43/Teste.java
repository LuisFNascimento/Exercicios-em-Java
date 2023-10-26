package cursojava.aula43;

public class Teste {

    public static void main (String[] args){

        Aluno aluno = new Aluno();

        aluno.setCursos("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);
    } 

   
}
