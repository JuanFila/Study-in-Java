package pessoa;

public class Aluno extends Pessoa {
  private String matricula;

  public String getMatriculaa(){
    return matricula;
  }

  public void setMatricula(String matricula){
    this.matricula = matricula;
  }

  String imprimirDadosDaPessoa(){
    System.out.println(super.imprimirDadosDaPessoa());
    return "Você é aluno";
      
   }
}
