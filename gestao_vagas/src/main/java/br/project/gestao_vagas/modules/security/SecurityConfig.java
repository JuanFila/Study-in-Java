package br.project.gestao_vagas.modules.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // classe de configuração que o spring vai gerenciar
public class SecurityConfig {

  // Criando um metodo para gerenciar as minhas requisições
  @Bean // indica que um metodo dentro da classe de configuração está sendo utilizado
        // para definir um objeto já gerenciado pelo spring
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable()) // DESABILTIANDO O SECURYTI NA APLICAÇÃO PARA CONFIGURAR MANUALMENTE
        .authorizeHttpRequests(auth -> {
          auth.requestMatchers("/candidate/").permitAll()
              .requestMatchers("/company/").permitAll()
              .requestMatchers("/auth/company").permitAll();
          auth.anyRequest().authenticated();

        });
    return http.build();
  }

  @Bean
  PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }

}
