package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.List;

public class ImprimirDadosEuDeNovo {
    public void imprimirMedia(List<FuncionarioEuDeNovo> funcionario){
        if (funcionario == null ||  funcionario.isEmpty()){
            System.out.println("Lista está vazia.");
            return;
        }

        double soma = 0;
        for (FuncionarioEuDeNovo f : funcionario){
            soma += f.getSalario();
        }

        double media = soma / funcionario.size();
        System.out.printf("A média do salário é: %,.2f \n", media );
    }

   public void imprimirDados(List<FuncionarioEuDeNovo> funcionarioDados){
        if (funcionarioDados == null || funcionarioDados.isEmpty()){
            System.out.println("Lista Vazia.");
            return;
        }

        for (FuncionarioEuDeNovo func : funcionarioDados){
            System.out.println("Nome: " + func.getNome());
            System.out.println("Idade: " + func.getIdade());
            System.out.println("Salário: " + func.getSalario());
            System.out.println();
        }
   }
}
