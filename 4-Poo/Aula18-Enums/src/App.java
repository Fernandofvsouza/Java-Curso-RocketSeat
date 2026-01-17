//Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutaveis e disponiveis por todo o sistema.
//Usamos enum quando o nosso modelo de negocio contem objetos de mesmo contexto, que ja existem de forma pre definida, com a certeza de nao haver tanta alteração de valores.

//Exemplo: Dias da semana, meses do ano, estados civis, etc.

public class App {
    public static void main(String[] args) throws Exception {
        EstadosBrasileiros estado = EstadosBrasileiros.CE;
        System.out.println(estado.getNome());
        System.out.println(estado.getCodigo());
        System.out.println(estado.getCapital());

        //Outra forma de instanciar um enum é usando o valueOf
        EstadosBrasileiros estado2 = EstadosBrasileiros.valueOf("SP");
        System.out.println(estado2.getNome());
        //ou
        String codigoEstado = "RJ";
        EstadosBrasileiros estado3 = EstadosBrasileiros.valueOf(codigoEstado);
        System.out.println(estado3.getNome());

        //Tambem podemos listar todos os valores de um enum usando o metodo values()
        for(EstadosBrasileiros eb: EstadosBrasileiros.values()){
            System.out.println("Estado Localizado:");
            System.out.println(eb + " - " + eb.getNome() + " - " + eb.getCapital());
        }
    }
}
