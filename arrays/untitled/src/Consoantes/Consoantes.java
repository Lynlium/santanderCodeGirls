package Consoantes;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
ediga qunatas consoantes foram lidas.
Imprima as consoantes
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadedeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
          String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){

               consoantes[count] = letra;
                quantidadedeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante:consoantes) {
           if (consoante != null)
            System.out.println(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " +quantidadedeConsoantes);
        System.out.println(consoantes.length);
    }

    private static class Srtring {
    }
}
