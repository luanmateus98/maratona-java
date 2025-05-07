package dev.luan.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        Scanner tecl = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            idades[i] = tecl.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }

        idades[0] = 24;
        idades[1] = 27;
        idades[2] = 57;

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }
    }
}
