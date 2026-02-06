public class ExemploModificadores {
//Exemplo de atributo publico
public String atributoPublico = "Atributo Publico: Acessivel de qualquer lugar.";
public  void metodoPublico() {
    System.out.println("Metodo Publico: Acessivel de qualquer lugar.");    
}

//Exemplo de modificador private
private String atributoPrivado = "Atributo Privado: Acessivel apenas dentro desta classe.";
private void metodoPrivado() {  
    System.out.println("Metodo Privado: Acessivel apenas dentro desta classe.");    
}

//Exemplo de modificador protected
protected String atributoProtegido = "Atributo Protegido: Acessivel dentro do pacote e em subclasses.";
protected void metodoProtegido() {  
    System.out.println("Metodo Protegido: Acessivel dentro do pacote e em subclasses.");    
}

//Exemplo de modificador protected
protected  String atributoProtected = "Atributo Default: Acessivel apenas dentro do pacote.";
protected void metodoProtected() {  
    System.out.println("Metodo Protected: Acessivel apenas dentro do pacote.");   
    } 

}
