//Break e continue em laços for, podemos usar o break para sair de um laço for antes que ele termine todas as iterações, e o continue para pular uma iteração específica e continuar com a próxima.
public class BreakContinue {
    public static void main(String[] args) throws Exception {
        //Exemplo de break
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                
                break; // Sai do laço quando i for igual a 3
                
               
            }
            System.out.println(i);
            
        }

        //Exemplo de continue
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue; // Pula a iteração quando numero for igual a 3
            }
            System.out.println(numero);
        }
    }
}