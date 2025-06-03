package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Estudantes;
import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudantes;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudantes estudantes01 = new Estudantes();
        Estudantes estudantes02 = new Estudantes();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudantes01.nome = "Midoriya";
        estudantes01.idade = 15;
        estudantes01.sexo = 'M';

        estudantes02.nome = "Sakura";
        estudantes02.idade = 16;
        estudantes02.sexo = 'F';

        /*System.out.println(estudantes01.nome);
        System.out.println(estudantes01.idade);
        System.out.println(estudantes01.sexo);

        System.out.println("\n------------");

        System.out.println(estudantes02.nome);
        System.out.println(estudantes02.idade);
        System.out.println(estudantes02.sexo);*/

        impressora.imprime(estudantes01);
        System.out.println();
        impressora.imprime(estudantes02);

        System.out.println("++++++++++++++++++");

        impressora.imprime(estudantes01);
        System.out.println();
        impressora.imprime(estudantes02);
    }
}
