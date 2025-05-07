package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Switch {
    public static void main(String[] args) {
        // Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo.

        byte dia = 7;
        // Exceções que podem ser usadas: char, int, byte, short, enum e String. Houve uma mudança no Java 12 para frente.
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não tem esse dia");
                break;
        }
        if (dia == 1 || dia == 7){
            System.out.println("Esse dia não é útil.");
        } else {
            System.out.println("Esse dia é útil.");
        }

        // Como o Willian Criou
        System.out.println();
        System.out.println("Como Willian criou");

        byte d = 4;
        switch (d){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Inválido.");
                break;        }
    }
}
