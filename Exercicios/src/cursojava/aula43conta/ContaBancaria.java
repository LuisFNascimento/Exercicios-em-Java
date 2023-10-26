package cursojava.aula43conta;

public class ContaBancaria {
    
    private String nomeCliente;
    private int numConta;
    private double saldo;

    
    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s+= " nomeCliente: " + nomeCliente;
        s+= " numConta: " + numConta;
        s+= " saldo: " + saldo;
        s+= "]";
        return s;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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

    public boolean sacar(double valor){
        if((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        return true;
    }


    
}
