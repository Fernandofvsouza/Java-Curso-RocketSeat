public class Wrappers {
    public static void main(String[] args) throws Exception {
        //Conversão explicita
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        //Conversão com a classe wrapper
        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i);

        //Conversão de string para numeros
        String num = "100";
        int inteiro = Integer.parseInt(num);
        System.out.println(inteiro);

        String numero = "100.123";
        double d2 = Double.parseDouble(numero);
        
        Double valor2 = 120.34;
        System.out.println(valor2.isNaN());
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));//-1 obj1 menor que o obj2, 0 igual, 1 o objeto1 é maior que o objeto2 

    }
}
