public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 1500.00;
        double valorSolicitado = 200.00;
        //Condicional simples
        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        }//Condicional composta
        else{
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        System.out.println(saldo);
    }
}
