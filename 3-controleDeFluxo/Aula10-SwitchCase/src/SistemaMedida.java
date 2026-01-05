public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        /*
        A estrutura switch, compara o valor de cada caso, com o da variavel sequencialmente e sempre que encontra um valor correspondente, executa o codigo associado ao caso
        */

        String tamanhoCamisa = "M";

        switch(tamanhoCamisa){
            case "P":
                System.out.println("Pequena");
                break;
            case "M":
                System.out.println("Média");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho não encontrado");               
        }

        
    }
}
