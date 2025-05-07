package dev.luan.maratonajava.introducao;

public class Aula07Arrays03For {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Luan";
        nomes[1] = "Enmily";
        nomes[2] = "Edelmir";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println();
        String[] sobrenome = {"Araújo", "Silva", "Oliveira"};
        for (int i = 0; i <= 2; i++) {
            System.out.println(sobrenome[i]);
        }

        System.out.println();
        nomes = new String[3]; // Por mais que seja o mesmo nome que o primeiro, depois que inicializado denovo ele vem null.
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
