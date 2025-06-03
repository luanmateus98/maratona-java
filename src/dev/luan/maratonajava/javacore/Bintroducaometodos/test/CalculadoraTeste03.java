package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10,4);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,3));

        System.out.println("-----------------------");

        calculadora.imprimeDivisaoDeDoisNumeros(39,5);
    }
}
