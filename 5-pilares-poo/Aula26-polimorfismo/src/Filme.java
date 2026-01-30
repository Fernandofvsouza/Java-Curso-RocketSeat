public class Filme extends Video {
    private String audio;
    private String legenda;
    private String qualidade;

    public Filme(String titulo) {
        super(titulo);
        this.audio = "Inglês";
        this.legenda = "Português";
        this.qualidade = "1080p";
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo filme: " + getTitulo());}

    //Polimorfismo de sobrecarga (overloading), criando vários métodos com o mesmo nome, mas com parâmetros diferentes
    public void play(String audio) {
        this.audio = audio;
        System.out.println("Play: " + toString());
        
        
    }    

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
        
    }

    public void play(String audio, String legenda, String qualidade) {
        this.audio = audio;
        this.legenda = legenda;
        this.qualidade = qualidade;
        System.out.println("Play: " + toString());
        
    }


    @Override
    public String toString(){
         String informacao = "Filme: " + getTitulo() + ", Áudio: " + audio + ", Legenda: " + legenda + ", Qualidade: " + qualidade;
         return informacao;
    }
}
