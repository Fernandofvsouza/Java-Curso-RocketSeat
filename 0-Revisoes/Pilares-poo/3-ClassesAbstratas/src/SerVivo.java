//A classe abstrata tambem não pode ser instanciada, porem a diferença para interface é que podemos colcoar metodos abstratos e concretos, ou seja, com corpo. Alem disso, podemos ter atributos, construtores e blocos de inicialização.

public abstract class SerVivo {
    //Podemos ter um metodo igual a interface, sem corpo
    public abstract void crescer();

    //Podemos ter um metodo concreto, ou seja, com corpo
    public void respirar() {
        System.out.println("O ser vivo está respirando.");
    }   
}
