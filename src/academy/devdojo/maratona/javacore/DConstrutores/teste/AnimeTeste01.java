package academy.devdojo.maratona.javacore.DConstrutores.teste;


import academy.devdojo.maratona.javacore.DConstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação", "ProductC" );

//       anime.init("Akudama Drive", "TV", 12);
//        anime.init("Akudama Drive", "TV", 12, "Ação");
//        anime.setGenero("Ação");
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);


        anime.imprime();

    }
}
