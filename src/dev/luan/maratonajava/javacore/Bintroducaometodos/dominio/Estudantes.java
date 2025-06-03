package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudantes {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir(){
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
