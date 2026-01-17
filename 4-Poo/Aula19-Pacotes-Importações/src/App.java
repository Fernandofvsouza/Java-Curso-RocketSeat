//Pacotes e importações
/*
Pacotes são usados para organizar classes e evitar conflitos de nomes em projetos Java maiores. Eles funcionam como diretórios que agrupam classes relacionadas. Por exemplo, você pode ter um pacote chamado "com.exemplo.utilidades" que contém várias classes utilitárias.
dentro dos pacotes podemos ter subpacotes, geralmente damos o nome do subpacote com o nome do pacote pai + um ponto + o nome do subpacote, por exemplo:
*Model: armazena as classes que representam os dados e a lógica de negócio da aplicação.
*View: contém as classes responsáveis pela interface do usuário e a apresentação dos dados.
*Controller: gerencia a comunicação entre o Model e a View, processando as entradas do usuário e atualizando a interface conforme necessário.
*services: contém classes que fornecem funcionalidades específicas, como acesso a banco de dados, autenticação, etc.
*utils: armazena classes utilitárias e funções auxiliares que podem ser usadas em várias partes da aplicação.

Importações são usadas para incluir classes de outros pacotes em seu código, permitindo que você utilize funcionalidades já existentes sem precisar reescrever o código. Por exemplo, se você quiser usar a classe ArrayList do pacote java.util, você pode importar essa classe no início do seu arquivo Java com a seguinte linha:
import java.util.ArrayList;
 */


import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Gleyson";
        //Pacotes presentes no java.lang como o integer nao é necessario import
        Integer altura = 2;
        //Pacotes como o BigDecimal ja é necessario fazer o import
        BigDecimal idade = null;

    }
}
