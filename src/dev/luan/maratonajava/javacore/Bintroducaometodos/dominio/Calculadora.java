package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // Aula 43
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiaDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    // Aula 46
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2){ // Outro meio de fazer a mesma coisa.
        if (num2 == 0){
            return 0;
        } else {
            return num1/num2;
        }

    }
    // Aula 47
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não tem como dividir por zero!");
            return; //Tipo um break, só que para if. Ele para a execução e retorna para a chama de novo.
        }
        System.out.println(num1/num2);
    }

    // Aula 48
    public void alterandoDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    // Aula 52
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    // No final das contas o VArArgs é um Array.
    public void somaVarArgs (int... numeros){ // No final da conta é como o Array, só foi criado para deixar as coisas mais simples. A sintaxe tem que ser desse jeito, com os pontos iguais.
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
