public class Student {

    int idade;
    String nome;
    String curso;
    String universidade;

    void introduceYourself(int idade, String nome, String curso, String universidade) {
        idade = this.idade;
        nome = this.nome;
        curso = this.curso;
        universidade = this.universidade;
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos, estudo " + curso + " na universidade " + universidade + ".");
    }
    void comidaFavorita(Food comida) {
        System.out.println("Minha comida favorita é " + comida.nomeComida + ".");
    }

}
