package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioExProf {
    public String nome;
    public int idade;
    public double[] salarios;

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
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\n Média Salárial é: " + media);
    }
}
