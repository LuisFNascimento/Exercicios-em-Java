package cursojava.aula43zoo;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero (){
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";

    }
    

    /**
     * @return String return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    @Override
    public String toString() {
        String s = super.toString();
        s+= "\nAlimento: " + alimento;
        return s;
    }
    

}
