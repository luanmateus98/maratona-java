package dev.luan.maratonajava.introducao;

public class Aula02TiposPremitivos {
    public static void main(String[] args) {
        /* 1 - int, double, float, char, byte, short, long, boolean;
        2 - Casting é uma forma de força um valor de um tipo entrar dentro de outro valor de outro tipo;
        3 - String não é um tipo primitivo e sim uma Classe.
         */

        int idade = (int ) 10000000000L; //Casting é um formatado de forçar um número long a que entre dentro de um int.
        long numeroGrande = 1000000000;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D; // Forçando a entrada de um Double em um Float com o Casting
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 65; // Pode ser 'A' ou pode ser 65, mas aí vai buscar o que significa o 65 na Tabela Ascii
        /*
        todos os tipos primitivos recebem números (menos o boolean) dependendo do seu tamanho.
         */
        String nome = "Luan"; // Não tem limite de caracteres, pode ser um texto grande.


        System.out.println("A idade é " + idade + " Anos");
        System.out.println( caracter);
        System.out.println( salarioFloat);
        System.out.println("Oi, meu nome é " + nome);

    }
}
