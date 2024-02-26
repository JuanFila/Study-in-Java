package br.com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/home")
public class FirstController {
  
  @GetMapping("/")
  public String FirstMethodo() {
      return "Hellow world";
  }
  // tipos de parametros

  //http://localhost:8080/home/paginas/2
  @GetMapping("/paginas/{id}")
  public String paramIdMethodo(@PathVariable String id) {
      return "O parametro é " + id;
  }

  //http://localhost:8080/home/item?id=2
  @GetMapping("/item")
  public String metodoQuerryParamns(@RequestParam String id) {
    return "O parametro com querry é " + id;
  }

  @GetMapping("/iten")
  public String metodoQuerryParamns2(@RequestParam Map<String, String> parametros ) {
    return "O parametro com querry é " + parametros.entrySet();
  }
  
  //body

  @PostMapping("/home")
  public String postMethodName(@RequestBody User user) {
    return "nome" + user.username();
  }

  @PostMapping("/methodHeader")
  public String HeaderMethod(@RequestHeader("name") String name) {
    return "nome" + name;
  }
  @PostMapping("/methodHeaderList")
  public String HeaderMethodList(@RequestHeader Map<String, String> header) {
    return "list" + header;
  }

  //response entity
  @GetMapping("/entity/{id}")
  public ResponseEntity<Object> mathodResponseEntity(@PathVariable Long id){
    // quando precisar ter mais de um retorno usamos o responseentity e passamos um objeto
    
    var usuario = new User("nome");

    if (id  > 5) {
      return ResponseEntity.status(HttpStatus.OK).body("Deu BOA" + usuario);
      //no status posso usar um http state par aqunado não saber o status a ser usado
    }
    return ResponseEntity.status(400).body("Deu erro");
  }
  
  record User(String username) {} // classe sem getters e setters
}
