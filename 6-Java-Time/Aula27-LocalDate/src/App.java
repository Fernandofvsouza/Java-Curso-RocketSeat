//LocalDate - Representa uma data (ano, mês, dia) sem fuso horário, podemos usar para armazenar datsa de nascimento, datas comemorativas, etc.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class App {
    public static void main(String[] args) throws Exception {
        //Instanciando um objeto LocalDate com a data atual do sistema
        LocalDate dataAtual = LocalDate.now();//.now() é um método estático que retorna a data atual do sistema
        System.out.println("Hoje: " + dataAtual);

        //metodos de criação
        //Data especifica
        LocalDate dataEspecifica = LocalDate.of(2020, 5, 15);//.of(ano, mês, dia)

        //Data a partir de uma string
        //Exemplo consumindo uma api que retorna uma data no formato string
        String stringData = "2023-12-25";
        LocalDate dataAPartirString = LocalDate.parse(stringData);//.parse(string) converte uma string no formato ISO (yyyy-MM-dd) para um objeto LocalDate

        //Convertendo uma data para string
        String dataConvertidaParaString = dataAtual.toString();//.toString() converte um objeto LocalDate para uma string no formato ISO (yyyy-MM-dd)

        //Formatando uma data, que esta no modelo brasileiro para o formato ISO
        String dataBrasileira = "25/12/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(dataBrasileira, formatter);
        System.out.println("Data formatada: " + dataFormatada);
//--------- ----------------------------------------------------------------------------------------------------------
        //Manipulando datas
        LocalDate meuAniversario = LocalDate.of(1990, 8, 20);
        LocalDate proximoAniversario = meuAniversario.plusYears(34);//.plusYears(n) adiciona n anos
        System.out.println("Meu próximo aniversário: " + proximoAniversario);

        LocalDate dataPassada = dataAtual.minusMonths(3);//.minusMonths(n) subtrai n meses, .minusDays(n) subtrai n dias, .minusYears(n) subtrai n anos
        System.out.println("Data passada: " + dataPassada);
//-------------------------------------------------------------

        //Obtendo informações de uma data
        int ano = dataAtual.getYear();//.getYear() retorna o ano
        int mes = dataAtual.getMonthValue();//.getMonthValue() retorna o mês como número (1-12)
        int dia = dataAtual.getDayOfMonth();//.getDayOfMonth() retorna o dia do mês
        System.out.println("Ano: " + ano + ", Mês: " + mes + ", Dia: " + dia);
//-------------------------------------------------------------

        //Comparando datas
        LocalDate data1 = LocalDate.of(2022, 1, 1);
        LocalDate data2 = LocalDate.of(2023, 1, 1); 
        //.isBefore(), .isAfter(), .isEqual()
        System.out.println("data1 é antes de data2? " + data1.isBefore(data2));
        System.out.println("data1 é depois de data2? " + data1.isAfter(data2));
        System.out.println("data1 é igual a data2? " + data1.isEqual(data2));
//-------------------------------------------------------------

        //Formatação personalizada de datas para exibição
        LocalDate dataParaFormatar = LocalDate.of(2023, 12, 31);
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + dataParaFormatar.format(formatoPersonalizado));

        //Formatações ja feitas pelo java
        String dataNovaFormatada = dataParaFormatar.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Data formatada (Long): " + dataNovaFormatada);//31 de dezembro de 2023
        String dataMediaFormatada = dataParaFormatar.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Data formatada (MEDIUM): " + dataMediaFormatada);//31 de dez de 2023
        String dataCurtaFormatada = dataParaFormatar.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Data formatada (SHORT): " + dataCurtaFormatada);//31/12/23
        String dataCompletaFormatada = dataParaFormatar.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Data formatada (FULL): " + dataCompletaFormatada);//domingo, 31 de dezembro de 2023

        //Dados especificos de uma data
        LocalDate dataExemplo = LocalDate.of(2024, 2, 29);
        System.out.println("Ano: " + dataExemplo.getYear());
        System.out.println("Mês: " + dataExemplo.getMonthValue());
        System.out.println("Dia: " + dataExemplo.getDayOfMonth());
        
    }
}


