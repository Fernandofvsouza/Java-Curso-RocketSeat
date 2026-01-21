/*
Classes essenciais: Em Java, quando se fala em “classes essenciais”, normalmente refere-se às classes fundamentais que quase todo programa Java usa. Elas já vêm com o Java e resolvem tarefas básicas como texto, números, entrada/saída, datas e coleções.
Essas classes estão organizadas em pacotes, que são como pastas que ajudam a manter tudo arrumado. Aqui estão algumas das principais classes essenciais e seus pacotes:
Pacotes:
1. java.lang: Este é o pacote mais básico e é importado automaticamente em todos os programas Java. Ele contém classes essenciais como:
   - Object: A classe raiz de todas as classes em Java.
   - String: Para manipulação de texto.
   - Math: Para operações matemáticas.
   - System: Para entrada/saída padrão e propriedades do sistema.
2. java.io: Este pacote contém classes para entrada e saída de dados, como:
   - File: Para manipulação de arquivos.
   - InputStream e OutputStream: Para leitura e escrita de dados binários.
   - Reader e Writer: Para leitura e escrita de dados de texto.
3. java.time: Introduzido no Java 8, este pacote contém classes para manipulação de datas e horas, como:
   - LocalDate: Representa uma data (ano, mês, dia).
   - LocalTime: Representa um horário (hora, minuto, segundo).
   - LocalDateTime: Combina data e hora.
4. java.util: Este pacote contém várias classes utilitárias, incluindo coleções e outras ferramentas úteis:
   - ArrayList, HashMap, HashSet: Implementações comuns de coleções.
    - Date e Calendar: Para manipulação de datas (embora o java.time seja preferido atualmente).
    - Scanner: Para leitura de entrada do usuário.
Essas classes e pacotes formam a base para a maioria dos programas Java, permitindo que os desenvolvedores realizem tarefas comuns de forma eficiente e eficaz.
 */
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exemplo de uso de algumas classes essenciais em Java
        // Usando a classe String do pacote java.lang
        String mensagem = "Olá, Mundo!";
        System.out.println(mensagem);
        System.err.println("Esta é uma mensagem de erro.");
        //----------------------------------

        //Usando o pacote java.util e (java.lang) para o scanner
        String nome;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Olá, " + nome + "!");
        input.close();
        String nomeUser = null;
        Integer idadeUser = null;
        Double alturaUser = null;
        //Simulando a leitura de uma linha de um arquivo CSV
        String stringLinhaArquivo = "João,25,1.75";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(",");// Define a vírgula como delimitador
        //Lendo os dados
        int index = 0;
        while(scan.hasNext()){
            if(index == 0){
                nomeUser = scan.next();
            } else if(index == 1){
                idadeUser = Integer.valueOf(scan.next());
            } else if(index == 2){
                alturaUser = Double.valueOf(scan.next());
            }
            index++;
        }
        System.out.println("Nome: " + nomeUser);
        System.out.println("Idade: " + idadeUser);
        System.out.println("Altura: " + alturaUser);
        scan.close();
        //-------------------------------------
        //exemplo java.io
        /*File arquivo = new File("exemplo.txt");
        if(arquivo.createNewFile()){
            System.out.println("Arquivo criado: " + arquivo.getName());
        } else {
            System.out.println("O arquivo já existe.");
        }*/

       //-------------------------------------
       //exemplo java.time
       LocalDate dataAtual = LocalDate.now();
       System.out.println("Data atual: " + dataAtual.toString());
        

        




        
    }
}
