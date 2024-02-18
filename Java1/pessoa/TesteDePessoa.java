package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.setCpf("000-000-000-00");
    professor.setIdade(22);
    professor.setNome("JonDoe");
    professor.setSalario(20000);

    System.out.println(professor.imprimirDadosDaPessoa());


    Aluno aluno = new Aluno();
    aluno.setCpf("000-000-000-00");
    aluno.setIdade(22);
    aluno.setNome("JonDoe");
    aluno.setMatricula("202020");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }

}
