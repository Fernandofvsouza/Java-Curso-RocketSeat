public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Conceito de polimorfismo
        SoftwareMensagemInstantanea smi = null;
        String appEscolhido = "tlg"; //fcb, tlg

        if(appEscolhido.equals("msn")){
            smi = new MSNmessenger();
        }else if(appEscolhido.equals("fcb")){
            smi = new FacebookMessenger();}
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();    
    }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
