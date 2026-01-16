//Instancia é quando criamos um objeto a partir de uma classe

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Silva");//Istancia gleyson do objeto Cliente
        System.out.println(gleyson.limiteCredito);//10.0
        gleyson.solicitarLimiteCredito(50.0);
        System.out.println(gleyson.limiteCredito);//50.0

        Cliente maria = new Cliente("Maria Souza");//Istancia maria do objeto Cliente
        System.out.println(maria.limiteCredito);//10.0
        maria.comprar(3.0);
        System.out.println(maria.limiteCredito);//7.0
    }
}
