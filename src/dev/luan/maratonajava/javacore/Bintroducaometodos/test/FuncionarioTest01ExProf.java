package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioExProf;

public class FuncionarioTest01ExProf {
    public static void main(String[] args) {
        FuncionarioExProf funcionario = new FuncionarioExProf();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprimir();
        //funcionario.imprimirMediaSalarial();
    }
}
