package cursojava.aula34;

public class TesteContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();

        conta.setNomeUsuario("Luís Fernando");
        conta.setNomeBanco("Bradesco");
        conta.setNumAgencia(145);
        conta.setNumConta(499755);
        conta.setEspecial(true);
        conta.setLimiteChequeEsp(500);
        conta.setSaldo(-10);
        conta.setValorEspecialUsado(0);

		
		System.out.println("Banco: " + conta.getNomeBanco());
		System.out.println("Agência: " + conta.getNumAgencia());
		System.out.println("Conta Corrente: " + conta.getNumConta());
		System.out.println("Cliente: " + conta.getNomeUsuario());
		System.out.println("Saldo da Conta: " + conta.getSaldo());
		System.out.println("Cheque Especial: " + conta.getLimiteChequeEsp());
		
		System.out.println();
		System.out.println("Movimentação:");

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado no valor R$10,00 com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		saqueEfetuado = conta.realizarSaque(300);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado no valor R$300,000 com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		saqueEfetuado = conta.realizarSaque(500);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado no valor R$500,000 com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		conta.verificarUsoChEspecial();
		
		conta.depositar(500);
		
		conta.consultarSaldo();
		
		if (conta.verificarUsoChEspecial()) {
			System.out.println("Está usando o cheque especial");
		} else {
			System.out.println("Não está usando o cheque especial");
		}
		
		saqueEfetuado = conta.realizarSaque(200);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado no valor R$200,000 com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		if (conta.verificarUsoChEspecial()) {
			System.out.println("Está usando o cheque especial");
		} else {
			System.out.println("Não está usando o cheque especial");
		}
	}
    
    
}
