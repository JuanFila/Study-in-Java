package br.project.gestao_vagas.modules.candidate.entitie;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;

  @NotBlank()
  @Pattern(regexp = "\\S+", message = "Remova os espaços")
  private String username;

  @NotBlank()
  @Email(message = "O campo(email) deve conter um e-mail válido")
  private String email;

  @NotBlank()
  @Length(min = 10, max = 100, message = "A senha precisa ter no mínimo (10) caracteres")
  private String password;

  private String description;
  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
