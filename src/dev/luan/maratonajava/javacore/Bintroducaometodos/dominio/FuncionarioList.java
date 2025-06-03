package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioList {
    private String nome;
    private int idade;
    private double salario;

    public FuncionarioList(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.setSalario();
    }

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
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
