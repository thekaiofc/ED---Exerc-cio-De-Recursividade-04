package Controller;

public class ContadorDeNegativos {

    // Construtor da classe
    public ContadorDeNegativos() {
        // Utilizado apenas para instanciar o objeto
    }

    // Metodo recursivo que conta a quantidade de números negativos no vetor
    public int contarNegativos(int[] vetor, int n) {

        /*
         * CONDIÇÃO DE PARADA:
         * Quando n for igual a 0, todas as posições do vetor
         * já foram analisadas.A recursão é encerrada
         * e retorna 0.
         */
        if (n == 0) {
            return 0;
        }

        /*
         * TERMO n EM FUNÇÃO DO TERMO ANTERIOR:
         * A quantidade de números negativos até a posição n
         * é igual à quantidade até (n - 1), somada de 1 caso
         * o elemento atual seja negativo.
         */
        if (vetor[n - 1] < 0) {
            return 1 + contarNegativos(vetor, n - 1);
        } else {
            return contarNegativos(vetor, n - 1);
        }
    }
}