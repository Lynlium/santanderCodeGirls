package Nota;
/*
Faça um programa que peça uma nota entre 0 e 10
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira nota: ");
        nota = scan.nextDouble();
        if (nota > 0 && nota < 11) System.out.println("A nota é: " + nota);
        else {
            System.out.println("[Nota inválida] Insira nota: ");
            nota = scan.nextDouble();
            System.out.println("A nota é: " + nota);
        }


    }
}
