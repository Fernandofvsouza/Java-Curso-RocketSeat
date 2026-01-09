/*
laços de repetição ou loops, são comandos que permitem repetir um bloco de codigo diversas vezes enquanto uma condição for verdadeira.
*/
//Laço for
/*
O comando for permite que uma variavel contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. o comando for recebe como entrada uma variavel contadora, a condição para continuar a execução e o valor da incrementação dessa variavel.
for(inicialização; condição; incremento){
    //bloco de código a ser repetido
}
*/
public class ExemploFor {
    public static void main(String[] args) throws Exception {
       //Supondo que joaozinho tem que contar 20 carneirinhos para pegar no sono
       for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
        System.out.println("Carneirinho número: " + carneirinhos);
       }

       //Outra sintaxe do for
       int numeroDeCarneirinhos = 20;
         for(; numeroDeCarneirinhos > 0; ){
          System.out.println("Faltam " + numeroDeCarneirinhos + " carneirinhos para pegar no sono");
          numeroDeCarneirinhos--;
         }

         //Tambem usamos o o for para percorrer arrays
            String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Morango"};
            for(int i = 0; i < frutas.length; i++){
                System.out.println("Fruta na posição " + i + ": " + frutas[i]);
            }

            //utilizando o for each para percorrer arrays
            String alunos[] = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
            for(String aluno : alunos){
                System.out.println("Aluno: " + aluno);
            }
            //Break e continue em laços for, podemos usar o break para sair de um laço for antes que ele termine todas as iterações, e o continue para pular uma iteração específica e continuar com a próxima.
            //Exemplo de break
    }
}
