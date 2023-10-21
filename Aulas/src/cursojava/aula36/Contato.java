package cursojava.aula36;

public class Contato {
    
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;

    
    public Contato() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return Telefone[] return the telefones
     */
    public Telefone[] getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

}
