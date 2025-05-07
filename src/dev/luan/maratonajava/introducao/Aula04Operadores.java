package dev.luan.maratonajava.introducao;

public class Aula04Operadores {
    /**
     * a soma de dois valores inteiros retornana um valor inteiro mesmo que o resultado
     * seja Double. Mas pode força um casting como no compilador.
     */
    public static void main(String[] args) {
        // Operadores Aritméticos + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01/ (double)numero02; //
        System.out.println(resultado);

        // % - resto da Divisão, sempre vai ser 0 ou 1
        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores de Relacionais (Maior >), (Menor <), (Maior ou igual >=), (Menor ou igual <=), (Igual ==) ou (Diferente !=).
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaior0uIgualVinte = 10 >= 20;
        boolean isDezMenorOuIgualVinte = 10 <= 20;
        boolean isDezIgualDeVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQue: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQue: " + isDezMenorQueVinte);
        System.out.println("isDezMaiorOuIgual: " + isDezMaior0uIgualVinte);
        System.out.println("isDezMenorOuIgual: " + isDezMenorOuIgualVinte);
        System.out.println("isDezIgual: " + isDezIgualDeVinte);
        System.out.println("isDezDiferente: " + isDezDiferenteDeVinte);

        // Operadores Lógicos (And (E) &&), (Or (OU) ||) e (Not (Não) !)
        // &&
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        // ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // !
        boolean isLigado = false;
        boolean isLigadoVerdadeiro = !(isLigado); //isLigadoVerdadeiro se torna True
        System.out.println("isLigado é " + !isLigadoVerdadeiro); // Aqui vira False de novo

        //Operadores Aritméticos = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; // É a mesma coisa que: bonus = bonus + 1000;
        bonus -= 1000; //bonus = bonus - 1000;
        bonus *= 1000;
        bonus /= 1000;
        bonus %= 1000;
        System.out.println("Bonus " + bonus);

        //Incremento e Decremento
        int contador = 0;
        contador += 1;
        contador++; // Só faz 1 numero por vez
        contador--;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador++); //Faça primeiro o que tem que fazer e depois incremente.
        System.out.println(++contador); //Primeiro incremente e depois faça o que tem que fazer.

    }
}
