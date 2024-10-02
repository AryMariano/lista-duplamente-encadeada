package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){

        primeiroNo = null;
        ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNoRefAnt(ultimoNo);
            ultimoNo.setNoRefPos(novoNo);
            ultimoNo = novoNo;
        }
        tamanhoLista++;
    }

    public void add(T elemento, int index) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoRefPos(noAuxiliar);
    
        if (novoNo.getNoRefPos() != null){
            novoNo.setNoRefAnt(noAuxiliar.getNoRefAnt());
            noAuxiliar.setNoRefAnt(novoNo);
        }else{
            novoNo.setNoRefAnt(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }
        else{
            novoNo.getNoRefAnt().setNoRefPos(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoRefPos();
            if(primeiroNo != null){
                primeiroNo.setNoRefAnt(null);
            }
        }
        else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoRefAnt().setNoRefPos(noAuxiliar.getNoRefPos());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoRefPos().setNoRefAnt(noAuxiliar.getNoRefAnt());
            } else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }


    public T get(int index){
        return this.getNo(index).getConteudo();
    }     


    public int size(){
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i<index && noAuxiliar != null;i++){
            noAuxiliar = noAuxiliar.getNoRefPos();
        }
        return noAuxiliar;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i< tamanhoLista; i++){

            strRetorno += i + "°: " + "{Conteudo: " + noAuxiliar.getConteudo() + "}\n";
            noAuxiliar = noAuxiliar.getNoRefPos();
        }
        strRetorno += "null";
        return strRetorno;
    }

    


}


