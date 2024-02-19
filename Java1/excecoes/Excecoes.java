package excecoes;

import pessoa.Pessoa;

public class Excecoes {
  // Check exceptions (previstas)

 // try {
 //   validarNumero();
 //   
 // } catch (Exception e) {
 //   System.out.println("Deu ruim");
 //   e.printStackTrace();
 // }

  // Unchecked exceptions (Não verificadas)

  public static void main(String[] args) {
    Pessoa p = null;
    p.getCpf();
  }

  public static void validarNumero() throws Exception  {
    int numero = 10;

    if (numero < 100) {
      // exception é mais generica
      throw new Exception("O número é menor que 100");

    }
  }

}