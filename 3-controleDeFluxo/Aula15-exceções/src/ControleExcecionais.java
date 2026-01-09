/*
Tratamento de exceções em Java, é a tentativa do programador de lidar com erros de forma controlada, evitando que o programa termine abruptamente.
    Exceções são eventos que ocorrem durante a execução de um programa que interrompem o fluxo normal das instruções.
*/
public class ControleExcecionais {
    public static void main(String[] args) {
        System.out.println("Início do programa");
        try {
            System.out.println(10 / 0); // Isso vai gerar uma ArithmeticException
            System.out.println("Essa linha não será executada devido à exceção acima.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            System.out.println("Bloco finally: Este bloco sempre será executado.");
        }
        System.out.println("Fim do programa");
    }
}