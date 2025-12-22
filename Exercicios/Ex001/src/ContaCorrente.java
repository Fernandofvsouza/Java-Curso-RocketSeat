public class ContaCorrente{
    int numero, agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    double saldo;
    boolean ativo = true;

    List ConsultarExtrato(LocalDate dataInicial, LocalDate dataFinal ){
                //Deve retornar uma list
    }
    void cancelar(String justificativa){
        //Algoritmo para que passe a variavel ativo para false;
    }
    void transferir(ContaCorrente ContaDestino, double valor){

    }
    void sacar (double valorSacado){

    }

}