package dev.luan.maratonajava.javacore.Csobrecargametodos.test;

import dev.luan.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akumada Drive", "TV", 12, "Ação");
        anime.imprime();


    }
}
