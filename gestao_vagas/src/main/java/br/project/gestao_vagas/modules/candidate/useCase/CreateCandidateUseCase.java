package br.project.gestao_vagas.modules.candidate.useCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.project.gestao_vagas.exceptions.UserFoundException;
import br.project.gestao_vagas.modules.candidate.entitie.CandidateEntity;
import br.project.gestao_vagas.modules.candidate.repository.CandidateRepository;

@Service
public class CreateCandidateUseCase {

  @Autowired
    private CandidateRepository candidateRepository;

  public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository.
        findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });
        return this.candidateRepository.save(candidateEntity);
  }
}
