package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private  int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
