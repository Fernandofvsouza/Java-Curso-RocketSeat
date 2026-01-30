public class FacebookMessenger extends SoftwareMensagemInstantanea {
    //Herdando os metodos abstratos da classe SoftwareMensagemInstantanea
    public void enviarMensagem(){
        System.out.println("Mensagem enviada pelo Facebook Messenger");
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo Facebook Messenger");
    }

}
