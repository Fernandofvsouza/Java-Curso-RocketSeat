//Variaveis e constantes no java
public class App {
        //Estrutura de metodos
        //Um metodo nao pode ser declarado dentro de outro metodo
        //tipoDoRetorno nomeObjetivoInfinitivo parametro(s)
        int somar (int numero1, int numero2){
            return numero1 + numero2;
        }
        //Quando o metodo nao tem um tipoDeRetorno definido chamamos com o void
        void cantar(){

        }
        //Podemos retornar um tipo e receber parametros de outro tipo
        String formatarCep (long cep){
            return "Cep formatado";
        }
    public static void main(String[] args) throws Exception {
        //Estrutura Variaveis
        String nome = "Fernando";
        nome = "João";
        int idade = 25;
        double altura = 1.80;
        String profissaoAtual = "desenvolvedor";

        //Estrutura Constantes
        final String sobrenome = "Souza";
        final float ANO_DE_NASCIMENTO = 1999;

        

    
    }
}
