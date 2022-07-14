package Set;

import java.util.*;

/*
Dada ua lista de 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
- SetNotas
- HashSet
 */
public class SetandoListas{
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
            Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //System.out.println("Exiba a posição da nota 5: "); NÃO SE TRABALHA COM POSIÇÃO
        //DENTRO DE UM SET

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //System.out.println("Exiba a terceira nota adicionada: "); NÃO HÁ COMO FAZER, POIS
        //NO MÉTODO SET NÃO TEM COMO PEGAR O INDEX E RETORNAR A NOTA

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            Double nex = iterator.next();
            soma += nex;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova notas menores que 7 e exiba na lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next <7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram informadas: ");
        Set <Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.0);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set <Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas + "Conjunto 'Notas' sendo apagado...");

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());


    }
}
