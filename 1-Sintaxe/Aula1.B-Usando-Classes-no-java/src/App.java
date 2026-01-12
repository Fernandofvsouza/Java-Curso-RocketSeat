
/*
O que são classes?
classes sao estruturas que permitem representar objetos do mundo real no codigo.
Elas servem como um molde para criar objetos, encapsulando atributos (variaveis) e metodos (funções) relacionados a esses objetos.

sintaxe para declarar uma classe, utilizando a convenção de nomenclatura PascalCase:
class NomeDaClasse {
    //atributos
    //metodos
    }

//Os objetos sao instancias das classes, ou seja, sao criados a partir das classes e possuem os atributos e comportamentos definidos nelas.
//A classe app é a classe principal do programa, onde a execução começa e onde contem o metodo main.
//A classe Gato é uma classe que representa um objeto do mundo real, no caso um gato, com seus atributos e comportamentos.
 */
public class App {
    public static void main(String[] args) {
        Gato meuGato = new Gato(); //Criando um objeto da classe Gato
        meuGato.nome = "Whiskers";
        meuGato.raca = "Siamês";
        meuGato.idade = 3;
        meuGato.horasDeSonoDiario = 14;

        System.out.println("Nome do gato: " + meuGato.nome);
        System.out.println("Raça do gato: " + meuGato.raca);
        System.out.println("Idade do gato: " + meuGato.idade + " anos");

        meuGato.miar(meuGato.nome);
        meuGato.dormir(meuGato.horasDeSonoDiario);

    }

}