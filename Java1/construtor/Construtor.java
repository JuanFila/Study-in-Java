package construtor;

public class Construtor {
  
  private int numero;

  public Construtor(int numero){
    // um construtor precisa ter o mesmo nome da nossa classe
    // um constructor é void por padrão não possui retorno
    // pode ser vazio ou pode receber parametros
    // podemos ter varios construtores dentro de uma classe
    this.numero = numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }

}
