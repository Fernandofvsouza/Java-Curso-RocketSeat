public class Gato {
    //Atributos da classe gato
    //Os atributos sao as caracteristicas dos objetos
        String nome;
        String raca;
        int idade;
        int horasDeSonoDiario;

    //Metodos da classe gato
    //Os metodos sao o que os objetos podem fazer
        void miar(String nomeDoGato){
            this.nome = nomeDoGato;
            System.out.println("Miau Miau" + ", eu sou o " + this.nome);
        }

        void dormir(int horasDeSono){
            this.horasDeSonoDiario = horasDeSono;
            System.out.println("Zzzzzzzzz" + ", vou dormir por " + horasDeSono + " horas.");
        }
}
