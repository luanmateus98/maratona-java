package dev.luan.maratonajava.javacore.Bintroducaometodos.test;

import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import dev.luan.maratonajava.javacore.Bintroducaometodos.dominio.ImprimirDados;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Luan", 27, 5000.00);
        Funcionario funcionario2 = new Funcionario("Enmily", 24, 5000.00);
        Funcionario funcionario3 = new Funcionario("Edelmir", 57, 5000.00);

        ImprimirDados imprimirDados1 = new ImprimirDados();
        ImprimirDados imprimirDados2 = new ImprimirDados();
        ImprimirDados imprimirDados3 = new ImprimirDados();

        imprimirDados1.imprimir(funcionario1);
        imprimirDados2.imprimir(funcionario2);
        imprimirDados3.imprimir(funcionario3);

        ImprimirDados mediaSalrio = new ImprimirDados();
        mediaSalrio.mediaSalario(funcionario1, funcionario2, funcionario3);






    }
}
