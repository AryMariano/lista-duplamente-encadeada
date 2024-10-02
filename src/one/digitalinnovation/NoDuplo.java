package one.digitalinnovation;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noRefPos;
    private NoDuplo<T> noRefAnt;


    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;

    }


    public T getConteudo() {
        return conteudo;
    }


    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public NoDuplo<T> getNoRefPos() {
        return noRefPos;
    }


    public void setNoRefPos(NoDuplo<T> noRefPos) {
        this.noRefPos = noRefPos;
    }


    public NoDuplo<T> getNoRefAnt() {
        return noRefAnt;
    }


    public void setNoRefAnt(NoDuplo<T> noRefAnt) {
        this.noRefAnt = noRefAnt;
    }


    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }

    

}
