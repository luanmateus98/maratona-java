package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioEuDeNovo;
import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.ImprimirDadosEuDeNovo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioTeste01EuDeNovo {
    public static void main(String[] args) {
        /*FuncionarioEuDeNovo f1 = new FuncionarioEuDeNovo("Carlinda",85, 3500.00);
        FuncionarioEuDeNovo f2 = new FuncionarioEuDeNovo("Maria",72, 1700.00);
        FuncionarioEuDeNovo f3 = new FuncionarioEuDeNovo("Bianca",30, 4000.00);*/

        Scanner tecl = new Scanner(System.in);
        List<FuncionarioEuDeNovo> funcionarioEuDeNovos = new ArrayList<>();

        String resp;
        do {
            System.out.println("==================================================");
            System.out.println(" C A D A S T R O   D E   F U N C I O N Á R I O S");
            System.out.println("==================================================");

            System.out.print("Nome: ");
            String nome = tecl.next();

            System.out.print("Idade: ");
            int idade = tecl.nextInt();

            System.out.print("Salário: ");
            double salario = tecl.nextDouble();

            funcionarioEuDeNovos.add(new FuncionarioEuDeNovo(nome, idade, salario));

            System.out.print("Deseja cadastrar outro funcionário ? ");
            resp = tecl.next().toLowerCase();
        } while (resp.equals("s"));


        /*for (int i = 0; i < 10; i++) {
            funcionarioEuDeNovos.add(new FuncionarioEuDeNovo("Luan", 27, 30000.00));
            funcionarioEuDeNovos.add(new FuncionarioEuDeNovo("Enmily", 24, 30000.00));
            funcionarioEuDeNovos.add(new FuncionarioEuDeNovo("Bianca", 30, 60000.00));
        }*/
        ImprimirDadosEuDeNovo imprimir = new ImprimirDadosEuDeNovo();
        imprimir.imprimirDados(funcionarioEuDeNovos);
        imprimir.imprimirMedia(funcionarioEuDeNovos);
    }
}
