package cursojava.aula32;

public class Carro {

   	private String marca;
	private String modelo;
	private int ano;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
 
    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return int return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return int return the numPassageiros
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * @param numPassageiros the numPassageiros to set
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * @return double return the capCombustivel
     */
    public double getCapCombustivel() {
        return capCombustivel;
    }

    /**
     * @param capCombustivel the capCombustivel to set
     */
    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    /**
     * @return double return the consumoCombustivel
     */
    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    /**
     * @param consumoCombustivel the consumoCombustivel to set
     */
    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

}
