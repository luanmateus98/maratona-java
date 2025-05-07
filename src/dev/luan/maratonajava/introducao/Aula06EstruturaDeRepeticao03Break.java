package dev.luan.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03Break {
    /*
    Break só funciona dentro de um Switch ou loop.
     */
    public static void main(String[] args) {
        int valMax =50;
        for (int i = 0; i < valMax; i++) {
            System.out.print(i + ", ");
            if (i == 25){
                break;
            }
        }
    }
}
