package PrimeirosEstudos;
import java.util.ArrayList;
import java.util.List;

public class DataStructure {
  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Juan");
    nomes.add("JonDoe");
    nomes.add("DoeJon");
    
    // System.out.println(nomes.get(0));

    //for(String nome : nomes) {
    //  System.out.println(nome);
    // }

    //or 

    //nomes.forEach(nome -> System.out.println(nome));
  
    //or 

     nomes.forEach(System.out::println);
  }
}
