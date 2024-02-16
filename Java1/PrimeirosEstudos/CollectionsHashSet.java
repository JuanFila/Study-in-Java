package PrimeirosEstudos;
import java.util.HashSet;
import java.util.Set;

public class CollectionsHashSet {
  public static void main(String[] args) {
    Set<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);

    // tamanho System.out.println(numeros.size());
    // podemos remover com numeros.remove(elemento)
    numeros.remove(12);
    // podemos fazer operações com o HashSet
    for(Integer elemento : numeros){
      System.out.println(elemento);
    }

    //verificando se o item existe na estrutura

    System.out.println(numeros.contains(11)); //true
    System.out.println(numeros.contains(12)); // false
  }
}
