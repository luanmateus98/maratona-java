package dev.luan.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array = {1,4,5,6};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        for (int[] arrayBase : arrayInt){
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
            System.out.println("\n-----------");
        }
        //int[][] arrayInt2 = { {1,2},{1,2,3}, {1,2,3,4,5,6} };
        int[][] arrayInt2 = { {1,2},
                            {1,2,3},
                            {1,2,3,4,5,6} };
    }
}
