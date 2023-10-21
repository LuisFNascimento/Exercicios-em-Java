package cursojava.aula34;

public class ContaCorrente {

    private String nomeBanco;
	private int numAgencia;
	private int numConta;
	private double saldo;
	private double limiteChequeEsp;
	private double valorEspecialUsado;
	private String nomeUsuario;
	private boolean especial;

    public ContaCorrente() {
    }

    public ContaCorrente(String nomeBanco, int numAgencia, int numConta, double saldo, double limiteChequeEsp,
            double valorEspecialUsado, String nomeUsuario, boolean especial) {
        this.nomeBanco = nomeBanco;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.limiteChequeEsp = limiteChequeEsp;
        this.valorEspecialUsado = valorEspecialUsado;
        this.nomeUsuario = nomeUsuario;
        this.especial = especial;
    }

	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;	
		System.out.println("Deposito no valor R$ " + valorDepositado);
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual : R$" + saldo );
	}
	
	boolean verificarUsoChEspecial() {
		return saldo < 0;
	}

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeEsp() {
        return limiteChequeEsp;
    }

    public void setLimiteChequeEsp(double limiteChequeEsp) {
        this.limiteChequeEsp = limiteChequeEsp;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    
    public boolean realizarSaque(double quantiaASacar) {
		
		// tem saldo na conta
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { // não tem saldo na conta
			if (especial) {
				double limite = limiteChequeEsp + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
				
			} else {
				return false;
			}
		}
	}
    
}
