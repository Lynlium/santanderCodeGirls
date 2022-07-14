package Ordenacao;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dadas as seguintes informações sobre os gatos de Camila, crie uma lista e
ordene esta lista exibindo:
(Nome - Idade - Cor);

Gato 1 = Jon,   Idade: 18, Cor: preto;
Gato 2 = Simba, Idade: 6, Cor: tigrado;
Gato 3 = Jon,   Idade: 12, Cor: amarelo;
 */
public class Ordenacao {
    public static void main(String[] args) {
        List <Gato> gatosCamila = new ArrayList<Gato>() {{
            add(new Gato("Jon", 18,"preto"));

            add(new Gato("Simba", 6,"tigrado"));

            add(new Gato("Jon", 12,"amarelo"));
        }};
        System.out.println("--\tOrdem de inserção\t---");
        System.out.println(gatosCamila);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(gatosCamila);
        System.out.println(gatosCamila);

        System.out.println("--\tOrdem natural (Nome)\t---");
        Collections.sort(gatosCamila);
        System.out.println(gatosCamila); //Até aqui, tds utilizaram o método comparable

        System.out.println("--\tOrdem Idade\t---");//A partir daqui usaremos o método comparator
        gatosCamila.sort(new ComparatorIdade());
        System.out.println(gatosCamila);

        System.out.println("--\tOrdem cor---");
        gatosCamila.sort(new ComparatorCor());
        System.out.println(gatosCamila);

        System.out.println("--\tOrdem Nome/Cor/Idade---");
        gatosCamila.sort(new ComparatorNomeCorIdade());
        System.out.println(gatosCamila);
    }
}

class Gato implements Comparable <Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }


    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());//são métodos da string, para
        // sobrescrever números outros métodos devem ser utilizados;
    }
}


    class ComparatorIdade implements Comparator <Gato>  {

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());//são métodos da string, para
            // sobrescrever números outros métodos devem ser utilizados;;
        }
    }
class ComparatorCor implements Comparator <Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator <Gato>{
    @Override
    public int compare (Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor= g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}