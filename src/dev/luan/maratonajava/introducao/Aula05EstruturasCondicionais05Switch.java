package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais05Switch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo.]

        byte dia = 9;
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

        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido.");
        }
    }
}
