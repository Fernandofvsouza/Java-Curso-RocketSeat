public class Humano extends SerVivo {
    //Pra chamar o construtor da classe mae(serVivo) precisamos usar a palavra reservada super, e passar os parametros necessarios, caso haja.
    public Humano() {
        super(42);//A palavra super aciona o construtor da classe mae, ou seja, da classe SerVivo.
    }

    @Override
    public void crescer() {
        System.out.println("O humano está crescendo.");
        System.out.println("Idade do humano: " + this.idade);
    }

    //Ou seja precisamos implementar o metodo crescer da classe SerVivo pois nao teve corpo na classe abstrata, ja a classe respirar ja tem corpo, entao nao precisamos implementar, mas podemos usar normalmente.

}
