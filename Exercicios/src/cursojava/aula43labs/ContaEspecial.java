package cursojava.aula43labs;

public class ContaEspecial extends ContaBancaria {
    
    private double limite;

    

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

   
    @Override
    public String toString() {
        String s = "ContaEspecial[";
        s+= " limite: " + limite;
        s+= super.toString();
        s+= "]";
        return s;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double sacarContaEspecial(){
        
        return 0;
    }

    public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    
}
