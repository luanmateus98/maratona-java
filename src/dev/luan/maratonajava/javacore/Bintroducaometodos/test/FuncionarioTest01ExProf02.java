package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioExProf02;

public class FuncionarioTest01ExProf02 {
    public static void main(String[] args) {
        FuncionarioExProf02 funcionario = new FuncionarioExProf02();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimir();
        //funcionario.imprimirMediaSalarial();
    }
}
