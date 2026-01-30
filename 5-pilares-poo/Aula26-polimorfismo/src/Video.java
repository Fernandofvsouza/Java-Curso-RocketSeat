/*
Exemplo estamos criando um streaming que vai conter filmes, animes e séries
Todos esses tipos de vídeos possuem algumas características em comum, como título, gênero e duração
Mas cada tipo de vídeo também possui características específicas, por exemplo:
Filmes possuem diretor e classificação indicativa
Animes possuem estúdio de animação e número de episódios
Séries possuem número de temporadas e episódios por temporada   
*/ 

public class Video {
    private String titulo;

    public Video(String titulo) {
        this.titulo = titulo;
    }



    public void play() {
        System.out.println("Reproduzindo vídeo: " );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
