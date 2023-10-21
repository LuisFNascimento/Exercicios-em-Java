package cursojava.aula27;
import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            Aluno aluno = new Aluno();

            System.out.println("Entre com o nome do Aluno");
            aluno.nome = scan.next();

            System.out.println("Entre com o nome do Curso");
            aluno.nomeCurso = scan.next();

            System.out.println("Entre com o numero da Matrícula");
            aluno.matricula = scan.next();

            for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
                System.out.println("Entre com nome da disciplina " + (i+1));
                aluno.nomeDisciplinas[i] = scan.next();
            }

            for(int i=0; i<aluno.notaDisciplinas.length; i++) {
                System.out.println("Obtendo notas da disciplinas " + aluno.nomeDisciplinas[i]);
                for(int j=0; j<aluno.notaDisciplinas[i].length; j++) {
                    System.out.println("Entre com a nota " + (j+1));
                    aluno.notaDisciplinas[i][j] = scan.nextDouble();

                }
            }
            aluno.mostrarInfor();

            for (int i=0; i<aluno.nomeDisciplinas.length; i++){
                if (aluno.verificarAprovado(i)){
                    System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi Aprovado");
                } else {
                    System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi Reprovado");
                }
            }
        }
    }
}
