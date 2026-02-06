//arrays em java são estruturas de dados que armazenam uma coleção fixa de elementos do mesmo tipo.

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração e inicialização de um array de strings
        // Aqui estamos declarando um array chamado nomeDosNinjas que pode armazenar 3 elementos do tipo String
        String[] nomeDosNinjas = new String[3];
        // Atribuição de valores aos elementos do array
        nomeDosNinjas[0] = "Naruto";
        nomeDosNinjas[1] = "Sasuke";
        nomeDosNinjas[2] = "Sakura";
        System.out.println(nomeDosNinjas[0]); // Imprime "Naruto"
        //E se a gente tentar acessar um índice que não existe no array?
        //System.out.println(nomeDosNinjas[3]); // Isso causará um erro de tempo de execução: ArrayIndexOutOfBoundsException
        
        
        //E se a gente quiser percorrer todos os elementos do array?
        for(int i = 0;i < nomeDosNinjas.length;i++){
            System.out.println(nomeDosNinjas[i]);
        }
        
    }
}
