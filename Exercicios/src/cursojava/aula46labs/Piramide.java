package cursojava.aula46labs;

public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private double numPoliBase;
    
    private Figura2D base;

    /**
     * @return double return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return double return the arestaBase
     */
    public double getArestaBase() {
        return arestaBase;
    }

    /**
     * @param arestaBase the arestaBase to set
     */
    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    /**
     * @return double return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * @param apotema the apotema to set
     */
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    /**
     * @return Figura2D return the base
     */
    public Figura2D getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return numPoliBase * ((arestaBase * apotema) / 2) + base.calcularArea();
        }
        return 0;
       
    }

    @Override
    public double calcularVolume() {
        if ( base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }


    /**
     * @return double return the numPoliBase
     */
    public double getNumPoliBase() {
        return numPoliBase;
    }

    /**
     * @param numPoliBase the numPoliBase to set
     */
    public void setNumPoliBase(double numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

}
