public class Sandero implements Carro{
   //Apos o uso da palavra implements, a classe é obrigada a implementar todos os metodos da interface, ou seja, a classe tem que seguir o contrato definido pela interface.
   
    @Override
    public void acelerar() {
        System.out.println("O Sandero esta acelerando");
    }
    @Override
    public void frear() {
        System.out.println("O Sandero esta freiando"); }

    @Override
    public void parar() {
        System.out.println("O Sandero esta parando");}
    //@Override significa que estamos sobrescrevendo um metodo da interface.

}
