package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        int[] numeros2 = {1,2,3,4,5,34,4};

        calculadora.somaArray(numeros);
        //calculadora.somaArray(new int[] {1,2,3,4,5}); Assim também dá

        //calculadora.somaVarArgs(numeros2);
        calculadora.somaVarArgs(1,2,3,4,5,34,4); // O VarArgs pode ser passado assim os números, sem fazer o Casting. Ele transforma os números num Array
        // Se for passar mais atributos juntos com o VarArgs ele tem que ser o último a ser passado.
        // O que muda entre o VarArgs e o Array é a sintaxe.

    }
}
