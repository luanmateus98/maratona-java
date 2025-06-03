package dev.luan.maratonajava.javacore.Aintroducaoclasses.test;

import dev.luan.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Civic SI";
        c1.modelo = "Sedan";
        c1.ano = 2021;

        c2.nome = "Kicks";
        c2.modelo = "SUV";
        c2.ano = 2022;

        c1 = c2; // Só pode associar objetos do mesmo tipo de herança

        System.out.println("Nome do carro: " + c1.nome);
        System.out.println("Modelo do carro é " + c1.modelo);
        System.out.println("Ano de: " + c1.ano);
        System.out.println("\n--------------------------\n");
        System.out.println("Nome do carro: " + c2.nome);
        System.out.println("Modelo do carro é " + c2.modelo);
        System.out.println("Ano de: " + c2.ano);
    }
}
