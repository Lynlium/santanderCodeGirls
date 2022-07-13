package Lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        System.out.println("Crie uma ista e adicione sete notas:");
        List<Object> notas = new ArrayList<>();

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

        //System.out.println("Exiba a menor nota: " + Collections.min(notas));



    }
}
