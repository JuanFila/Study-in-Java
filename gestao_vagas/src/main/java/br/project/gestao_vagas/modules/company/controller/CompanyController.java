package br.project.gestao_vagas.modules.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.project.gestao_vagas.modules.company.entities.CompanyEntity;
import br.project.gestao_vagas.modules.company.useCases.CreateCompanyUseCase;

@RestController //api rest
@RequestMapping("/company")
public class CompanyController {
  
  @Autowired
  private CreateCompanyUseCase createCompanyUseCase;

  @PostMapping("/") 
  public ResponseEntity<Object> create(@RequestBody CompanyEntity companyEntity) {
    try {
      var result = this.createCompanyUseCase.execute(companyEntity);
      return ResponseEntity.ok().body(result);
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
