package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> minhaListinha = new ListaDuplamenteEncadeada<>();

        minhaListinha.add("teste1");
        minhaListinha.add("teste2");
        minhaListinha.add("teste3");
        minhaListinha.add("teste4");
        minhaListinha.add("teste5");
        minhaListinha.add("teste6");
        minhaListinha.add("teste7");
        minhaListinha.add("teste8");

        minhaListinha.remove(2);

        minhaListinha.add("teste99", 2);

        System.out.println(minhaListinha);

    }

}
