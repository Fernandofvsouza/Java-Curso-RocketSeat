public abstract class SoftwareMensagemInstantanea{
     //Aplicando o principio do encapsulamento, trocando os metodos validarConexaoInternet e salvarHistoricoConversas para private, pois são metodos que nao precisam ser acessados fora da classe MSNmessenger.
    public abstract void enviarMensagem();
         
        
    
    public abstract void receberMensagem();

    /*
    private boolean validarConexaoInternet(){
        System.out.println("Conexão validada");
        return true;
    }
    private void salvarHistoricoConversas(){
        System.out.println("Histórico de conversas salvo ");
    }
    */
}
