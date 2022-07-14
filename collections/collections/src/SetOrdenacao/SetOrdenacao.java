package SetOrdenacao;
/*
Dadas as seguinte sinformações, sobre minhas séries preferidas,
crie um conjunto e ordene este conjunto exibindo:
(nome, gênero, tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio:60;
Série 2 = Nome: dark, genero: drama, tempoEpisodio:60;
Série 3 = Nome: thats70s' show, genero: comedia, tempoEpisodio:25;
 */

import java.util.*;

public class SetOrdenacao {
    public static void main(String[] args) {

        System.out.println("--\tOrdem de inseção\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add (new Serie("got", "fantasia",60));
            add (new Serie("dark", "drama",60));
            add (new Serie("that 70s' show", "comedia",25));
        }};


        System.out.println("--\tOrdem Aleatoria\t--");
        for (Serie serie:minhasSeries) {
            System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - " + serie.getTempo());
        }

        System.out.println("--\tOrdem Natural (Tempo de episódio)\t--");
        Set <Serie> minhasSeries2 = new TreeSet(minhasSeries);
        for (Serie serie:minhasSeries2) {
            System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - " + serie.getTempo());
        }

        System.out.println("--\tOrdem Nome/Genero/Tempo de episódio\t--");
        Set <Serie> minhasSeries3 = new TreeSet<>(new ComparetorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie:minhasSeries3) {
            System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - " + serie.getTempo());
        }

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempo;

    public Serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempo().equals(serie.getTempo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempo());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempo(), serie.getTempo());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

 class ComparetorNomeGeneroTempo implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {

            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero!=0) return genero;


            return  Integer.compare(s1.getTempo(), s2.getTempo());

        }
    }

