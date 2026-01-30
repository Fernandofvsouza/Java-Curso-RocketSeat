//Polimorfismo
//Poli -> muitas
//Morfo -> formas

//Permite que o mesmo nome, método ou função possa se comportar de maneiras diferentes
//Existem dois tipos de polimorfismo:
//Sobrecarga de métodos (overloading)
//Sobrescrita de métodos (overriding)



public class App {
    public static void main(String[] args) throws Exception {
        //Polimorfismo de sobreposição (overriding)
       Filme filme = new Filme("Inception");
        filme.play();//Como fizemos uma sobrescrita do método play, ele vai chamar o método da classe Filme

        //Polimorfismo de sobrecarga (overloading), quando criamos vários métodos com o mesmo nome, mas com parâmetros diferentes
        filme.play("Inglês");
        filme.play("Inglês", "Espanhol");
        filme.play("Inglês", "Espanhol", "4K");



    }
}
