public class Cliente {
  //Exemplos de declaração de metodos
  public double somar(int num1, int num2){
    //logica e finalidade do metodo
    return num1 + num2;
  }
  public void imprimir(String texto){
    //Logica - finalidade do metodo
    //Aqui nao ha retorno
  }

  //throws Exception: indica que o metodo ao ser utilizado pode gerar uma excecao
  double dividir(int dividendo, int divisor) throws Exception {
    if (divisor == 0) {
      throw new Exception("Divisao por zero nao e permitida.");
    }
    return dividendo / divisor;
  }

  //Este metodo não pode ser visto por outras classes no projeto
  private void metodoPrivado() {
    //logica e finalidade do metodo
  }

  //alguns equivocos estruturais
  public void validar(){
    //Este metodo deveria retornar algum valor booleano
  }
  public void calcularEnviar(){
    //Este metodo deveria ser dividido em dois metodos distintos
    //um metodo deve representar uma unica responsabilidade
  }
  public void gravarCliente(String nome, String endereco, String telefone, String email, String cpf){
    //Este metodo possui muitos parametros
    //O ideal seria criar uma classe Cliente e passar um objeto Cliente como parametro
  }

  //Exemplos:
  public void gravarCliente(Cliente cliente){
    //logica para gravar cliente
  }
  



}

