package cursojava.aula34;

public class Lampada {
    
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private boolean tipoabajur;
    private boolean ligado;
    
    public Lampada(){ }

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
            boolean tipoabajur, boolean ligado) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipoabajur = tipoabajur;
        this.ligado = ligado;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return String return the tensao
     */
    public String getTensao() {
        return tensao;
    }

    /**
     * @param tensao the tensao to set
     */
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    /**
     * @return int return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return String return the tipoLuz
     */
    public String getTipoLuz() {
        return tipoLuz;
    }

    /**
     * @param tipoLuz the tipoLuz to set
     */
    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    /**
     * @return int return the garantiaMeses
     */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return boolean return the tipoabajur
     */
    public boolean isTipoabajur() {
        return tipoabajur;
    }

    /**
     * @param tipoabajur the tipoabajur to set
     */
    public void setTipoabajur(boolean tipoabajur) {
        this.tipoabajur = tipoabajur;
    }

    /**
     * @return boolean return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
       setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void mostrarEstado(){
        if(isLigado()){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
   
}
     public void mudarEstado(){
        if (ligado){
            desligar();
        } else {
            ligar();
        }

    }
  
}
