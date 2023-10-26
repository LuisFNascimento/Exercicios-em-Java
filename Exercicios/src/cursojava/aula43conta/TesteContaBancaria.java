package cursojava.aula43conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        
        System.out.println("*** Teste Conta Bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Luis Silva");
        contaSimples.setNumConta(9999);
        contaSimples.setSaldo(2000);
        
        realizarDeposito(contaSimples, 200);

        realizarSaque(contaSimples, 2000);

        realizarSaque(contaSimples, 200);

        realizarSaque(contaSimples,100);
       
        System.out.println(contaSimples);


        System.out.println();


        System.out.println("*** Teste Conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Fernando Nascimento");
        contaPoupanca.setNumConta(7777);
        contaPoupanca.setDiaRendimento(26);

        realizarDeposito(contaPoupanca, 100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca,70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
     
        System.out.println(contaPoupanca);

        System.out.println();

        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial(0);
        contaEspecial.setNomeCliente("Joice Magalhães");
        contaEspecial.setNumConta(5555);
        contaEspecial.setLimite(50);
        

        realizarDeposito(contaEspecial, 100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial,70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
      
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
         if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else{
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }

    private static void realizarDeposito(ContaBancaria conta, double valor){
         if (conta.depositar(valor)){
           System.out.println("Deposito efetuado com sucesso, novo saldo = " + conta.getSaldo());
         
        }
    }
}
