package cursojava.aula36;

public class Teste {
    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Luís");
        //contato.setEndereco("Rio de Janeiro");
        //contato.setTelefone("21 2494-2663");

        Endereco end = new Endereco();
        end.setNomeRua("Marcelo Nunes");
        end.setNumero("2000");
        end.setComplemento("Casa");
        end.setCidade("Rio de Janeiro");
        end.setCep("23060-720");

        contato.setEndereco(end);

        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setNumero("9999-9999");
        telefone.setDdd("21");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Fixo");
        telefone2.setNumero("3333-3333");
        telefone2.setDdd("21");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.getTelefones();
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        

        if( contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if( contato != null && contato.getTelefones() != null){
            System.out.println(contato.getTelefones()[1].getDdd() + " " + contato.getTelefones()[1].getNumero());
            System.out.println(contato.getTelefones()[0].getDdd() + " " + contato.getTelefones()[0].getNumero());
        }*/
        if( contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
