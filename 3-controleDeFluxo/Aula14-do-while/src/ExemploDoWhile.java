/*
A diferença entre o while e o do while é que o while verifica a condição antes de executar o bloco de código, enquanto o do while executa o bloco de código pelo menos uma vez antes de verificar a condição.
    sintaxe do do while:
    do{
        //bloco de código a ser repetido
    }while(condição);
    //Exemplo: joaozinho decidiu ligar para seu amigo dizendo que hoje se entupiu de comer doces
*/

import java.util.Random;
public class ExemploDoWhile{
    public static void main(String[] args) throws Exception {
      System.out.println("Discando o numero do seu amigo...");
      do { 
          //Executando repetidamente enquanto o amigo nao atender
          System.out.println("trim trim trim...");
      } while (tocando());
        System.err.println("Alô, amigo! Consegui falar com você!");
    }





    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;//gera um numero aleatorio entre 0 e 2, se for 1 o amigo atende
        System.out.println("atendeu? " + atendeu);
        return !atendeu;//retorna true se o amigo nao atendeu

    }
    
}