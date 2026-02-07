public class Cachorro implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo");
    }

}
