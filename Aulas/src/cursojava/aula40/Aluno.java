package cursojava.aula40;

public class Aluno extends Pessoa {
    
    private String cursos;
    private double[] notas;

   
    public Aluno() {
        super();
    }

    


    public Aluno(String cursos, double[] notas) {
        this.cursos = cursos;
        this.notas = notas;
    }




    public Aluno(String nome, String telefone, String telefoneCelular, String cursos, double[] notas, String endereco) {
        super(nome, telefone, telefoneCelular);
        this.cursos = cursos;
        this.notas = notas;
    }




    /**
     * @return String return the cursos
     */
    public String getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(String cursos) {
        this.cursos = cursos;
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

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    

}