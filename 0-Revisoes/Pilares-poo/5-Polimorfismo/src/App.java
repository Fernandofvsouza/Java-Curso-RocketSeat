//Polimorfismo é o conceito que permite que uma interface como um metodo ou uma classe, seja usada para representar diferentes tipos de objetos.
//Exemplo uma classe do tipo Animal, pode ser representada por diferentes tipos de animais como Cachorro, Gato, etc. E cada um desses tipos de animais pode ter comportamentos diferentes, mas todos eles podem ser tratados como um tipo de Animal.



public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        cachorro.comer();
        cachorro.dormir();
        gato.emitirSom();
        gato.comer();
        gato.dormir();
    }
}
