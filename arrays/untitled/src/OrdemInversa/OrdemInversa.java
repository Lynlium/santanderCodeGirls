package OrdemInversa;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class OrdemInversa {

    public static void main(String[] args) {

        System.out.println("\nVetor: ");
        int [] vetor = {-5,-6,50,8,4};
        int count = 0;

        while (count < (vetor.length)){

        System.out.print(vetor[count] + " ");
        count++;
    }
        System.out.println("\nVetor: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
}}