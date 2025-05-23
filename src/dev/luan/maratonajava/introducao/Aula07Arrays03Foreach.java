package dev.luan.maratonajava.introducao;

public class Aula07Arrays03Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Formas de declarar Arrays
        int[] numeros2  = {1,2,3,4,5};
        int[] numeros3  = new int[]{5,4,3,2,1};

        //For
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println();

        //Foreach - Esse for só tem como fazer a leitura completa, não tem como acessar o indice que desejar. Essa é uma versão simplificada.
        for (int num : numeros3){
            System.out.println(num);
        }

    }
}
