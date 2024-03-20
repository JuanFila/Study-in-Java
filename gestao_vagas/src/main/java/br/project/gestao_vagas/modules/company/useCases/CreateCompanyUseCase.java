package br.project.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.project.gestao_vagas.exceptions.UserFoundException;
import br.project.gestao_vagas.modules.company.entities.CompanyEntity;
import br.project.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service // lOCAL Da nossa regra de negocio
public class CreateCompanyUseCase {
  
  @Autowired // spring vai gerenciar quando o repository vai ser inserido 
  private CompanyRepository companyRepository;
  
  public CompanyEntity execute(CompanyEntity companyEntity) {

    this.companyRepository
    .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
    .ifPresent((user) -> {
      throw new UserFoundException();
    });

    return this.companyRepository.save(companyEntity);
  } 

}
