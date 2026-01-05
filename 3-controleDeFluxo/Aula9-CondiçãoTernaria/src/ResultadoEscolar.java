
public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        //Condição ternaria, é uma forma de abreviar um if e else
        //Exemplo:
        int nota = 7;
        //atribuimos uma variavel mediante a condição
        String resultado = nota >= 7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";
        System.out.println("O aluno está: " + resultado);
    }
}
