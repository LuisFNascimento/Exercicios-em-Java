package cursojava.aula34;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
			Aluno aluno = new Aluno();
			
			System.out.println("Entre com o nome do aluno");
			aluno.setNome(scan.next());
			
			System.out.println("Entre com o nome do Curso");
			aluno.setCurso(scan.next());
			
			System.out.println("Entre com o nome do Matricula");
			aluno.setMatricula(scan.next());
			
			for (int i=0; i<aluno.getNomesDisciplinas().length; i++) {
				System.out.println("Entre com o nome da disciplina " + i);
				aluno.setNomesDisciplinasPos(i, scan.next());
			}
			
			for (int i=0; i<aluno.getNotasDisciplinas().length; i++) {
				System.out.println("Obtendo notas da disciplina " + aluno.getNomesDisciplinas()[i]);
				for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
					System.out.println("Entre com a nota " + (j+1));
                    aluno.setNotaPosIJ(i, j, scan.nextDouble());
				}
			}
			
			aluno.mostrarInfo();
			
			for(int i=0; i<aluno.getNomesDisciplinas().length; i++) {
				if (aluno.verificarAprovado(i)) {
					System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + " Aprovado ");
				} else {
					System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + " Reprovado ");
				}
			}
		}
    }
    
}
