public class MSNmessenger {
    //Aplicando o principio do encapsulamento, trocando os metodos validarConexaoInternet e salvarHistoricoConversas para private, pois são metodos que nao precisam ser acessados fora da classe MSNmessenger.
    public void enviarMensagem(){
        if(validarConexaoInternet()){
            System.out.println("Mensagem enviada pelo MSN Messenger");
        }//Agora o metodo validarConexaoInternet(private) esta sendo chamado dentro do metodo enviarMensagem(public), garantindo que a conexao sera validada sempre que uma mensagem for enviada. esse e um exemplo de encapsulamento.
        else{
            System.out.println("Falha ao enviar mensagem: sem conexão com a internet.");
        }
         
        
    }
    public void receberMensagem(){
         if(validarConexaoInternet()){
            System.out.println("Mensagem recebida pelo MSN Messenger");
        }//Agora o metodo validarConexaoInternet(private) esta sendo chamado dentro do metodo receberMensagem(public), garantindo que a conexao sera validada sempre antes da mensagem ser recebida. esse e um exemplo de encapsulamento.
        else{
            System.out.println("Falha ao receber mensagem: sem conexão com a internet.");
        }
    }
    private boolean validarConexaoInternet(){
        System.out.println("Conexão validada pelo MSN Messenger");
        return true;
    }
    private void salvarHistoricoConversas(){
        System.out.println("Histórico de conversas salvo pelo MSN Messenger");
    }

}

