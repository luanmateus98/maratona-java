package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println();
        pessoa.imprimi();
    }
}
