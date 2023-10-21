package cursojava.aula29;

public class Carro1 {
    
    String marca;
	String modelo;
	int ano;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

    Carro1(){
        System.out.println("Classe Carro foi instaciada");
        numPassageiros = 4;
    }

    Carro1(String marca_, String modelo_, int ano_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
        ano = ano_;

    }

	void exibirAutonomia() {
		System.out.println("Autonomia do carro: " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado");

		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
