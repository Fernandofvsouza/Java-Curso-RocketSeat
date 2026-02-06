//

public class Pessoa {
    private String nome = "Fernando";
    private int idade;
    private double altura;

   //Metodo getter, usado para obter o valor do atributo, tem sempre o prefixo "get" e sempre retorna o atributo
   //Exemplo:
   public String getNome(){
        return this.nome;
   } 
   public int getIdade(){
        return this.idade;
   }
    public double getAltura(){
        return this.altura;
   }

    //Metodo setter, usado para definir o valor do atributo, tem sempre o prefixo "set" e nao retorna nada (void)
    //Exemplo:
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
