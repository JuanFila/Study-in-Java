package br.project.gestao_vagas.modules.company.useCases;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.project.gestao_vagas.modules.company.dto.AuthCompanyDto;
import br.project.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class AuthCompanyUseCase {
  
  @Value("${security.token.secret}")
  private String secretKey;

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public String execute(AuthCompanyDto authCompanyDto) throws AuthenticationException{

    var company = this.companyRepository.findByEmail(authCompanyDto.getEmail())
    .orElseThrow(
      () -> {
        throw new UsernameNotFoundException("Username/password incorrect");
      });

      //Verificar a senha são iguais
      var passwordMatchs = this.passwordEncoder.matches(authCompanyDto.getPassword(), company.getPassword()); // matchs vai comparar as senhas
        // se a senha não for igual -> Erro
        if(!passwordMatchs){
          throw new AuthenticationException();
        }
          //Se for igual -> Gera o token 
          Algorithm algorithm = Algorithm.HMAC256(secretKey);
          var token = JWT.create().withIssuer("JAVA")
          .withSubject(company.getId().toString())
          .sign(algorithm);

          return token;
  }

}
