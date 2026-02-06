
public abstract class SerVivo {
    protected int idade;
    public SerVivo(int idade) {
        this.idade = idade;
    }




    public abstract void crescer();

   
    public void respirar() {
        System.out.println("O ser vivo está respirando.");
    }   
}