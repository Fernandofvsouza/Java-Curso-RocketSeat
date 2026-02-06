//A herança nos diz que uma classe pode herdar atributos e metodos de outra classe, ou seja, a classe filha herda os atributos e metodos da classe pai. e para isso utilizamos a palvra reservada extends.


public class App {
    public static void main(String[] args) {
        Humano meuSer = new Humano();
        meuSer.crescer(); // O humano está crescendo.
        meuSer.respirar(); // O ser vivo está respirando.
    }
}
