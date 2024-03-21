package br.project.gestao_vagas.modules.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.project.gestao_vagas.modules.company.dto.AuthCompanyDto;
import br.project.gestao_vagas.modules.company.useCases.AuthCompanyUseCase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthCompanyController {
  
  @Autowired
  private AuthCompanyUseCase authCompanyUseCase;

  @PostMapping("/company")
  public ResponseEntity<Object> create(@RequestBody AuthCompanyDto authCompanyDto) {
      try {
        var result =  this.authCompanyUseCase.execute(authCompanyDto);
        return ResponseEntity.ok().body(result);
      } catch (Exception e) {
        // TODO: handle exception
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
      }
  }
  
}
