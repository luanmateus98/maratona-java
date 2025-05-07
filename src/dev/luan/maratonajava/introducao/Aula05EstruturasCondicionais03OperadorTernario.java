package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais03OperadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000;
        double salario = 37000;
        //String mensagemDoar = "Eu vou doar 500 pro DevDojo.";
        //String mensagemNaoDoar = "Ainda não tenho condição de doar, mas vou ter.";

        //(condição) ? verdadeiro : falso; ----- Operador Ternário
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; Pode ser assim. E o tipo precisa bater com as variávies.
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo." : "Ainda não tenho condição de doar, mas vou ter."; // Pode ser assim também
        boolean isPossoDoar = salario > 5000 ? true : false;

        System.out.println(isPossoDoar);
        System.out.println(resultado);



        // Pode fazer desse jeito também, mas não é recomendado por ser difícil de ler.
        int idade = 18;

        /*if (idade < 15){
            categoria = "Categoria Infantil.";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto.";
        }*/

        // Pode fazer desse jeito também, mas não é recomendado por ser difícil de ler.
        String categoria = idade < 15 ? "Categoria Infantil." : idade >= 15 && idade < 18 ? "Categoria Juvenil." : "Categoria Adulto.";
        System.out.println(categoria);

    }
}
