package cursojava.aula50;

public class Agenda {
    
    private Contato[] contatos;

    /**
     * 
     */
    public Agenda(){
        //contatos = new Contato[5];

  /*  public void adicionarContato(Contato c) {

        for (int i=0; i<contatos.length; i++){
            if (contatos[i] != null){
                contatos[i] = c;
            }
        }

        return false;

    }

   @Override
    public String toString() {
        String s = " ";
        for (Contato c : contatos){
            s += c.toString() + "\n"
        }
        return s;
    }
    }*/
}

    /**
     * @return Contato[] return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

}
