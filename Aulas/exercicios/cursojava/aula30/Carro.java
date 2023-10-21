package cursojava.aula30;

public class Carro {

    String marca;
	String modelo;
	int ano;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

    Carro(String marca, String modelo, int ano, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
       
    }

    public Carro() {  }

    
    public Carro( String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }
    
    public Carro(String marca, String modelo){
        this(marca, modelo, 4);
        System.out.println("Chamando o construtor com 2 parâmetros");

    }

    void exibirAutonomia() {
		System.out.println("Autonomia do carro: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado");

		return this.capCombustivel * this.consumoCombustivel;
	}

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
	
	double calcularCombustivel(double km) {
			
		return this.divideKMPorConsumoCombustivel(km);
	}
    
}
