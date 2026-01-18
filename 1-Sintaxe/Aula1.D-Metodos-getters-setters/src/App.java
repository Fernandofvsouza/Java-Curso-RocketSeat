


public class App {
    public static void main(String[] args) throws Exception {
       Pessoa pessoa = new Pessoa();
       //Usando o metodo getter para obter o valor do atributo nome
        System.out.println(pessoa.getNome());
         //Usando o metodo setter para redefinir o valor do atributo nome
        pessoa.setNome("João");
        pessoa.setIdade(25);
        pessoa.setAltura(1.75);
        //Usando o metodo getter para obter o valor do atributo nome novamente
        System.out.println(pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());


    }
}
