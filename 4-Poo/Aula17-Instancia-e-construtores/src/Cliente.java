public class Cliente {
    String nome;
    Double limiteCredito = 10.0;
    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }
    public void comprar(Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
    //Metodo construtor, é quando criamos um metodo com o mesmo nome da classe, para ja inicializar os atributos, quando instanciamos o objeto
    //Classe Cliente com metodo construtor
    public Cliente(String nomeCliente){
        nome = nomeCliente;
    }

}
