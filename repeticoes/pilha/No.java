package pilha;



public class No {
    
    private int dado;
    private No reDado = null;

    public No(){

    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRef() {
        return reDado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "No{" +
        "dado=" + dado + 
        '}';
    }

    public void setreDado(No refAuxiliar) {
    }
}
