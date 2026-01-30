/*
A abstração é o uso de classes abstratas para definir comportamentos comuns para um grupo de subclasses,
sem a necessidade de instanciar a classe abstrata diretamente. Isso permite que as subclasses implementem os métodos abstratos de acordo com suas necessidades específicas, promovendo a reutilização de código e a organização do sistema.
 */



public class App {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro("Rex");
        dog.emitirSom();
        Gato cat = new Gato("Mimi");
        cat.emitirSom();
        cat.dormir();
    }
}
