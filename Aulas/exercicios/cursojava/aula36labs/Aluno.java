package cursojava.aula36labs;

public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;

    
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return double[] return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfor() {
        String infor = "Nome Aluno = " + nome + "; ";
        infor += "Matricula = " + matricula + "; ";
        infor += "Notas: ";

        double soma = 0;
        for (double nota : notas){
            soma += nota;
            infor += nota + " ";
        }

        double media = soma / 4;
        infor += "\n" + "Média = " + media + " - ";
        if(media >= 7) {
            infor += "Aprovado";
        } else {
            infor += "Reprovado";
        }

        return infor;
    }

    public double obterMedia(){
        double soma = 0;
            for (double nota : notas){
                soma += nota;
            }
            return soma / 4;
    }
}


