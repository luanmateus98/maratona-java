package dev.luan.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01WhileDoWhileFor {
    public static void main(String[] args) {
        // While, do while e for

        // While
        System.out.println("WHILE");
        int cont  = 0;
        while (cont < 10){ //Tira o sinal de igual.
            System.out.print(++cont + " ");
            //cont++;
        }

        System.out.println();
        System.out.println();

        System.out.println("DO WHILE");
        int contt = 10;
        //Do While
        do {
            System.out.print(contt + " ");
            contt++;
        } while (contt <= 20);

        System.out.println();
        System.out.println();

        System.out.println("FOR");
        //For
        for (int c = 20; c <= 30; c+=2){
            System.out.print(c + " ");
        }
    }
}
