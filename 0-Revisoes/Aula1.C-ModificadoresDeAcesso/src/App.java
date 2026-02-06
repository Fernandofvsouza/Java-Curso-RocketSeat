 //Modificadores de Acesso: public, private, protected e default (pacote)
 // Modificadores de acesso definem a visibilidade e o alcance de classes, metodos e atributos em Java.

/*
Java possui 4 niveis de acesso:
1- public: acessivel na mesma classe, package(pacote), subclasses e em todo o projeto.
2- protected: acessivel na mesma classe, package(pacote) e subclasses. 
3- default: acessivel na mesma classe e package(pacote). Nao possui palavra chave especifica, é o padrao quando nenhum modificador é definido.
4- private: acessivel apenas na mesma classe.
*/

public class App {
    public static void main(String[] args) {
        System.out.println("Modificadores de Acesso em Java");

        // Criando um objeto da classe ExemploModificadores
        ExemploModificadores exemplo = new ExemploModificadores();
        // Acessando atributos e metodos com diferentes modificadores de acesso
        System.out.println("Atributo Publico: " + exemplo.atributoPublico);
        exemplo.metodoPublico();


        //Nao é possivel acessar atributos e metodos private de fora da classe
        //System.out.println("Atributo Privado: " + exemplo.atributoPrivado); // Erro de compilacao
        //exemplo.metodoPrivado(); // Erro de compilacao

        //Atributos e metodos protected podem ser acessados dentro do mesmo pacote
        System.out.println("Atributo Protegido: " + exemplo.atributoProtegido);
        exemplo.metodoProtegido();
    }
}



