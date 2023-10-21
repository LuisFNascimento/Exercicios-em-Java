package cursojava.aula36labs;

public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfor(){
        String infor = "Nome do curso = " + nome + "\n";

        if (professor != null){
            infor += professor.obterInfo();
            infor += "\n";
        }

        if(alunos != null){
            System.out.println("-----Alunos-----"); 
            for (Aluno aluno : alunos){
                if(aluno != null){
                  infor += aluno.obterInfor();
                  infor += "\n";
                }
            }

            infor += "\nMédia da turma = " + obterMediaTurma();
        }
        return infor;
    }

    public double obterMediaTurma(){
        double soma = 0;
        for (Aluno aluno : alunos){
            if(aluno != null){
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}


