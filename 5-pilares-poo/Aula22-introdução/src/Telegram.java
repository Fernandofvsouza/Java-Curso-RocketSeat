public class Telegram extends SoftwareMensagemInstantanea {
    //Herdando os metodos abstratos da classe SoftwareMensagemInstantanea
    public void enviarMensagem(){
        System.out.println("Mensagem enviada pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo Telegram");
    }

}
