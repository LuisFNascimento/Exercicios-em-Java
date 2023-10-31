package cursojava.aula45;

public class Teste2 {
    
    public static void main(String[] args) {
        
       /* Object obj1 = obterString();
        String s1 = (String) obj1;

     }

    public static String obterString(){
        return "minha String";*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("é do tipo Pessoa");

        }

        if (aluno instanceof Aluno){
             System.out.println("é do tipo Aluno");
        }

        if (professor instanceof Professor){
             System.out.println("é do tipo Professor");
            
        }
    }
}
