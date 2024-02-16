package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.cpf = "000-000-000-00";
    pessoa.idade = 22;
    pessoa.nome = "JonDoe";
  
    System.out.println(pessoa.imprimirDadosDaPessoa());
  }
  
}
