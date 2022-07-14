package Lista;

import java.util.*;

public class Lista {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione sete notas:");
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(6.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(10.0);

        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0:  " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua 5.0, pela nota 6: ");
        notas.set(5,6.0);
        System.out.println(notas);

        System.out.println("Confira se nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Object nota : notas) {
            System.out.println(nota);
                    }
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator <Double> iterator = notas.iterator();
        double  soma = 0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
                    }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 4: ");
        notas.remove(4d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator <Double> iterator1 =  notas.iterator();
        while(iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
        Resolva utilizando a implementação Linkedlist:
        - Crie uma lista chamada nostas 2 e coloque todos os elementos da list
        Arraylist nesta nova lista;
        - Mostre a primeira nota da nova lista, sem removê-lo;
        - Mostre a priemira nota da lista removendo-a;
         */
    }
}
