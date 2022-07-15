package OrdenacaoMap;

import java.util.*;

/*
Dadas as seguintes informações sobre livros e seus autores,
crie um dicionário e ordene este dicionário:

Autor: Hawking, Stephen - Livro = nome: Uma breve história do tempo. Pg: 256
Autor: Duhigg, Charles - Livro = nome: o Poder do Hábito. Pg: 408
Autor: Hararai, Yuval Noah - Livro = nome: Liçoes para o século 21. Pg: 432
 */
public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábitoo", 408));
           put("Hararai, Yuval Noah", new Livro("Lições para o século XXI", 256));
        }};

        System.out.println(" --\t Ordem Alatória\t--");
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        System.out.println(" --\t Ordem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{

            put("Duhigg, Charles", new Livro("O Poder do Hábitoo", 408));
            put("Hararai, Yuval Noah", new Livro("Lições para o século XXI", 256));
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println(" --\t Ordem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String,Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());

        System.out.println(" --\t Ordem alfabética nome dos livros\t--");
        Set<Map.Entry<String, Livro>> meusivros3 = new TreeSet<>(new ComparatorNome());
        meusivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String,Livro> livro : meusivros3)
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());






    }
}
class Livro{
    private String nome;
    private Integer pg;


    public Livro(String nome, Integer pg) { //construtor
        this.nome = nome;
        this.pg = pg;

    }

    public String getNome() { //getter
        return nome;
    }

    public Integer getPg() {
        return pg;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(getNome(), livro.getNome()) && Objects.equals(getPg(), livro.getPg());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPg());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", pg=" + pg +
                ", autor='" +'\'' +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}