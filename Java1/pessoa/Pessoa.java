package pessoa;

public class Pessoa {
  String nome; //atributo
  int idade;
  String cpf;

  String imprimirDadosDaPessoa(){
    return "Nome: "  +  nome + " idade: " + idade +
    " cpf: " + cpf;
  } //metodo
}
