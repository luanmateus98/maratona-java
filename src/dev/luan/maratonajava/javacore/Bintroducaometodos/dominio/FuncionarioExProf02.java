package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioExProf02 {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) { // Com o if normal e com tamanho maior;
            for (double salario : salarios) {
                System.out.print(salario + " | ");
            }
        }
        imprimirMediaSalarial();
    }

    public void imprimirMediaSalarial(){
        double media = 0;
        if (salarios == null){ // Já testo a condição logo no início para ver se não vai dar erro e dimínuo o if;
            return;
        }
        /*for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;*/
        System.out.println("\n Média Salárial é: " + this.media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
    }
}
