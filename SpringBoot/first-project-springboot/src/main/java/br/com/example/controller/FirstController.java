package br.com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




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
  
  record User(String username) {} // classe sem getters e setters
}
