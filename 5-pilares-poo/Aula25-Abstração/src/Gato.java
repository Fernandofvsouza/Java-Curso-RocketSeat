public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
    public void emitirSom() {
        System.out.println("Miau!");
    }
    public void dormir(){
        System.out.println(this.nome + " está dormindo.");
    }

}
