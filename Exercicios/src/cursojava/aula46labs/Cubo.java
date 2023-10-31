package cursojava.aula46labs;

public class Cubo extends Figura3D{

    private int lado;
    
    

    /**
     * @return int return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return (6* (Math.pow(lado, 2)));
    }

    @Override
    public double calcularVolume() {
       return Math.pow(lado, 3);
    }

}
