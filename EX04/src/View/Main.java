package View;

import java.util.Random;
import java.util.Scanner;
import Controller.ContadorDeNegativos;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        // Preenchendo o vetor com números aleatórios (entre -10 e 10)
        System.out.println("Vetor gerado:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(21) - 10; // valores de -10 a 10
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Instanciando a classe recursiva
        ContadorDeNegativos contador = new ContadorDeNegativos();

        int totalNegativos = contador.contarNegativos(vetor, tamanho);

        System.out.println("Total de números negativos no vetor: " + totalNegativos);

        sc.close();
    }
}