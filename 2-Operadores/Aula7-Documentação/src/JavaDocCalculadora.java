
public class JavaDocCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Integer resultado = calculadora.dividir(10, 2);
        System.err.println("Resultado: " + resultado);
    }
}