package cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raça;
    private int tamanho;

     

    /**
     * @return String return the raça
     */
    public String getRaça() {
        return raça;
    }

    /**
     * @param raça the raça to set
     */
    public void setRaça(String raça) {
        this.raça = raça;
    }

    /**
     * @return int return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void amamentar() {
        
    }

    @Override
    public void emitirSom() {
        
    }

    @Override
    public void levarVeterinario() {
      
    }

    @Override
    public void alimentar() {
        
    }

    @Override
    public void brincar() {
        
    }

    @Override
    public void levarPassear() {
       
    }

    @Override
    public void imprimirNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirNome'");
    }

    
}
