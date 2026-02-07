public class Gato implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo ração");
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo");
    }

}
