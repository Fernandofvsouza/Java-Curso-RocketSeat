//O laço while, determina que enquanto uma condição for valida, o bloco de codigo será executado. o laço while testa a condição antes de executar o codigo, logo caso a condição seja invalida no primeiro teste o bloco nem será executado.
/*
sintaxe do while:
while(condição){
    //bloco de código a ser repetido

}
*/
import java.util.Random;
public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        boolean acordado = true;
        int carneirinhosContados = 0;
        while(acordado){
            System.out.println("contando carneirinhos: " + (++carneirinhosContados));
            acordado = !(new Random().nextInt(10) == carneirinhosContados); //Simula que joaozinho adormece ao contar um numero aleatorio de carneirinhos
        }
        System.err.println("Dormiu após contar " + carneirinhosContados + " carneirinhos.");
    }
}