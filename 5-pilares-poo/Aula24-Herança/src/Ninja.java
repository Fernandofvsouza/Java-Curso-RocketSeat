public class Ninja {
    private String nome;
    private int idade;
    private String aldeia;

    public void getNome(String nome) {
        this.nome = nome;
    }
    public String setNome() {
        return nome;}
    public void getIdade(int idade) {
        this.idade = idade;}
    public int setIdade() {
        return idade;}
    public void getAldeia(String aldeia) {
        this.aldeia = aldeia;}
    public String setAldeia() {
        return aldeia;}

    /* Método que será herdado pela classe Uchiha
     */
    /* 
    public void SharinganAtivado() {
        System.out.println("Sharingan Ativado!");
     }
     */
}
