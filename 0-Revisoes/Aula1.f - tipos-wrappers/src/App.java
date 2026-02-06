//Tipos wrappers em java, são classes que encapsulam tipos primitivos em objetos, fazendo com que dessa maneira seja possível utilizar métodos e funcionalidades adicionais que não estão disponíveis para os tipos primitivos.



public class App {
    public static void main(String[] args) throws Exception {
        //Autoboxing: é o processo pelo qual o compilador Java converte automaticamente um tipo primitivo em seu correspondente tipo wrapper.
        int num1 = 10;
        Integer wrappedNum1 = num1; // Autoboxing
        //ou
        Integer num2 = 5;
        Double wrappedNum2 = 3.14; // Autoboxing
        //String ja é um tipo wrapper, pois encapsula uma sequência de caracteres em um objeto.

        //Unboxing: é o processo inverso, onde o compilador converte automaticamente um objeto do tipo wrapper de volta para seu tipo primitivo correspondente.
        int x = num1; // Unboxing
        double y = wrappedNum2; // Unboxing


        //ALGUNS METODOS UTEIS DOS TIPOS WRAPPERS
        //convertendo um int para String
        String strNum = Integer.toString(100);
        //convertendo uma String para int
        int parsedNum = Integer.parseInt("200");
        //convertendo uma String para double
        double parsedDouble = Double.parseDouble("3.14");
        //Convertendo uma string para boolean
        boolean parsedBool = Boolean.parseBoolean("true");
        //Convertendo uma string para char
        char parsedChar = "Pizza".charAt(0);

        //Verificando se um valor é NaN (Not a Number)
        boolean isNan = Double.isNaN(parsedDouble);

        //verificando se um caractere é uma letra
        System.out.println(Character.isLetter(parsedChar));

        //Transformando uma string em maiusculo
        String upperStr = "hello".toUpperCase();

        //Transformando uma string em minusculo
        String lowerStr = "WORLD".toLowerCase();


    }
}
