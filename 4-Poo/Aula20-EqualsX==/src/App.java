/*
Equals versus == em Java
quando estamos comparando valores primitivos (int, char, boolean, etc.), usamos o operador "==".
Por exemplo:
int a = 5;
int b = 5;
if (a == b) {
    System.out.println("a é igual a b");}
Neste caso, a comparação retorna true porque os valores primitivos são iguais.
-------------------------
Por outro lado, quando estamos comparando objetos (instâncias de classes), usamos o método equals().
Por exemplo:
String str1 = new String("Olá");
String str2 = new String("Olá");
if (str1.equals(str2)) {
    System.out.println("str1 é igual a str2");}
Neste caso, a comparação retorna true porque o conteúdo dos objetos é igual, mesmo que sejam instâncias diferentes.
-------------------------

 */

public class App {
    public static void main(String[] args) throws Exception {
        //Exemplos com valores primitivos
        int a = 5;
        int b = 5;
        if (a == b) {
            System.out.println("a é igual a b");
        } else {
            System.out.println("a não é igual a b");
        }
        //Exemplos com objetos
        String str1 = new String("Olá");
        String str2 = new String("Olá");
        if (str1.equals(str2)) {
            System.out.println("str1 é igual a str2");
        } else {
            System.out.println("str1 não é igual a str2");
        }

        //Exemplo com um tipo primitivo e um objeto, usamos equals()
        String str3 = new String("Mundo");
        String str4 = "Mundo";
        if (str3.equals(str4)) {
            System.out.println("str3 é igual a str4");
        } else {
            System.out.println("str3 não é igual a str4");
        }

        //Podemos usar o equalsIgnoreCase() para comparar strings ignorando maiúsculas e minúsculas
        String str5 = new String("Java");
        String str6 = "java";
        if (str5.equalsIgnoreCase(str6)) {
            System.out.println("str5 é igual a str6 (ignorando maiúsculas e minúsculas)");
        } else {
            System.out.println("str5 não é igual a str6");
        }

        //Comparando com objetos de uma classe personalizada
        Carro carro1 = new Carro("Model S", "Vermelho", "Tesla");
        Carro carro2 = new Carro("Model S", "Vermelho", "Tesla");
        if (carro1.equals(carro2)) {
            System.out.println("carro1 é igual a carro2");
        } else {
            System.out.println("carro1 não é igual a carro2");
        }//Por padrão, isso retornará "carro1 não é igual a carro2" porque estamos comparando referências de objetos diferentes, 
        //para comparar o conteudo do carro1 e carro2, podemos utilizar o equals() and hashcode() na classe Carro.
        



    }
}
