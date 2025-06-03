package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.List;

public class ImprimirDadosList {
    public void imprimirMedia(List<FuncionarioList> funcionario){
        if (funcionario == null ||  funcionario.isEmpty()){
            System.out.println("Lista está vazia.");
            return;
        }

        double soma = 0;
        for (FuncionarioList f : funcionario){
            soma += f.getSalario();
        }

        double media = soma / funcionario.size();
        System.out.printf("A média do salário é: %,.2f \n", media );
    }

   public void imprimirDados(List<FuncionarioList> funcionarioDados){
        if (funcionarioDados == null || funcionarioDados.isEmpty()){
            System.out.println("Lista Vazia.");
            return;
        }

        for (FuncionarioList func : funcionarioDados){
            System.out.println("Nome: " + func.getNome());
            System.out.println("Idade: " + func.getIdade());
            System.out.println("Salário: " + func.getSalario());
            System.out.println();
        }
   }
}
