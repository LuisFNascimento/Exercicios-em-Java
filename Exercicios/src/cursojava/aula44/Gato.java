package cursojava.aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

    private String raça;      

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

    @Override
    public void amamentar() {
       
    }

    @Override
    public void emitirSom() {
        
    }

    @Override
    public void brincar() {
       
    }

    @Override
    public void levarPassear() {
        
    }

    @Override
    public void levarVeterinario() {
       
    }

    @Override
    public void alimentar() {
        
    }

    @Override
    public void imprimirNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirNome'");
    }

}
