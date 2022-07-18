package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/*
Dadas as seguintes informações de id e contato, crie um
dicionário e ordene-o exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero 2222;
id = 4 - Contato = nome: Cami, numero 5555;
id = 3 - Contato = nome: Jon, numero 1111;
 */
public class StreamApi {
    private static int integer;

    public static void main(String[] args) {
List<String> numerosAleatorios =
        Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("Imprima todos os elementos dessa ista de String:");
numerosAleatorios.forEach(s -> System.out.println(s));//lambda-function

        System.out.println("pegue os 5 primeiros números e coloque dentro de um set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
        .forEach( System.out::println); //set não aceita números repetidos;

        System.out.println("Transforme essa lista de Strings em Numeros Inteiros");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Pegue os números pares e amiores que 2 e coloque em uma lista");
        List<Integer> parseIntmaiorq2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(parseIntmaiorq2);

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent (System.out::println);

        System.out.println("Remova os valores impares:");
        List<Integer> numerosImpares = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosImpares.removeIf( integer -> (integer % 2 != 0));
        System.out.println(numerosImpares);


    }
}
