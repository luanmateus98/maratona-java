package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais02ElseIf {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 e < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 18;
        String categoria; // A variavel local tem que ser inicializada dentro do bloco, se ela ficar vazia pode ocorrer um erro.

        if (idade < 15){
            categoria = "Categoria Infantil.";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto.";
        }

        System.out.println(categoria);
    }
}
