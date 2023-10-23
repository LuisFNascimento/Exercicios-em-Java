package cursojava.aula41;

public class Teste {

    public static void main(String[] args) {
        
    
    //Pessoa pessoa = new Pessoa(); Não pode ser instaciada classe abstrata
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");


       //System.out.println(aluno.obterEtiquetaEndereco());
       //System.out.println(professor.obterEtiquetaEndereco());

       aluno.imprimirEtiquetaEndereco();
       professor.imprimirEtiquetaEndereco();
    }
   
}
