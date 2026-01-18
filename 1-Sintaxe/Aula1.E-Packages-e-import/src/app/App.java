//Vamos supor que estamos criando um software de streaming com as seguintes classes:
/*
pacotes representando categorias de vídeos:
Filme.java
Serie.java
Anime.java
Novela.java
Documentario.java
-----------------
pacotes representando a interface do usuário ou gui (graphical user interface):
    Janela.java
    MiniaturaVideo.java
        ----------------
        subcategorias botoes de controle de vídeo:
        BotaoPlay.java
        BotaoPause.java
        BotaoVoltar.java
------------------
App.java
*/
package app;
import videos.Novela;
public class App {
    public static void main(String[] args) throws Exception {
        Novela novela = new Novela();
        System.out.println(novela.getNome());
    }
}