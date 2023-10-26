package cursojava.aula43receita;

public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;
    private double rendaBruta;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Juridica [ ";
        s += super.toString();
        s += " ; cnpj: " + cnpj;
        s += " ; imposto a ser pago: " + calcularImposto();
        s += " ]";
        return s;
    }
    
    
}
