package cursojava.aula42;

public class Teste {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        System.out.printf(pessoa.getCpf(), aluno, professor);
        
    }
    
}
