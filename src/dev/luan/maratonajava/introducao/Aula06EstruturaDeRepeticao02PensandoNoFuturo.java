package dev.luan.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02PensandoNoFuturo {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100000

        /*
        Sempre fazer um código pensando no futuro, poderia ter usado i+=2 no lugar do i++, mas se a variável de início i mudar o código da erro.
         */
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }

        }
    }
}
