package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Estudantes;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudantes estudantes = new Estudantes();
        Estudantes estudantes2 = new Estudantes();

        estudantes.nome = "Enmily";
        estudantes.idade = 24;
        estudantes.sexo = 'F';

        estudantes2.nome = "Luan";
        estudantes2.idade = 27;
        estudantes2.sexo = 'M';

        estudantes.imprimir();
        estudantes2.imprimir();
    }
}
