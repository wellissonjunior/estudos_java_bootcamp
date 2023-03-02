package pilha;

public class Pilha {
    

    private No refNoEntradaPilha;

    public Pilha(){

        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setreDado(refAuxiliar);
    };

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String stringRetorno = "-------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "----------------\n";


        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar!=null) {
                stringRetorno+= "[No {dado=" + noAuxiliar.getDado() + "}]\n";

                noAuxiliar = noAuxiliar.getRef();
            } else {
                break;
            }
        }
    }
}


