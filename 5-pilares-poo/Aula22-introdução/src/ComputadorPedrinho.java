public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNmessenger msn = new MSNmessenger(); //Pedrinho instalou o MSN Messenger em seu computador
        //msn.validarConexaoInternet();
        msn.enviarMensagem();
        msn.receberMensagem();
        //msn.salvarHistoricoConversas();

        FacebookMessenger facebook = new FacebookMessenger(); //Pedrinho instalou o Facebook Messenger em seu computador
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram(); //Pedrinho instalou o Telegram em seu computador
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
