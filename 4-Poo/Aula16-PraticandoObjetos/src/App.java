public class App {
    public static void main(String[] args) throws Exception {
       Student student = new Student();
        student.idade = 21;
        student.nome = "Fernando";
        student.curso = "Ciência da Computação";
        student.universidade = "UFRN";
        student.introduceYourself(student.idade, student.nome, student.curso, student.universidade);
        student.comidaFavorita(new Food());
    }
}
