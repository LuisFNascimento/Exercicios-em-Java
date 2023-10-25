package cursojava.aula42;

public class Professor  {
    
    private String departamento;
    private double nomeCurso;
    private String salario;


    /**
     * @return String return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return double return the nomeCurso
     */
    public double getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(double nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return String return the salario
     */
    public String getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

   public double calcularSalarioLiquido(){
        return 0;
   }

   /*public String obterEtiquetaEndereco(){

    String s = "Endereço do Professor: ";
    s += super.getEndereco();

    return s; 
}*/

/*@Override
// public void imprimirEtiquetaEndereco() {
    
    System.out.println("Imprimindo o endereço do Professor");
    System.out.println(this.obterEtiquetaEndereco());
} */
}
