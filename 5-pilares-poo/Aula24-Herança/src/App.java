/*
Herança em Java é quando uma classe herda atributos e métodos de outra classe. Serve pra reaproveitar código

Conceito básico
	•	Classe pai (superclasse): a classe que é herdada
	•	Classe filha (subclasse): a classe que herda
	•	Usa-se a palavra-chave extends

 */

//Por exemplo sabemos que apenas o Sasuke é um Uchiha, então somente o Sasuke tem o sharingan, entao criamos uma classe Uchiha que herda da classe Ninja o metodo SharinganAtivado


public class App {
    public static void main(String[] args) throws Exception {
        //Objeto 1
        Ninja Naruto = new Ninja();
        Naruto.getNome("Naruto Uzumaki");
        Naruto.getIdade(17);
        Naruto.getAldeia("Aldeia da folha");

        //Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.getNome("Sasuke Uchiha");
        Sasuke.getIdade(18);
        Sasuke.getAldeia("Aldeia da folha");
        Sasuke.SharinganAtivado();

        //Objeto 3
        Ninja Sakura = new Ninja();
        Sakura.getNome("Sakura Haruno");
        Sakura.getIdade(18);
        Sakura.getAldeia("Aldeia da folha");

        //Objeto 4
        Ninja Hinata = new Ninja();
        Hinata.getNome("Hinata Hyuga");
        Hinata.getIdade(16);
        Hinata.getAldeia("Aldeia da folha");
    }
}
