package cursojava.aula34;

public class Aluno {
    
    private String nome;
	private String matricula;
	private String curso;
	private String[] nomesDisciplinas;
	private double[][] notasDisciplinas;

   
	public Aluno() {
        nomesDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];

    }

 

    public Aluno(String nome, String matricula, String curso, String[] nomesDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomesDisciplinas = nomesDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public String getCurso() {
        return curso;
    }



    public void setCurso(String curso) {
        this.curso = curso;
    }



    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }



    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }



    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do Curso: " + curso);

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da Disciplina " + nomesDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean verificarAprovado(int indice) {
		
		if (obterMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
	
	private double obterMedia(int indice) {

		double soma = 0;

		for (int i=0; i< notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;
		return media;
	}

    public void setNomesDisciplinasPos(int pos, String nomeDisciplina){
        this.nomesDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
