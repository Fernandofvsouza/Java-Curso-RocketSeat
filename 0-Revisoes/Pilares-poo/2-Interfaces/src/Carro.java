/*
A interface vai definir um contrato em que a classe deve seguir, ou seja ela vai definir um conjunto de metodos que a classe deve implementar. so que não implementamos apenas definimos a "Caracaça", o nome do metodo, os parametros e o tipo de retorno, mas não implementamos o corpo do metodo, ou seja a logica do metodo. 

 */
public interface Carro{
  void acelerar();
  void frear();
  void parar();
  //Todo carro tem esses comportamentos, então assinamos os metodos mas nao implementamos a logica.
}
