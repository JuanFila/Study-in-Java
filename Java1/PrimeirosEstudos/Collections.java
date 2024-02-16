package PrimeirosEstudos;
import java.util.HashMap;
import java.util.Map;

public class Collections {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Juan", 10);
    notas.put("JonDoe", 3);
    notas.put("DoeJon", 8);
    notas.put("DoeJon", 5);

    //var nota = notas.get("Juan");
    //System.err.println(nota);

    // Coleções como o map trabalham com chave única, ele utiliza sempre a ultima
    // no caso de duas chaves DoeJon ele pega aultimo valor e chave
    // Para usar os 2 teria  que escolher outra coleção para ser usada

    for(Map.Entry<String,Integer> entry : notas.entrySet() ){
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println(value + key);
    }
  }
}
