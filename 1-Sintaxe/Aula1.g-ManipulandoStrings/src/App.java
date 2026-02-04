public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Ola mundo, esse é o novo mundo";
        //Tamanho da frase
        System.out.println("Tamanho da frase: " + frase.length());// 29 caracteres
        //Contem uma palavra ou caractere
        System.out.println("Contem a palavra 'novo'? " + frase.contains("novo"));// true
        //Descobrir qual indice se encontra a palavra mundo
        System.out.println("Indice da palavra 'mundo': " + frase.indexOf("mundo"));// 4
        //Qual indice da ultima vez que a palavra mundo aparece
        System.out.println("Ultimo indice da palavra 'mundo': " + frase.lastIndexOf("mundo"));// 22
        //Deixando em maiusculo e minusculo
        System.out.println("Frase em maiusculo: " + frase.toUpperCase());
        System.out.println("Frase em minusculo: " + frase.toLowerCase());
        //Tirando os espaços do começo e do fim
        String frase2 = "   Olá mundo   ";
        System.out.println("Frase sem espaços: '" + frase2.trim());
        //Descobrir o conjunto de frase de acordo com os indices
        System.out.println("Conjunto de frase do indice 4 ao 9: " + frase.substring(4, 9));// mundo
        //Comparar duas frases
        String frase3 = "Ola mundo, esse é o novo mundo";
        System.out.println("As frases são iguais? " + frase.equals(frase3));// true

    }
}
