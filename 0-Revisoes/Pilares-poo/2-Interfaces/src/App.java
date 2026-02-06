public class App {
    public static void main(String[] args) throws Exception {
       //Quando instaciamos a classe sandero, podemos referir ao carro, mas o new tem que ser com o nome da classe que implementa a interface, exemplo:
       Carro sandero = new Sandero();
        sandero.acelerar();

    }
}
