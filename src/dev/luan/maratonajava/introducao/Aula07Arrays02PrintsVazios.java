package dev.luan.maratonajava.introducao;

public class Aula07Arrays02PrintsVazios {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0;
        // char = '\u0000 ' ' ' espaço em branco;
        // boolean =  false;
        // String = null;

        System.out.println("Int");
        int[] a = new int[3];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println("\nFloat");
        float[] b = new float[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        System.out.println("\nBoolean");
        boolean[] c = new boolean[3];
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        System.out.println("\nChar");
        char[] d = new char[3];
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        System.out.println("\nString");
        String[] s = new String[3];
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);


    }
}
