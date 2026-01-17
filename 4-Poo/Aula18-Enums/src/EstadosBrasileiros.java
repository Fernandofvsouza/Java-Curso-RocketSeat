

public enum EstadosBrasileiros {
    PI("Piauí", 22, "Teresina"),
    MA("Maranhão", 21, "São Luís"),
    SP("São Paulo", 35, "São Paulo"),
    RJ("Rio de Janeiro", 33, "Rio de Janeiro"),
    CE("Ceará", 23, "Fortaleza")
    ;
    //Definindo atributos para o enum
    private String nome;
    private int codigo;
    private String capital;
    //Definindo construtor para o enum
    private EstadosBrasileiros(String nome, int codigo, String capital){
        this.nome = nome;
        this.codigo = codigo;
        this.capital = capital;
        //Agora podemos definir atributos para cada objeto do enum
    }
    //Podemos agora criar um get para retornar o nome do estado
    public String getNome(){
        return nome;}
    
    public int getCodigo(){
        return codigo;}

    public String getCapital(){
        return capital;}
    
}
