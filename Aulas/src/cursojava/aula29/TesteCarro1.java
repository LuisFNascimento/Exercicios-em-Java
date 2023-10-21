package cursojava.aula29;

import java.text.DecimalFormat;

public class TesteCarro1 {

    public static void main(String[] args) {
        
        Carro1 asx = new Carro1();
		
		System.out.println("Carro selecionado:");
		
		asx.marca = "Mitsubishi";
		asx.modelo = "ASX Automatica";
		asx.ano = 2013;
		asx.capCombustivel = 60;
		asx.consumoCombustivel = 9.5;
		//asx.numPassageiros = 4;
        double valorGasolinaLt = 5.49;
        
        Carro1 asx2 = new Carro1("Mitsubishi", "Asx", 2013, 60, 9.5);
        

        System.out.println("Marca: " + asx2.marca);
        System.out.println("Modelo: " + asx2.modelo);
        System.out.println("Ano: " + asx2.ano);
        System.out.println("Capacidade Tanque: " + asx2.capCombustivel);
        System.out.println("Consumo médio de Combustível: " + asx2.consumoCombustivel);
        System.out.println("Número de passageiros: " + asx.numPassageiros);

        asx.exibirAutonomia();
		
		DecimalFormat format = new DecimalFormat("###,##.##");
		
		double qtdCombustivel145 = asx.calcularCombustivel(145);
		
        System.out.println("Preço da Gasolina: R$" + valorGasolinaLt);
		System.out.println("Quantidade de Combustível para 145km: " + format.format(qtdCombustivel145) + "litros");
		System.out.println("Valor gasto em combustível: R$" + format.format(qtdCombustivel145*valorGasolinaLt));
    }
    
}
