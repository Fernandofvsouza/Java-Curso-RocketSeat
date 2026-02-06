/*
Metodos no java, são funcionalidades que podem ser reutilizadas ao longo do codigo.
Eles podem receber parametros e retornar valores.
Um metodo nao pode ser declarado dentro de outro metodo.
A estrutura de um metodo é composta por:
<tipoDoRetorno> <nomeDoMetodo>(tipo do parametro: Parametro(s)){
    //corpo do metodo
    return <mesmo tipo do retorno>;}

    //Como nomear um metodo: verbo no infinitivo + complemento (se necessario), usando camelCase.
    Exemplo: calcularSoma, formatarCep, enviarEmail, validarFormulario.

//E se o metodo nao retornar nenhum valor?  usamos o tipo void.
sintaxe:
void nomeDoMetodo(tipo do parametro: Parametro(s)){
    //corpo do metodo}    
 */
public class Metodos {

    public static void main(String[] args) {
        //A jvm procura o metodo main para iniciar a execucao do programa, entao todo programa java precisa ter um metodo main.
        prepararCafe("Expresso"); //Argumentos são os valores passados para os parametros dos metodos.

        //Quando chamamos um metodo que retorna um valor, podemos armazenar esse valor em uma variavel, pois se apenas chamarmos o metodo o valor retornado sera perdido.
        String resultadoDespertar = despertar("Carlos");
        System.out.println(resultadoDespertar);


        //Metodos staticos so chamam outros metodos staticos diretamente.
    }


    //Exemplo de metodo
    static String despertar(String usuario) {
        return "Acordando o usuario, " + usuario;
    }

    //Exemplo de metodo sem retorno
    static void prepararCafe(String tipoCafe) {
        System.out.println("Preparando o cafe do tipo: " + tipoCafe);
    }

    
}

