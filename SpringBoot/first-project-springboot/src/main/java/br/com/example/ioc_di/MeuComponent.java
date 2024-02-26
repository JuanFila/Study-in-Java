package br.com.example.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponent {
  public String chamarMeuCOMPONENT() {
    return "meu component";
  }
}
