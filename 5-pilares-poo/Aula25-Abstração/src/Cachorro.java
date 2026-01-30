public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); //Super representa a classe pai
    }
    public void emitirSom() {
        System.out.println("Au Au");
    }
    public void dormir(){
        System.out.println(this.nome + " está dormindo.");
    }
}
