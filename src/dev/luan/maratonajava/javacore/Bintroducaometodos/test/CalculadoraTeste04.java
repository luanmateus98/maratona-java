package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alterandoDoisNumeros(num1, num2); // Tipos primitivos sempre passam uma cópia da variável e não a referência.

        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
