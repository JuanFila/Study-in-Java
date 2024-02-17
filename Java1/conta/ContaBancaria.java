package conta;

public class ContaBancaria {
  private String numero;
  private String titular;
  private double saldo;

  public ContaBancaria() { // Construtor
    saldo = 0.0;   
  }
  //getters setters

  //Setter - setando valor
  public void setNumero(String numero) {
    this.numero = numero;
    // this número é o meu private string numer
    // Que recebe o número como parametro
  }
  public void setTitular(String titular) {
    this.titular = titular;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  //Getters

  public String getNumero(){
    return this.numero;
  } 
  public String getTitular() {
    return titular;
  }
  public double getSaldo() {
    return saldo;
  }


  void depositar(double valor) {
    if(valor > 0){
      saldo = saldo + valor;
      System.out.println("Deposito de R$ " + valor
      + " Saldo atual " + saldo
      );
    } else {
      System.out.println("O  valor de deposito é invalido");
    }
  }

  void sacar (double valor){
    if(valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de R$ "  + valor +
      ". Saldo atual R$ " + saldo
      );
    }
  }
}