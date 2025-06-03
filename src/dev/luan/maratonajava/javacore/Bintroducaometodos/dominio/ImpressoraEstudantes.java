package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudantes {

    public void imprime(Estudantes estudantes){
        System.out.println(estudantes.nome);
        System.out.println(estudantes.idade);
        System.out.println(estudantes.sexo);
        estudantes.nome ="Gohan";
    }
}
